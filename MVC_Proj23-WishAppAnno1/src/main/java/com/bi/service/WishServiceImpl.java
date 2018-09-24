package com.bi.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;
@Service("service")
public class WishServiceImpl implements WishService {

	@Override
	public String generateMsg() {
		Calendar calendar=null;
		int hour=0;
		//get Calendar object
		calendar=Calendar.getInstance();
		//get current hour of the day
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		if(hour<12) {
			return "good morning";
		}
		else if(hour<17) {
			return "good afternoon";
		}
		else if(hour<21) {
			return "good eveningn";
		}
		else
			return "good night";
	}

	
}
