
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.JScrollBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class View {
	//init variables
	Product newProduct = new Product();
	ArrayList cart = new ArrayList();
	ArrayList checkoutList = new ArrayList();
	String cartString = "";
	double total=0;
	int stockCount;

	//init form elements
	JFrame frame;
	ImageIcon icon;
	Image scaledImage;
	
	JTextField nameField;
	JPasswordField passwordField;
	
	JButton logoutButton = new JButton("Logout");
	JButton loginButton = new JButton("Login");
	JLabel passwordLabel = new JLabel("Password");
	JLabel userLabel = new JLabel("Username");
	JButton exitButton = new JButton("Exit");
	JButton viewCartButton = new JButton("View Cart");
	
	JLabel productNameLabel1 = new JLabel("x");
	JLabel imageLabel1 = new JLabel("x");
	JLabel priceLabel1 = new JLabel("x");
	JLabel stockLabel1 = new JLabel("x");
	JLabel descLabel1 = new JLabel("x");
	JButton addCartBtn1 = new JButton("Add to cart");
	
	JLabel productNameLabel2 = new JLabel("x");
	JLabel imageLabel2 = new JLabel("x");
	JLabel priceLabel2 = new JLabel("x");
	JLabel stockLabel2 = new JLabel("x");
	JLabel descLabel2 = new JLabel("x");
	JButton addCartBtn2 = new JButton("Add to cart");
	
	JLabel productNameLabel3 = new JLabel("x");
	JLabel imageLabel3 = new JLabel("x");
	JLabel priceLabel3 = new JLabel("x");
	JLabel stockLabel3 = new JLabel("x");
	JLabel descLabel3 = new JLabel("x");
	JButton addCartBtn3 = new JButton("Add to cart");
	
	JPanel panel = new JPanel();
	JLabel cartLabel = new JLabel("CART");
	JLabel totalLabel = new JLabel("Total :");
	JLabel priceTotal = new JLabel("----");
	JButton checkoutButton = new JButton("CheckOut");
	
	public View() {
		//set styling
		setFrame(new JFrame());
		getFrame().getContentPane().setEnabled(false);
		getFrame().getContentPane().setBackground(Color.LIGHT_GRAY);
		getFrame().setBounds(100, 100, 783, 592);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		userLabel.setBounds(10, 10, 72, 37);
		userLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		passwordLabel.setBounds(268, 14, 77, 28);
		passwordLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		
		nameField = (new JTextField());
		nameField.setBounds(85, 12, 180, 37);
		nameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(335, 12, 180, 37);
		
		logoutButton.setBounds(642, 14, 115, 28);
		logoutButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		logoutButton.setForeground(Color.BLACK);
		logoutButton.setBackground(Color.LIGHT_GRAY);
		
		loginButton.setBounds(525, 14, 115, 28);
		loginButton.setForeground(Color.BLACK);
		loginButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		loginButton.setBackground(Color.LIGHT_GRAY);
		
		exitButton.setBounds(591, 53, 94, 28);
		exitButton.setForeground(Color.BLACK);
		exitButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		exitButton.setBackground(Color.LIGHT_GRAY);
		
		productNameLabel1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		productNameLabel1.setBounds(52, 90, 132, 25);
		
		productNameLabel2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		productNameLabel2.setBounds(294, 90, 135, 25);
		
		productNameLabel3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		productNameLabel3.setBounds(533, 92, 132, 25);
		
		imageLabel1.setIcon(new ImageIcon(View.class.getResource("/images/JK-217_sml.jpg")));
		imageLabel1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		imageLabel1.setBounds(52, 115, 132, 109);
		
		imageLabel2.setIcon(new ImageIcon(View.class.getResource("/images/JK-622_sml.jpg")));
		imageLabel2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		imageLabel2.setBounds(297, 115, 132, 109);
		
		imageLabel3.setIcon(new ImageIcon(View.class.getResource("/images/JK-734_sml.jpg")));
		imageLabel3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		imageLabel3.setBounds(533, 115, 132, 109);
		
		stockLabel1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		stockLabel1.setBounds(123, 265, 108, 25);
		
	    stockLabel2.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    stockLabel2.setBounds(366, 265, 103, 25);
	    
	    stockLabel3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		stockLabel3.setBounds(607, 265, 126, 25);
		
		priceLabel1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		priceLabel1.setBounds(52, 265, 61, 25);
		
		priceLabel2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		priceLabel2.setBounds(297, 265, 59, 25);
		
		priceLabel3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		priceLabel3.setBounds(538, 265, 64, 25);
		
		addCartBtn1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		addCartBtn1.setBounds(58, 305, 126, 21);
		
		addCartBtn2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		addCartBtn2.setBounds(305, 305, 126, 21);
		
		addCartBtn3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		addCartBtn3.setBounds(544, 305, 126, 21);
		
		descLabel1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		descLabel1.setBounds(52, 233, 127, 28);
		
		descLabel2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		descLabel2.setBounds(297, 233, 127, 28);
		
		descLabel3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		descLabel3.setBounds(538, 233, 127, 28);

		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(227, 360, 284, 37);
		
		totalLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		totalLabel.setBounds(26, 454, 74, 28);
		
		priceTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		priceTotal.setBounds(110, 454, 74, 28);
		
		checkoutButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		checkoutButton.setBounds(382, 408, 129, 37);
		
		viewCartButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		viewCartButton.setBounds(227, 408, 129, 37);
		
		//login form section
		frame.getContentPane().add(userLabel);
		frame.getContentPane().add(passwordLabel);
		frame.getContentPane().add(nameField);
		frame.getContentPane().add(passwordField);
		frame.getContentPane().add(loginButton);
		
		frame.getContentPane().add(logoutButton);
		frame.getContentPane().add(exitButton);
		
		//product section
		frame.getContentPane().add(productNameLabel1);
		frame.getContentPane().add(productNameLabel2);
		frame.getContentPane().add(productNameLabel3);
		
		frame.getContentPane().add(priceLabel1);
		frame.getContentPane().add(priceLabel2);
		frame.getContentPane().add(priceLabel3);
		
		frame.getContentPane().add(imageLabel1);
		frame.getContentPane().add(imageLabel2);
		frame.getContentPane().add(imageLabel3);
		
		frame.getContentPane().add(stockLabel1);
		frame.getContentPane().add(stockLabel2);
		frame.getContentPane().add(stockLabel3);
		
		frame.getContentPane().add(descLabel1);
		frame.getContentPane().add(descLabel2);
		frame.getContentPane().add(descLabel3);
		
		frame.getContentPane().add(addCartBtn1);
		frame.getContentPane().add(addCartBtn2);
		frame.getContentPane().add(addCartBtn3);
		
		//cart section
		frame.getContentPane().add(panel);
		panel.add(cartLabel);
		
		cartLabel.setForeground(Color.WHITE);
		cartLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		cartLabel.setVisible(false);
		frame.getContentPane().add(totalLabel);
		frame.getContentPane().add(priceTotal);
		frame.getContentPane().add(viewCartButton);
		frame.getContentPane().add(checkoutButton);
		
		//set default visibilities
		nameField.setVisible(true);
		passwordField.setVisible(true);
		passwordLabel.setVisible(true);
		loginButton.setVisible(true);
		
		logoutButton.setVisible(false);
		exitButton.setVisible(false);
		
		productNameLabel1.setVisible(false);
		productNameLabel2.setVisible(false);
		productNameLabel3.setVisible(false);
		
		priceLabel1.setVisible(false);
		priceLabel2.setVisible(false);
		priceLabel3.setVisible(false);
		
		imageLabel1.setVisible(false);
		imageLabel2.setVisible(false);
		imageLabel3.setVisible(false);
		
		stockLabel1.setVisible(false);
		stockLabel2.setVisible(false);
		stockLabel3.setVisible(false);
		
		descLabel1.setVisible(false);
		descLabel2.setVisible(false);
		descLabel3.setVisible(false);
		
		addCartBtn1.setVisible(false);
		addCartBtn2.setVisible(false);
		addCartBtn3.setVisible(false);
		
		//cart section
		panel.setVisible(false);
		totalLabel.setVisible(false);
		priceTotal.setVisible(false);
		viewCartButton.setVisible(false);
		checkoutButton.setVisible(false);
	}
	
	//custom methods
	public void setLoginState(Boolean boolExists) {
		boolean exists = boolExists;

		if (exists) {
			// hide login elements
			nameField.setVisible(false);
			passwordField.setVisible(false);
			loginButton.setVisible(false);
			passwordLabel.setVisible(false);
			
			// set name
			userLabel.setText(nameField.getText());
			
			//show other elements
			logoutButton.setVisible(true);
			exitButton.setVisible(false);
			
			productNameLabel1.setVisible(true);
			productNameLabel2.setVisible(true);
			productNameLabel3.setVisible(true);
			
			priceLabel1.setVisible(true);
			priceLabel2.setVisible(true);
			priceLabel3.setVisible(true);
			
			imageLabel1.setVisible(true);
			imageLabel2.setVisible(true);
			imageLabel3.setVisible(true);
			
			stockLabel1.setVisible(true);
			stockLabel2.setVisible(true);
			stockLabel3.setVisible(true);
			
			descLabel1.setVisible(true);
			descLabel2.setVisible(true);
			descLabel3.setVisible(true);
			
			addCartBtn1.setVisible(true);
			addCartBtn2.setVisible(true);
			addCartBtn3.setVisible(true);
			
			//cart section
			panel.setVisible(true);
			cartLabel.setVisible(true);
			//priceTotal.setVisible(true);
			//totalLabel.setVisible(true);
			viewCartButton.setVisible(true);
			checkoutButton.setVisible(true);
			
		} else {
			// show error dialog
			JOptionPane.showMessageDialog(loginButton,"Wrong password or username");
		}
	}
	
	public void resetPanel() {
		// set all vals / visibilities to default/login
		cart.clear();
		
		userLabel.setText("Userame");
		passwordLabel.setText("Password");
		nameField.setText("");
		passwordField.setText("");
		
		// show login elements
		nameField.setVisible(true);
		passwordField.setVisible(true);
		loginButton.setVisible(true);
		passwordLabel.setVisible(true);
		
		//hide product / cart elements
		logoutButton.setVisible(false);
		exitButton.setVisible(false);
		
		productNameLabel1.setVisible(false);
		productNameLabel2.setVisible(false);
		productNameLabel3.setVisible(false);
		
		priceLabel1.setVisible(false);
		priceLabel2.setVisible(false);
		priceLabel3.setVisible(false);
		
		imageLabel1.setVisible(false);
		imageLabel2.setVisible(false);
		imageLabel3.setVisible(false);
		
		stockLabel1.setVisible(false);
		stockLabel2.setVisible(false);
		stockLabel3.setVisible(false);
		
		descLabel1.setVisible(false);
		descLabel2.setVisible(false);
		descLabel3.setVisible(false);
		
		addCartBtn1.setVisible(false);
		addCartBtn2.setVisible(false);
		addCartBtn3.setVisible(false);
		
		//cart section
		panel.setVisible(false);
		cartLabel.setVisible(false);
		priceTotal.setVisible(false);
		totalLabel.setVisible(false);
		viewCartButton.setVisible(false);
		checkoutButton.setVisible(false);
	}
	
	//default getters & setters
	public JFrame getFrame() {
		return frame;
	}
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
	//parse values of products passed from controller
	public void setProductList(ArrayList receivedProductList) {
		newProduct = (Product) receivedProductList.get(0);
		productNameLabel1.setText(newProduct.getProductName());
		priceLabel1.setText("$"+String.valueOf(newProduct.getProductPrice()));
		descLabel1.setText(newProduct.getProductDesc());
		if (newProduct.getStockCount() > 0) {
			stockLabel1.setText("In Stock:"+String.valueOf(newProduct.getStockCount()));
			addCartBtn1.setEnabled(true);
		}	
		else
		{
			stockLabel1.setText("Out Of Stock!");
			addCartBtn1.setEnabled(false);
		}
		
		newProduct = (Product) receivedProductList.get(1);
		productNameLabel2.setText(newProduct.getProductName());
		priceLabel2.setText("$"+String.valueOf(newProduct.getProductPrice()));
		descLabel2.setText(newProduct.getProductDesc());
		if (newProduct.getStockCount() > 0) {
			stockLabel2.setText("In Stock:"+String.valueOf(newProduct.getStockCount()));
			addCartBtn2.setEnabled(true);
		}	
		else
		{
			stockLabel2.setText("Out Of Stock!");
			addCartBtn2.setEnabled(false);
		}
		
		newProduct = (Product) receivedProductList.get(2);
		productNameLabel3.setText(newProduct.getProductName());
		priceLabel3.setText("$"+String.valueOf(newProduct.getProductPrice()));
		descLabel3.setText(newProduct.getProductDesc());
		if (newProduct.getStockCount() > 0) {
			stockLabel3.setText("In Stock:"+String.valueOf(newProduct.getStockCount()));
			addCartBtn3.setEnabled(true);
		}	
		else
		{
			stockLabel3.setText("Out Of Stock!");
			addCartBtn3.setEnabled(false);
		}
	}
	
	//add product received from db to cart arraylist
	public void addToCart(Product clickedProduct) {
		System.out.println(clickedProduct);
		if(clickedProduct.getProductName().equals("Hoodie Black")) {
			String removedText = stockLabel1.getText().replace("In Stock:", "");
			stockCount = Integer.parseInt(removedText);
			stockCount = stockCount-1;
			System.out.println("Hoodie Black: "+stockCount);
			if (stockCount > 0) {
				stockLabel1.setText(String.valueOf("In Stock:"+String.valueOf(stockCount)));
				addCartBtn1.setEnabled(true);
			}	
			else
			{
				stockLabel1.setText("Out Of Stock!");
				addCartBtn1.setEnabled(false);
			}
		}
		
		else if(clickedProduct.getProductName().equals("Hoodie Grey")) {
			String removedText = stockLabel2.getText().replace("In Stock:", "");
			stockCount = Integer.parseInt(removedText);
			stockCount = stockCount-1;
			System.out.println("Hoodie Grey: "+stockCount);
			if (stockCount > 0) {
				stockLabel2.setText(String.valueOf("In Stock:"+String.valueOf(stockCount)));
				addCartBtn2.setEnabled(true);
			}	
			else
			{
				stockLabel2.setText("Out Of Stock!");
				addCartBtn2.setEnabled(false);
			}
		}
		
		else if(clickedProduct.getProductName().equals("Hoodie Red")) {
			String removedText = stockLabel3.getText().replace("In Stock:", "");
			stockCount = Integer.parseInt(removedText);
			stockCount = stockCount-1;
			System.out.println("Hoodie Red: "+stockCount);
			if (stockCount > 0) {
				stockLabel3.setText(String.valueOf("In Stock:"+String.valueOf(stockCount)));
				addCartBtn3.setEnabled(true);
			}	
			else
			{
				stockLabel3.setText("Out Of Stock!");
				addCartBtn3.setEnabled(false);
			}
		}
		
		cart.add(clickedProduct);
	}
	
	//print contents of cart arraylist
	public void printCart() {
		//reset vars to prevent duplication
		cartString="";
		total=0;
		
		for (int i = 0; i < cart.size(); i++) {
			newProduct = (Product) (cart.get(i));
			cartString += newProduct.getProductName()+" $"+newProduct.getProductPrice()+"\n";
			total+=newProduct.getProductPrice();
		}
		cartString += "Total: $"+Math.round(total * 100.0) / 100.0;
		
		if (total!=0)
			JOptionPane.showMessageDialog(frame, "Your Order:\n"+cartString);
		else
			JOptionPane.showMessageDialog(frame, "Nothing in Cart!");
	}
	
	//public ArrayList checkout() {
	public ArrayList checkout() {
		//reset vars to prevent duplication
		cartString="";
		total=0;
						
		for (int i = 0; i < cart.size(); i++) {
			newProduct = (Product) (cart.get(i));
			cartString += newProduct.getProductName()+" $"+newProduct.getProductPrice()+"\n";
			total+=newProduct.getProductPrice();
		}
		cartString += "Total: $"+total;
		
		if (total!=0) {
			String[] options = {"Yes", "No"};
	        int x = JOptionPane.showOptionDialog(null, "Your Order:\n"+cartString,
	                "Confirm Purchase?",
	                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	        if(x==0) {
	        	JOptionPane.showMessageDialog(frame, "Order Confirmed!");
	        	System.out.println("cart: "+cart);
	        	for (int i = 0; i < cart.size(); i++) {
	        		checkoutList.add((Product) cart.get(i));
	    		}
	        	cart.clear();
	        	//send order to DB
	        	System.out.println("checkoutList: "+checkoutList);
	        	return checkoutList;
	        }
	        	
	        else
	        	JOptionPane.showMessageDialog(frame, "Order Not Placed!");
		}
		else
			JOptionPane.showMessageDialog(frame, "Nothing in Cart!");
		
		//order not confirmed so return null!
		return null;
	}
}
