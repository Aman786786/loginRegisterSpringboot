package com.app.service;



import org.springframework.web.bind.annotation.RequestBody;

import com.app.entity.LoginUser;
import com.app.entity.User;

public interface UserService {
	
	public ValidationStatus createUser(User user) throws Exception;
	public ValidationStatus loginUserr(LoginUser loginUser) throws Exception;
}
