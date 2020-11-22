//package com.practice.mongoDB.test;
//
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class MongoConfig {
//    public @Bean
//    MongoClient mongoClient() {
//
//       // return MongoClients.create("mongodb+srv://springsteps:001@cluster0.yzsve.mongodb.net/sample_airbnb?retryWrites=true&w=majority");
//        return MongoClients.create("mongodb://springsteps:001@cluster0-shard-00-00.yzsve.mongodb.net:27017,cluster0-shard-00-01.yzsve.mongodb.net:27017,cluster0-shard-00-02.yzsve.mongodb.net:27017/sample_airbnb?ssl=true&replicaSet=atlas-w1oy81-shard-0&authSource=admin&retryWrites=true&w=majority");
//    }
//}
