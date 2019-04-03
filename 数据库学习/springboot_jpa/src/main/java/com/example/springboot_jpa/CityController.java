package com.example.springboot_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {
    @Autowired
    private CityRepository cityRepository;
    //http://localhost:8888/saveCity?cityName=北京&cityIntroduce=中国首都
    @GetMapping(value = "saveCity")
    public String saveCity(String cityName,String cityIntroduce){
        City city = new City(cityName,cityIntroduce);
        cityRepository.save(city);
        return "success";
    }
    //http://localhost:8888/deleteCity
    @GetMapping(value = "deleteCity")
    public String deleteCity(){
        cityRepository.deleteAll();
        return "success";
    }
    //http://localhost:8888/updateCity?cityId=3&cityName=沈阳&cityIntroduce=辽宁省省会
    @GetMapping(value = "updateCity")
    public String updateCity(int cityId,String cityName,String cityIntroduce){
        City city = new City(cityId,cityName,cityIntroduce);
        cityRepository.save(city);
        return "success";
    }

    //http://localhost:8888/getCityById?cityId=3
    @GetMapping(value = "getCityById")
    public List<City> getCityById(int cityId){
        List<City> list = cityRepository.query(cityId);
        return list;
    }

}
