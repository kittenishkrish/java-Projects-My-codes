package swingExample;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class LabelExample {

	public static void main(String[] args) {

		// JLabel = a GUI display area for a string of text, an image, or both
		
		ImageIcon image = new ImageIcon("images.png");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		JLabel label = new JLabel(); 
		label.setText("Welcome To VR Voyage");
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
		label.setBounds(100, 100, 250, 250); 
			
		JFrame frame = new JFrame();
		ImageIcon image1= new ImageIcon("images.png");
        frame.setIconImage(image1.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);	 
		frame.add(label);
		//frame.pack();
		
		//create a label
		//set text of label
		//set text LEFT,CENTER, RIGHT of image icon
		//set text TOP,CENTER, BOTTOM of image icon
		//set font of text
		//set gap of text to image
		//set background color
		//display background color
		//sets border of label (not image+text)
		//set vertical position of icon+text within label
		//set horizontal position of icon+text within label
		//set x,y position within frame as well as dimensions
		
	}
}

