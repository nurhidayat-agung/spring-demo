package com.nur.springdemo;

import com.nur.springdemo.didemo.interfaces.IFortuneService;

public class BaseBallCoach implements Coach{

	// define a private field for the dependency
	private IFortuneService fortuneService;
	
	// define constructor for dependency injection
	public BaseBallCoach(IFortuneService service)
	{
		fortuneService = service;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Spend 30 minutes for battilng practice";
	}

	@Override
	public String getDailyFortune() {
		// use fortune service
		return fortuneService.getFortune();
	}

	
}
