package com.example.springboot_jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityRepository extends JpaRepository<City,Integer> {

    //使用参数索引
    @Query("select p from city p where p.city_id = ?1")
    List<City> query(int city_id);
}
