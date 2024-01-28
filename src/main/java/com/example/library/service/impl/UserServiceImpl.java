package com.example.library.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.library.constants.Rtncode;
import com.example.library.entity.User;
import com.example.library.repository.UserDao;
import com.example.library.service.ifs.UserService;
import com.example.library.vo.UserResponse;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
  private UserDao userDao;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public UserResponse registerUser(User user) {
		// 檢查手機號碼是否已被註冊
		User existingUser = userDao.findByPhoneNumber(user.getPhoneNumber());
		if (existingUser != null) {
			return new UserResponse(null, Rtncode.PHONE_NUMBER_ALREADY_REGISTERED);
		}

		// 將密碼加鹽並經雜湊
		String hashedPassword = passwordEncoder.encode(String.valueOf(user.getPwd()));
		user.setPwd(hashedPassword);

		// 設定註冊時間
		user.setRegistrationTime(LocalDateTime.now());

		// 儲存使用者資訊
		User savedUser = userDao.save(user);

		return new UserResponse(savedUser, Rtncode.SUCCESS);
	}

	@Override
	public UserResponse getUserById(int userId) {
		// 根據使用者ID查詢使用者資訊
		User user = userDao.findById(userId).orElse(null);

		if (user != null) {
			return new UserResponse(user, Rtncode.SUCCESS);
		} else {
			return new UserResponse(null, Rtncode.USER_NOT_FOUND);
		}
	}
		
}
