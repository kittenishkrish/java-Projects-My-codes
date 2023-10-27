package swingExample;

import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.Border;

public class LoginPage {

	public static void main(String[] args) {

		Border border = BorderFactory.createLineBorder(Color.red,3);
		
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(4, 200, 249));
		frame.setLayout(null);
		frame.setTitle("Voyage");
		frame.setResizable(false);

		
		JLabel label = new JLabel("Welcome To VR Voyage"); 
		ImageIcon image = new ImageIcon("images.png");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); 
		label.setVerticalTextPosition(JLabel.TOP); 
		label.setForeground(new Color(6, 6, 6)); 
		label.setFont(new Font("Roboto",Font.PLAIN,20)); 
		label.setIconTextGap(20);
		label.setBackground(new Color (6, 133, 161));
		label.setOpaque(true); 
		label.setBorder(border); 
		label.setVerticalAlignment(JLabel.CENTER); 
		label.setHorizontalAlignment(JLabel.CENTER); 
		label.setBounds(60, 20, 50, 50); 
		
		JButton button =  new JButton("Submit");
		Label username = new Label("Username");
		TextField textarea = new TextField();
		Label password = new Label("Password");
		TextField textarea1 = new TextField();
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setForeground(Color.green);
		button.setFocusable(false);
		JButton button1 =  new JButton("Cancel");
		//Button b = new Button("Submit");
		
		label.setBounds(100, 20, 250, 250); 
		username.setBounds(20, 300, 80, 30);
		textarea.setBounds(100, 300, 200, 30);
		password.setBounds(20, 340, 80, 30);
		textarea1.setBounds(100, 340, 200, 30);
		button.setBounds(120, 400, 80, 30);
		button1.setBounds(20, 400, 80, 30);
		button1.setForeground(Color.red);
		button1.setFocusable(false);
		
		frame.add(label);
		frame.add(username);
		frame.add(password);
		frame.add(button);
		frame.add(textarea);
		frame.add(textarea1);
		frame.add(button1);
		frame.setVisible(true);
	
	}
}
