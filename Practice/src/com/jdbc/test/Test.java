package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class Test {

	public void insertdata(int id, String firstname, String lastname) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empoolyee", "root", "data");
			Statement st = con.createStatement();
			String sql = "insert into empoolyee.emp values(" + id + "," + "'" + firstname + "'" + "," + "'" + lastname
					+ "'" + ")";
			System.out.println(sql);
			st.executeUpdate(sql);
			System.out.println("updated");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getbyid(int id) {
		try {
			System.out.println("id details");
			System.out.println(" loading driver class");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(" estblishing  connection");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empoolyee", "root", "data");
			Statement st = conn.createStatement();
			String sql = "select * from empoolyee.emp where id=" + id;
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			conn.close();
			rs.close();
			st.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getallrecords() {
		try {
			System.out.println(" loading driver class");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(" estblishing  connection");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empoolyee", "root", "data");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from empoolyee.emp");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));

			}
			conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		Test t = new Test();
		t.insertdata(7, "java", "sql");
		System.out.println();
		t.getbyid(7);
		System.out.println(" Get All Details");
		t.getallrecords();

	}

}
