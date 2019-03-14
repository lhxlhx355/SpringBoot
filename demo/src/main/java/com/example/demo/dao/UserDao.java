package com.example.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.PO.user;

public interface UserDao extends JpaRepository<user, Long> { 

}
