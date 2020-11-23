package com.rakesh.springsteps.bean;

import lombok.Data;

import java.util.List;

@Data
public class Address {

//    class Location{
//        String type;
//        List<Integer> coordinates;
//    };

    private String street;
    private String suburb;
    private String government_area;
    private String market;
    private String country;
    private String country_code;
    private Object location;
}
