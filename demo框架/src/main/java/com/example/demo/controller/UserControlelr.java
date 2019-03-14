package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.PO.user;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("user")
public class UserControlelr {
	@Autowired
	private UserService userService;
	
	@RequestMapping("list")
	public List<user> queryUserAll() {
	  List<user> list = this.userService.findAll();
	  return list;
	}
}
