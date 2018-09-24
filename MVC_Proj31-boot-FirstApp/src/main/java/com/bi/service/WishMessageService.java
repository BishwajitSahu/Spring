package com.bi.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishMessageService {
	@Autowired
	private Calendar calendar;
	public String msg() {
		int hour=0;
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		if(hour<12) {
			return "good morning";
		}
		else if(hour<15) {
			return "good afternoon";
		}
		else if(hour<21) {
			return "good evening";
		}
		else
			return "good night";
		
	}
}
