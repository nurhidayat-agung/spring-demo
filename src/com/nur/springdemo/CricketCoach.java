package com.nur.springdemo;

import com.nur.springdemo.didemo.interfaces.IFortuneService;

public class CricketCoach implements Coach{

	private IFortuneService service;
	
	// create a no arggs contructor
	public CricketCoach()
	{
		System.out.println("Constructor");
	}
	
	// setter method will call by spring inject dependecy
	public void setService(IFortuneService service) {
		System.out.println("setter method");
		this.service = service;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return service.getFortune() + " from cricket coach";
	} 

}
