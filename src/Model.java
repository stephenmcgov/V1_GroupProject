
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
import java.util.ArrayList;
import java.util.Arrays;

public class Model {
		private Statement stmt;
		private ResultSet rs;
		private Connection conn;
		private boolean loggedIn = false;
		private String results = "";
		Product newProduct;
		ArrayList productList = new ArrayList();
		String productName;
		int newQty;

		public Model(String username, String password)
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
	
	public boolean checkUser(String userName, String password) {
		boolean exists = false;
		System.out.println("looking for user: "+userName+" "+password);

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
			    		System.out.println("existing user: "+userName);
			    	}

			    	else
			    		System.out.println("could not find user!");
			    }
			}

			/* new user
			if (!exists) {
				System.out.println("new user:"+userName+" "+password);
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
					
				query = "INSERT INTO players (user_name, salt, password) VALUES('"+userName+"','"+s+"','"+hpw+"','0');";
				try (Statement stmt = conn.createStatement()) {
					stmt.executeUpdate(query);
				}
			}*/
		} catch (SQLException | NoSuchAlgorithmException e) {
			e.printStackTrace();	
		}
		return exists;
	}
	
	public Product getProduct(String productName) {
		System.out.println("adding product: "+productName);

		String query = "SELECT * FROM products WHERE product_name LIKE '"+productName+"';";
		try (Statement stmt = conn.createStatement()) {
			 ResultSet rs = stmt.executeQuery(query);
			 while (rs.next()) {			    	 
				 newProduct = new Product(rs.getString("product_name"), rs.getString("product_desc"), rs.getDouble("product_price"), rs.getInt("stock_count"), rs.getString("image_link"));
			    //System.out.println(results);
			    //results = "";
			 }
		} catch (SQLException e) {
			e.printStackTrace();	
		}
		return newProduct;
	}
	
	public ArrayList getProductList() {
		System.out.println("building product list...");

		String query = "SELECT * FROM products;";
		try (Statement stmt = conn.createStatement()) {
			 ResultSet rs = stmt.executeQuery(query);
			 while (rs.next()) {
				 Product newProduct = new Product(rs.getString("product_name"), rs.getString("product_desc"), rs.getDouble("product_price"), rs.getInt("stock_count"), rs.getString("image_link"));
				 productList.add(newProduct);
			  	//System.out.println(results);
				 //results = "";
			 }
		} catch (SQLException e) {
			e.printStackTrace();	
		}
		return productList;
	}
	
	public void updateStockCount(ArrayList receivedCheckoutList) throws SQLException
    {
		System.out.println("sending order...");
		System.out.println(receivedCheckoutList);
		try (Statement stmt = conn.createStatement()) {
			for (int i = 0; i < receivedCheckoutList.size(); i++) {
				newProduct = (Product) receivedCheckoutList.get(i);
        		productName = newProduct.getProductName();
        		
        		String query = "SELECT * FROM products where product_name LIKE '"+productName+"';";
    			ResultSet rs = stmt.executeQuery(query);
    			while (rs.next()) {
    				newQty=rs.getInt("stock_count")-1;
                    query = "UPDATE products SET stock_count = '" + newQty + "' WHERE product_name = '" +productName+"';";
                    Statement stmt2 = conn.createStatement();
                    stmt2.executeUpdate(query);
    			}
    		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
	
	public String getOrderList() {
	    System.out.println("looking for orders...");

	    String query = "SELECT * FROM orders";
	    try (Statement stmt = conn.createStatement()) {
	         ResultSet rs = stmt.executeQuery(query);
	         while (rs.next()) {
	             results += rs.getString("purchase_id");
	             results += rs.getString("cid");
	             results += rs.getString("pid");
	                
	             System.out.println(results);
	             results = "";
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return results;
	}
}
