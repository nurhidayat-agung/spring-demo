package com.nur.springdemo;

import com.nur.springdemo.didemo.interfaces.IFortuneService;

public class TrackCoach implements Coach {

	private IFortuneService fortuneService;
	
	
	public TrackCoach(IFortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Run a Hard 5K";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It :" + fortuneService.getFortune();
	}

}
