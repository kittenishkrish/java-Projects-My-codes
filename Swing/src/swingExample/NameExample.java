package swingExample;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NameExample {
	public static void main(String[] args) {

		Border border = BorderFactory.createLineBorder(Color.red, 3);
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
		label.setFont(new Font("Roboto", Font.PLAIN, 20));
		label.setIconTextGap(20);
		label.setBackground(new Color(6, 133, 161));
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(60, 20, 50, 50);

		JButton button = new JButton("Submit");
		Label username = new Label("Username");
		TextField textarea = new TextField();
		Label password = new Label("Password");
		TextField textarea1 = new TextField();
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setForeground(Color.green);
		button.setFocusable(false);
		JButton button1 = new JButton("Cancel");
		// Button b = new Button("Submit");

		JTextField usernameField = new JTextField();
		JPasswordField passwordField = new JPasswordField();
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
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				char[] passwordChars = passwordField.getPassword();
				String password = new String(passwordChars);

				// Replace with your database details
				String dbUrl = "jdbc:mysql://localhost:3306/demodb";
				String dbUser = "root";
				String dbPassword = "Murali";

				try {
					Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

					String query = "SELECT * FROM users WHERE username = ? AND password = ?";
					PreparedStatement preparedStatement = connection.prepareStatement(query);
					preparedStatement.setString(1, username);
					preparedStatement.setString(2, password);

					ResultSet resultSet = preparedStatement.executeQuery();

					if (resultSet.next()) {
						// Successful login
						JOptionPane.showMessageDialog(frame, "Login successful");
					} else {
						// Login failed
						JOptionPane.showMessageDialog(frame, "Login failed. Please check your credentials.");
					}

					resultSet.close();
					preparedStatement.close();
					connection.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
					JOptionPane.showMessageDialog(frame, "Database error: " + ex.getMessage());
				}
			}
		});

		// ... Rest of your UI setup and frame visibility ...
	}
}
