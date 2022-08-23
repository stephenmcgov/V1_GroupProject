import java.awt.EventQueue;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		LoginGUIView loginGUI = new LoginGUIView();
		DatabaseModel DB = new DatabaseModel("root","Empire@1");
=======
		LoginView loginGUI = new LoginView();
		DatabaseModel DB = new DatabaseModel("root","root");
>>>>>>> 5b151b61f37bfeaacf8ccad8ff2a0de53877ca74
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
