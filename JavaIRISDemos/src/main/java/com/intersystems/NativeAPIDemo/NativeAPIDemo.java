package com.intersystems.NativeAPIDemo;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.intersystems.jdbc.IRIS;
import com.intersystems.jdbc.IRISConnection;

public class NativeAPIDemo {
	
	public static void main(String[] args) {
		
		try {
			// open connection to InterSystems IRIS instance using connection string 
			IRISConnection conn = (IRISConnection) DriverManager.getConnection 	("jdbc:IRIS://192.168.113.170:51773/JAVATEST","SuperUser","SYS"); 

			// create IRIS Native object 
			IRIS iris = IRIS.createIRIS(conn);
			System.out.println("[1. Setting and getting a global]"); 

			// setting and getting a global 
			// ObjectScript equivalent: set ^testglobal("1") = 8888 
			iris.set(8888,"^testglobal","1"); 
			// ObjectScript equivalent: set globalValue = $get(^testglobal("1")) 
			Integer globalValue = iris.getInteger("^testglobal","1"); 
			System.out.println("The value of ^testglobal(1) is " + globalValue); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 

	}
	
}
