
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class DatabaseModel {
		private Statement stmt;
		private ResultSet rs;
		private Connection conn;
		private boolean loggedIn = false;
		private String results = "";

		public DatabaseModel(String username, String password)
		{
			try {
			    Class.forName("com.mysql.cj.jdbc.Driver");
			} 
			catch (ClassNotFoundException e) {
			    e.printStackTrace();
			}
			try {
				String url = "jdbc:mysql://localhost:3306/store";
				this.conn = DriverManager.getConnection(url,username,password);
				this.stmt = conn.createStatement();
				this.rs = null;
				this.loggedIn = true;
			} catch (SQLException e) {
				e.printStackTrace();
		}
	}
	
	public boolean getLoggedIn() {
		return this.loggedIn;
	}
	
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	
	public boolean checkPlayer(String userName, String password) {
		boolean exists = false;
		System.out.println("looking for user:"+userName+" "+password);
		try {
			this.stmt = conn.createStatement();
			
			String query = "SELECT * FROM users WHERE user_name LIKE '"+userName+"';";
			try (Statement stmt = conn.createStatement()) {
			     ResultSet rs = stmt.executeQuery(query);
			     while (rs.next()) {
			    	 if(rs.getString("user_name")==userName);
			    	 {
			    		 String s = rs.getString("salt");
			    		 byte[] salt = s.getBytes();
			    		 String stored_hpw = rs.getString("user_password");
			    		 MessageDigest md = MessageDigest.getInstance("SHA-256");
			    		 md.update(salt);
			    		 
			    		 byte[] hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));
			    		 hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));
			    		 String hpw = Arrays.toString(hashedPassword);
			    		 
			    		 if(hpw.equals("["+stored_hpw+"]")) {
			    			exists = true;
			    		 	System.out.println("existing user:"+userName);
			    		 }

			    		 else
			    			System.out.println("could not find user!");
			    	 }
				}
			}
				/* new user
				if (!exists) {
					System.out.println("new player:"+playerName+" "+catchphrase);
					SecureRandom r = new SecureRandom();
					byte[] salt = new byte[16];
					r.nextBytes(salt);
					MessageDigest md = MessageDigest.getInstance("SHA-256");
					md.update(salt);
					byte[] hashedPassword = md.digest(catchphrase.getBytes(StandardCharsets.UTF_8));
					hashedPassword = md.digest(catchphrase.getBytes(StandardCharsets.UTF_8));
					String s = Arrays.toString(salt);
					String hpw = Arrays.toString(hashedPassword);
					//System.out.println("hpw:"+hpw);
					
					query = "INSERT INTO players (player_name, salt, catchphrase, clicks) VALUES('"+playerName+"','"+s+"','"+hpw+"','0');";
					try (Statement stmt = conn.createStatement()) {
						 stmt.executeUpdate(query);
					}
				}
				*/
			} catch (SQLException | NoSuchAlgorithmException e) {
				e.printStackTrace();	
			}
			return exists;
	}
}
