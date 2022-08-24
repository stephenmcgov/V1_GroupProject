import java.awt.EventQueue;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		LoginView loginGUI = new LoginView();
		DatabaseModel DB = new DatabaseModel("root","root");
		LoginController loginController = new LoginController(loginGUI, DB);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginGUI.getFrame().setVisible(true);
					System.out.println("running...");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
