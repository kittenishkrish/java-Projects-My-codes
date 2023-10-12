package dbdemoProject;

import java.sql.*;

public class employee {
	public static void main(String[] args) throws Exception {
	
		employee d = new employee();
		//d.insertDB();
		//d.updateDB();
		//d.deleteDB();
		d.readDB();
	}

	 void readDB() throws Exception {
	    String url = "jdbc:mysql://localhost:3306/demodb";
		String userName = "root";
		String passWord = "Murali";
		
		String q1 = "select * from employee";
		
		Connection con = DriverManager.getConnection(url, userName, passWord);
		Statement ps = con.createStatement();
		ResultSet rs = ps.executeQuery(q1);

		while (rs.next()) {
			System.out.print(rs.getString(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getDate(3));
			System.out.print("\t" + rs.getString(4));
			System.out.print("\t" + rs.getInt(5));
			System.out.println();
		}
		rs.close();
		ps.close();
		con.close();
	 }
	void insertDB() throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/demodb";
		String userName = "root";
		String passWord = "Murali";
		
		String q1 = "insert into Employee (Name, JoinDate, Experience, Salary) values (?, ?, ?, ?)";
		Connection con = DriverManager.getConnection(url, userName, passWord);
		PreparedStatement ps = con.prepareStatement(q1, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, "Kevin");
		java.sql.Date date = java.sql.Date.valueOf("2023-09-06");
		ps.setDate(2, date);
		ps.setString(3, "1 month");
		ps.setInt(4, 18000);
		int n = ps.executeUpdate();
		ResultSet generatedKeys = ps.getGeneratedKeys();
		if (generatedKeys.next()) {
			int generatedEmpID = generatedKeys.getInt(1);
			System.out.println("Inserted with EmpID: " + generatedEmpID);
		}

		System.out.println(n + " rows updated");
	}

	void updateDB() throws Exception {


		String url = "jdbc:mysql://localhost:3306/demodb";
		String userName = "root";
		String passWord = "Murali";
		
		String q1 = "update Employee set salary=? where EmpID = ?";
		Connection con = DriverManager.getConnection(url, userName, passWord);
		PreparedStatement ps = con.prepareStatement(q1);
		ps.setInt(1, 20000);
		ps.setString(2, "ST_1819");
		int n = ps.executeUpdate();
		System.out.println(n + " rows updated");

	}

	void deleteDB() throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/demodb";
		String userName = "root";
		String passWord = "Murali";

		String q1 = "delete from Employee where Empid = ?";
		Connection con = DriverManager.getConnection(url, userName, passWord);
		PreparedStatement ps = con.prepareStatement(q1);
		ps.setString(1, "ST_1822");
		int n = ps.executeUpdate();
		System.out.println(n + " rows Deleted");

	}

	

}
