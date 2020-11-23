package com.rakesh.springsteps.model;

import com.rakesh.springsteps.bean.Review;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class HotelWithReviews extends Hotel{
     private List<Review> reviews;
}
