package com.rakesh.springsteps.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Host {
    @Id
    private String host_id;
    private String host_url;
    private String host_name;
    private String host_location;
    private String host_about;
    private String host_response_time;
    private String host_thumbnail_url;
    private String host_picture_url;
    private String host_neighbourhood;
    private String host_response_rate;
    private String host_is_superhost;
    private String host_has_profile_pic;
    private String host_identity_verified;
    private String host_listings_count;
    private String host_total_listings_count;
    private List<String> host_verifications;
}
