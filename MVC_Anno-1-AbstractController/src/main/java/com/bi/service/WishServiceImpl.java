package com.bi.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service
public class WishServiceImpl implements WishService {

	@Override
	public String getWish() {
		Calendar cal=null;
		int hour=0;
		//get Calendar object
		cal=Calendar.getInstance();
		//get current hour of the system
		hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<12){
			return "Good Morning";
		}
		else if(hour<17)
			return "good afternoon";
		else if(hour<21)
			return "good evening";
		else 
			return "good night";
	}

}
