/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rupa.RevJDBC.entity;

/**
 *
 * @author ACER
 */
public class UserEntry {
    private String firstName,lastName,email,password,conpassword;

    public UserEntry() {
    }

    public UserEntry(String firstName, String lastName, String email, String password, String conpassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.conpassword = conpassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConpassword() {
        return conpassword;
    }

    public void setConpassword(String conpassword) {
        this.conpassword = conpassword;
    }
    
}
