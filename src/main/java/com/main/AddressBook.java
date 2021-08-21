package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AddressBook {
    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String zip;
    public String phoneNumber;
    public String email;

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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
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
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    /*Create a method to add contact into the contact-list
    * returning a list on call*/
    public List<AddressBook> addNewContact(){
        List<AddressBook> contact = new ArrayList<>();
        try{
            String firstName = "Shubham";
            AddressBook addressBook = new AddressBook();
            Pattern myPattern = Pattern.compile("[a-zA-Z]{3,}");
            myPattern.matcher(firstName).matches();
            addressBook.setFirstName(firstName);
            contact.add(addressBook);
            System.out.println("List is: "+ contact);
        } catch (Exception e){
            e.printStackTrace();
        } return contact;
    }
}
