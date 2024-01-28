package com.example.library.service.ifs;

import com.example.library.entity.User;
import com.example.library.vo.UserResponse;

public interface UserService {

	public UserResponse registerUser(User user);
	
	public UserResponse getUserById(int userId);
}
