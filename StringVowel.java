package Chaithra;

import java.util.Scanner;

public class StringVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");//or String name.toLowecase();
		String name=sc.next();
		int count=0;
		for (int i = 0; i < name.length(); i++) {
			if(name.charAt(i)=='A'||name.charAt(i)=='a'||name.charAt(i)=='e'||
					name.charAt(i)=='E'||name.charAt(i)=='I'||name.charAt(i)=='i'||
					name.charAt(i)=='o'||name.charAt(i)=='O'||name.charAt(i)=='U'||
					name.charAt(i)=='u')
				count++;
		}
				System.out.println(count);
		}
	

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class Createdata {

		public static void main(String[] args) throws SQLException, ClassNotFoundException {
			// TODO Auto-generated method stub
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql:localhost:3306","root","root");
				System.out.println("Connection established");
			Statement statement = connection.createStatement();
			statement.execute("Create database Chaithra");
			System.out.println("database is created");
					
		
		}

	}

