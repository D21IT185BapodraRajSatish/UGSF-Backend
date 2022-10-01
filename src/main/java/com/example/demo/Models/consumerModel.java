// Dada Ki Jay Ho


package com.example.demo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class consumerModel {


    @Id

    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
    private Integer id;

    private String name;
    private String surname;
    private String personalID;
    private String address;
    private String email;

    private String mobileNumber;

    private String capitalAccountID;
    private String spendableAccountID;

    public consumerModel() {
    }



    public consumerModel(Integer id, String name, String surname, String personalID, String address,  String email,String mobileNumber, String capitalAccountID, String spendableAccountID) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.personalID = personalID;
        this.address = address;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.capitalAccountID = capitalAccountID;
        this.spendableAccountID = spendableAccountID;
    }




    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPersonalID() {
        return personalID;
    }
    public void setPersonalID(String personalID) {
        this.personalID = personalID;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    public String getCapitalAccountID() {
        return capitalAccountID;
    }
    public void setCapitalAccountID(String capitalAccountID) {
        this.capitalAccountID = capitalAccountID;
    }

    public String getSpendableAccountID() {
        return spendableAccountID;
    }
    public void setSpendableAccountID(String spendableAccountID) {
        this.spendableAccountID = spendableAccountID;
    }
}
