/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvg.capp.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;

/**
 *
 * @author ccarr
 */




public class Contact {
    
    
    //JSON Structure
    private Integer contactId; //PK
    private Integer userId; //FK
    private String name;
    private String phone;
    private String email;
    private String address;
    private String remark;

    public Contact() {
    }
    
    public Contact(Integer contactId) {
        this.contactId = contactId;
    }
    
    public Contact(@JsonProperty("contactId") Integer contactId, 
            @JsonProperty("userId") Integer userId, 
            @JsonProperty("name") String name,
            @JsonProperty("phone") String phone,
            @JsonProperty("email") String email,
            @JsonProperty("address") String address,
            @JsonProperty("remark") String remark) {
        super();
        this.contactId = contactId;
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.remark = remark;
        
    }
    
    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    
    
}
