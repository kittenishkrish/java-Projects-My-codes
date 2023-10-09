package dbdemoProject;

import java.sql.*;

class DBconn {
	String url = "jdbc:mysql://localhost:3306/demodb";
	String userName = "root";
	String password = "Murali";

	void readDB() throws Exception {
		String q1 = "select * from Employee";
		Connection con = DriverManager.getConnection(url, userName, password);
		PreparedStatement ps = con.prepareStatement(q1);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.print(rs.getString(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getDate(3));
			System.out.print("\t" + rs.getString(4));
			System.out.print("\t" + rs.getInt(5));
			System.out.println();
		}
	}

	void insertDB() throws Exception {
		String q1 = "insert into Employee (Name, JoinDate, Experience, Salary) values (?, ?, ?, ?)";
		Connection con = DriverManager.getConnection(url, userName, password);
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

		String q1 = "update Employee set salary=? where EmpID = ?";
		Connection con = DriverManager.getConnection(url, userName, password);
		PreparedStatement ps = con.prepareStatement(q1);
		ps.setInt(1, 20000);
		ps.setString(2, "ST_1819");
		int n = ps.executeUpdate();
		System.out.println(n + " rows updated");

	}

	void deleteDB() throws Exception {

		String q1 = "delete from Employee where Empid = ?";
		Connection con = DriverManager.getConnection(url, userName, password);
		PreparedStatement ps = con.prepareStatement(q1);
		ps.setString(1, "ST_1822");
		int n = ps.executeUpdate();
		System.out.println(n + " rows Deleted");

	}

	public class DBdemo {
		public static void main(String[] args) throws Exception {

			DBconn d = new DBconn();
			//d.insertDB();
			d.updateDB();
			d.deleteDB();
			d.readDB();
		}

	}

}
