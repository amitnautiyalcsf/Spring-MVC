package com.ITC.service;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Service;



@Service
public class LoginService 
{
	public boolean check(String uname, String pass)
	{
		String url="jdbc:mysql://localhost:3306/login";
		String u="root";
		String p="manu";
		
		
		
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("url","u","p");
			PreparedStatement pst =con.prepareStatement("select * from loginData where user=? and password=?");
			pst.setString(1, uname);
			pst.setString(2, pass);
			
			ResultSet rs= pst.executeQuery();
			
			if(rs.next())
			{
				
				return true;
				
			}
			
		}
		
		catch(Exception e)
		{
			
			System.out.println(e);
			
		}
		
		return false;
		
	}

}
