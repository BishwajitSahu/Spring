package com.bi.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.bi.command.UserCommand;

@Component("validator")//makes java class as Spring bean
public class LoginValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		System.out.println("LoginValidator.supports()");
		return clazz.isAssignableFrom(UserCommand.class);
		
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("LoginValidator.validate()");
		UserCommand cmd=null;
		//type cast target Object to UserCommand object
		cmd=(UserCommand)target;
		if(cmd.getUname().equalsIgnoreCase("") || cmd.getUname()=="" || cmd.getUname().length()==0)
			errors.rejectValue("uname","user.required");
		if(cmd.getPwd().equalsIgnoreCase("") || cmd.getPwd().length()==0)
			errors.rejectValue("pwd", "pwd.required");
	}

}
