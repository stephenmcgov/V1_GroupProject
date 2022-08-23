import java.awt.EventQueue;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LoginGUIView loginGUI = new LoginGUIView();
		DatabaseModel DB = new DatabaseModel("root","Empire@1");
		LoginController loginController = new LoginController(loginGUI, DB);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginGUI.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
