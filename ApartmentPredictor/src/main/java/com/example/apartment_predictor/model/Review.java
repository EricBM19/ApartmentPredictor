package com.example.apartment_predictor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Review {

    @Id
    private String id;
    private String reviewText;
    private int rating;
    private LocalDate reviewDate;

    //To do: Add relationship anotation
    private String apartmentId;
    private String reviewerId;

    public Review() {}

    //To do: Call/create method to generate automatic UUID for ID
    public Review(String reviewText, int rating, LocalDate reviewDate, String apartmentId, String reviewerId) {
        //this.id = generateUUID;
        this.reviewText = reviewText;
        this.rating = rating;
        this.reviewDate = reviewDate;
        this.apartmentId = apartmentId;
        this.reviewerId = reviewerId;
    }

    public String getId() {
        return id;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public LocalDate getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(String apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(String reviewerId) {
        this.reviewerId = reviewerId;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id='" + id + '\'' +
                ", reviewText='" + reviewText + '\'' +
                ", rating=" + rating +
                ", reviewDate=" + reviewDate +
                ", apartmentId='" + apartmentId + '\'' +
                ", reviewerId='" + reviewerId + '\'' +
                '}';
    }
}