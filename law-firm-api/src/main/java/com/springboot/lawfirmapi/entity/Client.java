package com.springboot.lawfirmapi.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Client {

    //Fields
    private int id;

    private String clientName;

    private String firmCategory;

    private String email;

    private String gender;

    private String city;

    private String state;

    private String country;

    private String zipCode;


    //Constructor


    public Client(int id, String clientName, String firmCategory,
                  String email, String gender, String city, String state,
                  String country, String zipCode) {
        this.id = id;
        this.clientName = clientName;
        this.firmCategory = firmCategory;
        this.email = email;
        this.gender = gender;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    //Getters & Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getFirmCategory() {
        return firmCategory;
    }

    public void setFirmCategory(String firmCategory) {
        this.firmCategory = firmCategory;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    //ToString

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", clientName='" + clientName + '\'' +
                ", firmCategory='" + firmCategory + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
