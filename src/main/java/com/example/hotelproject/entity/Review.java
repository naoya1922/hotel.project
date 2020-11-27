package com.example.hotelproject.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
     private String name;
    private Double evaluation;
    private String title;
    private String body;
    private Date createdAt;
    
    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Double getEvaluation() {
        return evaluation;
    }
    
    public void setEvaluation(Double evaluation) {
        this.evaluation = evaluation;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getBody() {
        return body;
    }
    
    public void setBody(String body) {
        this.body = body;
    }
    
    public Hotel getHotel() {
        return hotel;
    }
    
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    
    @PrePersist
    public void onPrePersist() {
        setCreatedAt(new Date(id));
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}