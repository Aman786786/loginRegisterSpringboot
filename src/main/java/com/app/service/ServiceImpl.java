package com.app.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.LoginUser;
import com.app.entity.User;
import com.app.repository.UserRepository;

@Service
public class ServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public ValidationStatus createUser(User user) throws Exception {
		List<User> exsitingUser = userRepository.findAll();

		for (User tnx : exsitingUser) {
			
				
			if (tnx.getEmail().equals(user.getEmail())) {

				throw new Exception("User With This " + user.getEmail() + " Already Exist!");
			//	return ValidationStatus.USER_ALEREDY_EXISTS;

			}

			if (tnx.getContact().equals(user.getContact())) {

				throw new Exception("User With This " + user.getContact() + " Already Exist!");
				//return ValidationStatus.USER_CONTACT_NUMBER_ALEREDY_EXISTS;

			}
			
		}
		userRepository.save(user);

		System.out.println("New User " + user.getName() + " Created Successfully");
		return ValidationStatus.SUCCESS;

	}

	@Override
	public ValidationStatus loginUserr(LoginUser loginUser) throws Exception  {
		List<User> exsitingUser = userRepository.findAll();

		for (User tnx : exsitingUser) {

			if (loginUser.getEmail().equals(tnx.getEmail()) && loginUser.getPassword().equals(tnx.getPassword()))

			{

				System.out.println("User Login Successfully");
				userRepository.save(loginUser);
				return ValidationStatus.USER_LOGIN_SUCCESS;

			}
			

		}
		
			throw new Exception("BAD CREDentials");
				
	}

}
