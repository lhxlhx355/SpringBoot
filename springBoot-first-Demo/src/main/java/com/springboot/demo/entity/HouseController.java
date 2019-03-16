package com.springboot.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HouseController {
    @Autowired
    private UserRepository userRepository;

    //http://localhost:8888/saveHouse?id=1&houseName=test001&houseSize=test001
    @GetMapping("/saveHouse")
    @CachePut(value = "house", key = "#id")
    public User saveHouse(Integer id,String houseName,String houseSize){
        User house = new User(id,houseName, houseSize);
        userRepository.save(house);
        return house;
    }

    //http://localhost:8888/queryHouse
    @GetMapping("/queryHouse")
    @Cacheable(value = "house")
    public List<User> queryHouse(Integer id){
        List<User> house = userRepository.findAll();
        return house;
    }

    //http://localhost:8888/deleteHouse?id=1
    @GetMapping("/deleteHouse")
    @CacheEvict(value = "house", key = "#id")
    public String deleteHouse(int id){
      //  userRepository.delete(id);
        System.out.println("11111ss");
        return "success";
    }

    //http://localhost:8888/deleteCache
    @GetMapping("/deleteCache")
    @CacheEvict(value = "house", allEntries = true)
    public void deleteCache() {
    }
}
