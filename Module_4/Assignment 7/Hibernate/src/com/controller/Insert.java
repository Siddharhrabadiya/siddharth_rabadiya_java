package com.controller;

import java.util.Scanner;

import com.dao.Dao;
import com.model.Info;

public class Insert
{
	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Your First Name");
		String fname = sc.next();
		
		System.out.println("Enter Your Last Name");
		String lname = sc.next();
		
		System.out.println("Enter Your email");
		String email = sc.next();
		
		System.out.println("Enter Your  mobile");
		String mobile = sc.next() ;
		
		System.out.println("Enter Your  password");
		String password = sc.next() ;
		
		
		System.out.println("Enter Your gender");
		String gender = sc.next();
		
		Info i =new Info();
		i.setFirstname(fname);
		i.setLastname(lname);
		i.setEmail(email);
		i.setMobile(mobile);
		i.setPassword(password);
		i.setGender(gender);
		
		
		new Dao().InsertData(i);
		
		
	}

}
