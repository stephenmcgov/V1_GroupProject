import java.awt.EventQueue;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		View loginGUI = new View();
		Model DB = new Model("root","root");
		Controller loginController = new Controller(loginGUI, DB);
		
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
