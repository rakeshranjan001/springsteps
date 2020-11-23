package com.rakesh.springsteps.bean;

import lombok.Data;

@Data
public class Review {
    private String date;
    private String listing_id;
    private String reviewer_id;
    private String reviewer_name;
    private String Comments;
}
