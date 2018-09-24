package com.bi.service;

import com.bi.dto.UserDTO;

public interface LoginService {
	public String checkAuthentication(UserDTO dto);
}
