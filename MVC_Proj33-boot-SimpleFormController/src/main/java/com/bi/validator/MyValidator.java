package com.bi.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.bi.command.EmployeCommand;


public class MyValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return clazz.isAssignableFrom(EmployeCommand.class);
	}

	@Override
	public void validate(Object command, Errors errors) {
		EmployeCommand cmd=null;
		//type Object type command to User defined command object
		cmd=(EmployeCommand)command;
		if(cmd.getEid()<=0) {
			errors.rejectValue("eid", "eid must not be 0 or less than 0");
		}
		if(cmd.getFname().equals("")||cmd.getFname().length()==0) {
			errors.rejectValue("fname", "first name must not be empty");
		}
		if(cmd.getLname().equals("")||cmd.getLname().length()==0) {
			errors.rejectValue("lname", "last name must not be empty");
		}
		if(cmd.getSalary()<=0) {
			errors.rejectValue("salary", "salary must not be 0 or less than 0");
		}
		if(cmd.getEmail().equals("")||cmd.getEmail().length()==0) {
			errors.rejectValue("email", "email must not be empty.");
		}
		
	}
	

}
