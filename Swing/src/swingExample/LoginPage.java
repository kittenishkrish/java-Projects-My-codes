package swingExample;

import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class LoginPage {

	public static void main(String[] args) {

		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(77, 184, 197));
		frame.setLayout(null);
		frame.setTitle("Voyage");

		
		JLabel label = new JLabel("Welcome To VR Voyage"); 
		ImageIcon image = new ImageIcon("images.png");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); 
		label.setVerticalTextPosition(JLabel.TOP); 
		label.setForeground(new Color(0x00FF00)); 
		label.setFont(new Font("Roboto",Font.PLAIN,20)); 
		label.setIconTextGap(20);
		label.setBackground(Color.black); 
		label.setOpaque(true); 
		label.setBorder(border); 
		label.setVerticalAlignment(JLabel.CENTER); 
		label.setHorizontalAlignment(JLabel.CENTER); 
		label.setBounds(100, 20, 250, 250); 
		
		
		Label U = new Label("Username");
		TextField t = new TextField();
		Label p = new Label("Password");
		TextField t1 = new TextField();
		Button b = new Button("Submit");
		
		label.setBounds(100, 20, 250, 250); 
		U.setBounds(20, 300, 80, 30);
		t.setBounds(100, 300, 200, 30);
		p.setBounds(20, 340, 80, 30);
		t1.setBounds(100, 340, 200, 30);
		b.setBounds(20, 380, 80, 30);
		
		frame.add(label);
		frame.add(U);
		frame.add(p);
		frame.add(b);
		frame.add(t1);
		frame.add(t);

		frame.setVisible(true);
		
			
	}

}
