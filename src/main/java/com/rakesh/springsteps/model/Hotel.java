package com.rakesh.springsteps.model;

import com.rakesh.springsteps.bean.Address;
import com.rakesh.springsteps.bean.Images;
import com.rakesh.springsteps.bean.Review;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@Document(collection = "Hotel")
public class Hotel extends HotelDescription{
    @Id
    private String id;
    private String listing_url;
    private String name;
    private String summary;
    private String space;
    private String description;
    private String neighbourhood_overview;
    private String notes;
    private String transit;
    private String access;
    private String interaction;
    private String house_rules;

    private String minimum_nights;
    private String maximum_nights;
    private String cancellation_policy;
    private String last_scraped;
    private String calendar_last_scraped;
    private String first_review;
    private String last_review;


    private String number_of_review;
    private String price;
    private String security_deposit;
    private String cleaning_fee;
    private String extra_people;
    private String guests_included;
    private Images images;
    private String host;
    private Address address;
    private String availabilty;
    private String review_scores;

}

