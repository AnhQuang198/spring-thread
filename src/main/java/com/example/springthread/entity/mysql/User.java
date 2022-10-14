package com.example.springthread.entity.mysql;


import com.example.springthread.entity.mongo.UserMongo;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String about;

    private String address;

    private Integer age;

    private String balance;

    private String company;

    private String email;

    @Column(name = "eye_color")
    private String eyeColor;

    private String gender;

    private String guid;

//    private Integer index;
//
//    @Column(name = "is_active")
//    private String isActive;
//
//    private String latitude;
//
//    private String longitude;

    private String name;

    private String phone;

//    private String picture;

//    private String registered;

    public void map(UserMongo userMongo) {
        setAbout(userMongo.getAbout());
        setAge(userMongo.getAge());
        setAddress(userMongo.getAddress());
        setEmail(userMongo.getEmail());
        setBalance(userMongo.getBalance());
        setGender(userMongo.getGender());
        setGuid(userMongo.getGuid());
        setEyeColor(userMongo.getEyeColor());
//        setRegistered(userMongo.getRegistered());
//        setPicture(userMongo.getPicture());
        setPhone(userMongo.getPhone());
        setName(userMongo.getName());
//        setLongitude(userMongo.getLongitude());
//        setLatitude(userMongo.getLatitude());
//        setIsActive(userMongo.getIsActive());
//        setIndex(userMongo.getIndex());
        setCompany(userMongo.getCompany());
    }
}
