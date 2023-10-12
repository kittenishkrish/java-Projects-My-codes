package dbdemoProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDatabaseExample {

	private static final String url = "jdbc:mysql://localhost:3306/demodb";
	private static final String userName = "root";
	private static final String password = "Murali";

	public static void main(String[] args) throws Throwable {
		try {
			Connection connection = DriverManager.getConnection(url, userName, password);

			InsertStudentWithScanner(connection);
			retrieveStudents(connection);
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void InsertStudentWithScanner(Connection connection) throws Exception {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter student ID: ");
	        int studentID = sc.nextInt();

	        sc.nextLine(); 

	        System.out.print("Enter first name: ");
	        String firstName = sc.nextLine();

	        System.out.print("Enter last name: ");
	        String lastName = sc.nextLine();

	        System.out.print("Enter date of birth (YYYY-MM-DD): ");
	        String dateOfBirth = sc.nextLine();

	        System.out.print("Enter grade: ");
	        String grade = sc.nextLine();
	        
	        String insertSQL = "INSERT INTO student (studentID, Firstname, Lastname, DateOfBirth, Grade) VALUES (?, ?, ?, ?, ?)";
	        PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
	        preparedStatement.setInt(1, studentID);
	        preparedStatement.setString(2, firstName);
	        preparedStatement.setString(3, lastName);
	        preparedStatement.setString(4, dateOfBirth);
	        preparedStatement.setString(5, grade);
	        int rowsAffected = preparedStatement.executeUpdate();
	        System.out.println("numbers of rows affected:" + rowsAffected);
	        preparedStatement.close();
	        connection.close();
	        sc.close();
	    }


	private static void retrieveStudents(Connection connection) throws SQLException {
		String selectSQL = "SELECT * FROM student";

		try (PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
				ResultSet resultSet = preparedStatement.executeQuery()) {

			System.out.println("Student Records:");
			while (resultSet.next()) {
				int studentID = resultSet.getInt("studentID");
				String firstName = resultSet.getString("Firstname");
				String lastName = resultSet.getString("Lastame");
				String dateOfBirth = resultSet.getString("DateOfBirth");
				String grade = resultSet.getString("Grade");

				System.out.println("ID: " + studentID + ", Name: " + firstName + " " + lastName + ", Date of Birth: "
						+ dateOfBirth + ", Grade: " + grade);
			}
		}
	}
}
