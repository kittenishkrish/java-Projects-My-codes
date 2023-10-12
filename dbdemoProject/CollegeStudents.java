package dbdemoProject;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Scanner;

public class CollegeStudents {
	
	public static void main(String[] args) throws Exception {

		updateRecords();

	}

	public static void readRecords() throws Exception {

		String url = "jdbc:mysql://localhost:3306/demodb";
		String userName = "root";
		String passWord = "Murali";
		String query = "SELECT * FROM collegestudents";

		Connection con = DriverManager.getConnection(url, userName, passWord);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getBigDecimal(3));
			System.out.println();
		}
		rs.close();
        st.close();
		con.close();
	}
	
	public static void insertRecords() throws Exception {

		String url = "jdbc:mysql://localhost:3306/demodb";
		String userName = "root";
		String passWord = "Murali";
		String query = "insert into collegestudents values (5,'Suriya',9.5)";

		Connection con = DriverManager.getConnection(url, userName, passWord);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		
		System.out.println("numbers of rows affected:" + rows);
		st.close();
		con.close();
		}
	
	public static void insertVar() throws Exception {

		String url = "jdbc:mysql://localhost:3306/demodb";
		String userName = "root";
		String passWord = "Murali";
		
		int id = 6;
		String name = "Kevin";
		double GPA = 9.4;
		
		String query = "insert into collegestudents values (" + id + ",'" + name + "'," + GPA + ")";

		Connection con = DriverManager.getConnection(url, userName, passWord);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		
		System.out.println("numbers of rows affected:" + rows);
		st.close();
		con.close();
		}
	
	public static void insertUsingPst() throws Exception {

		String url = "jdbc:mysql://localhost:3306/demodb";
		String userName = "root";
		String passWord = "Murali";
		
		int id = 8;
		String name = "faisel";
		BigDecimal GPA = new BigDecimal("9.0");
		
		String query = "insert into collegestudents values (?,?,?)";

		Connection con = DriverManager.getConnection(url, userName, passWord);
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setBigDecimal(3, GPA);
		int rows = pst.executeUpdate();
		
		System.out.println("numbers of rows affected:" + rows);
		pst.close();
		con.close();
		}
	
	public static void insertUserValuesUsingPst() throws Exception {

		String url = "jdbc:mysql://localhost:3306/demodb";
		String userName = "root";
		String passWord = "Murali";
		String query = "insert into collegestudents values (?,?,?)";

		Connection con = DriverManager.getConnection(url, userName, passWord);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your ID : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Enter your GPA : ");
		BigDecimal GPA = sc.nextBigDecimal();
		
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setBigDecimal(3, GPA);
		int rows = pst.executeUpdate();
		
		System.out.println("numbers of rows affected:" + rows);
		sc.close();
		pst.close();
		con.close();
		}
	
	public static void deleteRecords() throws Exception {

		String url = "jdbc:mysql://localhost:3306/demodb";
		String userName = "root";
		String passWord = "Murali";
		
		int id = 10;
		String query = "delete from collegestudents where ID = " + id;

		Connection con = DriverManager.getConnection(url, userName, passWord);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		
		System.out.println("numbers of rows affected:" + rows);
		st.close();
		con.close();
		}
	
	public static void updateRecords() throws Exception {

		String url = "jdbc:mysql://localhost:3306/demodb";
		String userName = "root";
		String passWord = "Murali";
		
		String query = "update collegestudents set GPA =8.5 where ID = 2";

		Connection con = DriverManager.getConnection(url, userName, passWord);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		
		System.out.println("numbers of rows affected:" + rows);
		st.close();
		con.close();
		}
	

}
