package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.xdevapi.Statement;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcUrl= "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
		String user="hbstudent";
		String pass="hbstudent";
		try {
			System.out.println("Connecting to ddatabase"+jdbcUrl);
			Connection con= DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Successfull connection");
//			Statement s= con.createStatement("select * from student");
//			ResultSet result=s.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
