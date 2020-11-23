package com.rakesh.springsteps.model;

import lombok.Data;

import java.util.List;

@Data
public class HotelDescription {
    private String property_type;
    private String room_type;
    private String bed_type;
    private String accomodates;
    private String bedrooms;
    private String beds;
    private String bathrooms;
    private List<String> amenities;
}
