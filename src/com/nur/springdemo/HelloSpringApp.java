package com.nur.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("configFile/applicationContext.xml");
		
		// retrieve bean from spring container
		// constructor injection
		Coach theCoach = context.getBean("myCoach2", Coach.class);
		Coach theCoach2 = context.getBean("myCoach", Coach.class);
		
		// call method from fortune service
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach2.getDailyFortune());
		
		
		CricketCoach trackCoach = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println(trackCoach.getDailyFortune());
		System.out.println(trackCoach.getEmailAddress());
		System.out.println(trackCoach.getTeam());
		
		
		// close the context
		context.close();
	}

}
