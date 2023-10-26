package swingExample;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Color;

public class Frames {

	public static void main(String[] args) {
		
	  /*  Border border = BorderFactory.createLineBorder(Color.green, 3);
	    JLabel label = new JLabel();
		label.setText("Bro, do you even code?");
		label.setForeground(Color.GREEN);
		label.setBorder(border);
		JFrame frame = new JFrame();
		frame.setTitle("Voyage");
		ImageIcon image = new ImageIcon("images.png");
		frame.setIconImage(image.getImage());
		frame.setSize(420,420);
	    frame.setResizable(true);
	    frame.getContentPane().setBackground(new Color (0x123456));
	    frame.setVisible(true);*/
		
		JLabel label = new JLabel("Suriya");
        label.setForeground(Color.GREEN);
        label.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));

        // Create a JFrame
        JFrame frame = new JFrame("Voyage");
        ImageIcon image = new ImageIcon("images.png");
        frame.setIconImage(image.getImage());
        frame.setSize(420, 420);
        frame.setResizable(true);
        frame.getContentPane().setBackground(new Color(0x123456));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);

        // Make the frame visible
        frame.setVisible(true);
		  
	}

}
