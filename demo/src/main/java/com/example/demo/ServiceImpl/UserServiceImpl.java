package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.PO.user;
import com.example.demo.dao.UserDao;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired(required=true)
	private UserDao userDao;


	@Override
	public List<user> findAll() {
	List<user> list = userDao.findAll();
	return list;
	}
}
