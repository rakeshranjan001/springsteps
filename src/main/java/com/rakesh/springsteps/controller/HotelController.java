package com.rakesh.springsteps.controller;

import com.rakesh.springsteps.model.Hotel;
import com.rakesh.springsteps.repository.HotelRepository;
import com.rakesh.springsteps.utils.SpringStepsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelRepository hotelRepository;

    @GetMapping("/all")
    private SpringStepsResponse getAllHotels() throws Exception{
        try{
           List<Hotel> hotels;
           hotels = hotelRepository.findAll();
           return new SpringStepsResponse(true,hotels);
        }catch (Exception e){
            return new SpringStepsResponse(false,e.getMessage());
        }
    }
}
