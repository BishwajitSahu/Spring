package com.bi.validations;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.bi.command.MyCommand;

public class StudentValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		//checks whether validor is pointing to correct command class or not
		return clazz.isAssignableFrom(MyCommand.class);
	}
	public void validate(Object command, Errors errors) {
		MyCommand cmd=null;
		//type casting Object type command object to Command type Command object
		cmd=(MyCommand)command;
		if(cmd.getsName().trim().equals("") || cmd.getsName().trim().length()==0) {
			errors.rejectValue("sName", "sname.required");
		}
		//else if()
		if(cmd.getCourse().trim().equals("") || cmd.getCourse().trim().length()==0) {
			errors.rejectValue("course", "course.required");
		}
		if(cmd.getsAdd().trim().equals("") || cmd.getsAdd().trim().length()==0) {
			errors.rejectValue("sAdd", "sadd.required");
		}
		else if(cmd.getsAdd().length()<3 || cmd.getsAdd().length()>15) {
			errors.rejectValue("sAdd", "sadd.invalid");
		}

	}

}
