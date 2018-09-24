package com.bi.service;

import java.util.Calendar;

public class WishServiceImpl implements WishService {
	
	public String generateWishMsg() {
		
		Calendar cal=null;
		int hour=0;
		String msg=null;
		//create calendar class object
		cal=Calendar.getInstance();
		//get time of the day(hour)
		hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<12)
			msg="Good Morning.";
		else if(hour<16)
			msg="Good afternoon.";
		else if(hour<20)
			msg="Good evening.";
		else
			msg="Good Night.";
		return msg;
	}

}
