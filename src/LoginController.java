import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class LoginController {
	private LoginGUIView GUI;
	private DatabaseModel DB;

	public LoginController(LoginGUIView GUI, DatabaseModel DB) {
		//--ACTION LISTENERS
		//submit login
		GUI.submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//enter name/password -> unlock/show
<<<<<<< HEAD
				if (!GUI.nameField.getText().isEmpty()) {
					boolean boolExists = DB.checkUser(GUI.nameField.getText(), GUI.passwordField.getText());
					GUI.setLoginState(boolExists);
				}
			}
		});
		
=======
				boolean boolExists = DB.checkPlayer(GUI.nameField.getText(), GUI.passwordField.getText());
				GUI.setLoginState(boolExists);
			}
		});
				
>>>>>>> 5b151b61f37bfeaacf8ccad8ff2a0de53877ca74
		//reset button
		GUI.resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI.resetPanel();
			}
		});
		
		//quit button
		GUI.exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}	

}
