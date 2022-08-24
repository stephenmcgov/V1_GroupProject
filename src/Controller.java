import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Controller {
	private View GUI;
	private Model DB;
	private Product clickedProduct;
	ArrayList receivedProductList = new ArrayList();

	public Controller(View GUI, Model DB) {
		//--ACTION LISTENERS
		//submit login
		GUI.loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//enter name/password -> unlock/show
				boolean boolExists = DB.checkUser(GUI.nameField.getText(), GUI.passwordField.getText());
				//boolean boolExists = true;
				GUI.setLoginState(boolExists);
				
				//send products received from db to gui
				receivedProductList = DB.getProductList();
				GUI.setProductList(receivedProductList);
				//clear list to prevent duplication buildups
				receivedProductList.clear();
			}
		});

		//reset button
		GUI.logoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI.resetPanel();
			}
		});
		
		//add to cart buttons
		GUI.addCartBtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickedProduct = DB.getProduct(GUI.productNameLabel1.getText());
				//System.out.println(clickedProduct);
				GUI.addToCart(clickedProduct);
			}
		});
		
		GUI.addCartBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickedProduct = DB.getProduct(GUI.productNameLabel2.getText());
				//System.out.println(clickedProduct);
				GUI.addToCart(clickedProduct);
			}
		});
		
		GUI.addCartBtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickedProduct = DB.getProduct(GUI.productNameLabel3.getText());
				//System.out.println(clickedProduct);
				GUI.addToCart(clickedProduct);
			}
		});
		
		//view cart button
		GUI.viewCartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI.printCart();
			}
		});
		
		//checkout button
		GUI.checkoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI.checkout();
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
