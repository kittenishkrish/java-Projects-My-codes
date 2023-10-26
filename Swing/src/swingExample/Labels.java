package swingExample;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Labels {

	 public static void main(String[] args) {

		ImageIcon image = new ImageIcon("images.png");
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		JLabel label = new JLabel("Bro, do you even code?", image, JLabel.CENTER);
		label.setVerticalTextPosition((JLabel.BOTTOM));
		label.setHorizontalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0x00FF00));
		label.setFont(new Font("MV Boil", Font.PLAIN, 20));
		label.setIconTextGap((-25));
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setBorder(border);
		
		JFrame frame = new JFrame("Swing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.add(label);
		frame.setVisible(true);
		frame.add(label);

	}

}
