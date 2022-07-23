package com.tns.client;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.tns.util.DBUtil;
import java.sql.ResultSet;

public class Client {
	public static void main(String[] args) throws SQLException {
		
		Connection connection =DBUtil.getconnection();
		
		//checking the connection establishment
		if(connection !=null) {
			System.out.println("JDBC: Connection is established");
		}
		
		
		addEmployee();
		GetEmployee();
	}
		//Create Operation
		private static void addEmployee() throws SQLException 
		{
			Connection connection =DBUtil.getconnection();
			Statement stmt = connection.createStatement();
			String sqlinsert = "insert into fiza.employee(id,name,salary,bonus)" + "values(6,'fiza',400,80)";
			int executeupdate = stmt.executeUpdate(sqlinsert);
			if(executeupdate==1) {
				System.out.println("Entry is added");
			}
		}
		//Update Operation
		private static void UpdateEmployee() throws SQLException 
		{
			Connection connection =DBUtil.getconnection();
			Statement stmt = connection.createStatement();
			String sqlupdate = "update emp1 set bonus =100.00 where id=4";
			int executeupdate = stmt.executeUpdate(sqlupdate);
			if(executeupdate==1) {
				System.out.println("Update is successfull");
			}
		}
		//Delete Operation
		private static void DeleteEmployee() throws SQLException 
		{
			Connection connection =DBUtil.getconnection();
			Statement stmt = connection.createStatement();
			String sqldelete = "delete from emp1 where id =4";
			int executeupdate = stmt.executeUpdate(sqldelete);
			if(executeupdate==1) {
				System.out.println("Delete is successfull");
			}
		}
		
		//Retrieve Operation
		private static void GetEmployee() throws SQLException {
			Connection connection =DBUtil.getconnection();
			Statement stmt = connection.createStatement();
			String sqlretrieve="Select * from fiza.employee";
			ResultSet rs = stmt.executeQuery(sqlretrieve);
			while(rs.next()) {
				int id = rs.getInt("id");
				String name= rs.getString("Name");
				Double salary = rs.getDouble("salary");
				Double bonus = rs.getDouble("bonus");
				System.out.println(id+" "+ name + " " + salary + " " + bonus);
			}
			
		}
		//RetrieveById Operation
		private static void RetrieveByIdEmployee() throws SQLException {
		Connection connection = DBUtil.getconnection();
		Statement stmt = connection.createStatement();
		String sqlretrieve = "select * from emp1 where id =3";
		ResultSet rs = stmt.executeQuery(sqlretrieve);
		if(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			Double salary = rs.getDouble("salary");
			Double bonus = rs.getDouble("bonus");
			System.out.println(id + " " + name + " "+ salary +" "+ bonus);
		}
		else {
			System.out.println("Employee is not available with the mentioned ID...");
		}
		}

	}