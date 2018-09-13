package com.example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connectionmainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@csjn23.csjn.gov.ar:1521:TEST23";
		String user = "contableprueba";
		String pass = "ContP$2014";
		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();

			String query = "SELECT * FROM EMPLOYEE";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int empID = rs.getInt("ID");
				String username = rs.getString("USERNAME");
				String password = rs.getString("PASSWORD");

				System.out.println("Employee's ID: " + empID + "\n"
						+ "UserName: " + username + "\n" + "Password: "
						+ password + ".");
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("SQL Exception: " + e);
		}

	}

}
