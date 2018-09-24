package com.bi.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.bi.command.UserCommand;

@Component
public class MyValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(UserCommand.class);
	}

	@Override
	public void validate(Object cmd, Errors error) {
		System.out.println("MyValidator.validate()");
		UserCommand command=null;
		//type cast
		command=(UserCommand)cmd;
		if(command.getUser().equals("")||command.getUser()==""||command.getUser().length()==0) {
			error.rejectValue("user", "user.required");
		}
		if(command.getPwd().equals("")||command.getPwd()==""||command.getPwd().length()==0) {
			error.rejectValue("pwd", "pwd.required");
		}

	}

}
