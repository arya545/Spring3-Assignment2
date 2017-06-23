package com.acad.spring3Assignment2;

import java.io.IOException;

//This is the main class

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextMain {
	
	
	public static void main(String args[])
	{
		//Initializing applicationcontext
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//getting bean object of country class
		Country countryObj=(Country) applicationContext.getBean("country");
		//from country object we are calling capital class bean object to get capital Name
		System.out.println("Capital Name "+countryObj.getCapitalName("capital"));
	}

}
