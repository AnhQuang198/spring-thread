package com.example.springthread.entity.mongo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@Document(collection = "test_data")
public class UserMongo {
    @Id
    private String id;

    @Field(name = "about")
    private String about;

    @Field(name = "address")
    private String address;

    @Field(name = "age")
    private Integer age;

    @Field(name = "balance")
    private String balance;

    @Field(name = "company")
    private String company;

    @Field(name = "email")
    private String email;

    @Field(name = "eyeColor")
    private String eyeColor;

    @Field(name = "gender")
    private String gender;

    @Field(name = "guid")
    private String guid;

    @Field(name = "index")
    private Integer index;

    @Field(name = "isActive")
    private String isActive;

    @Field(name = "latitude")
    private String latitude;

    @Field(name = "longitude")
    private String longitude;

    @Field(name = "name")
    private String name;

    @Field(name = "phone")
    private String phone;

    @Field(name = "picture")
    private String picture;

    @Field(name = "registered")
    private String registered;
}
