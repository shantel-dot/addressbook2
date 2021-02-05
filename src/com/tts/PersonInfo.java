package com.tts;
import javax.swing.*;

/*Making class PersonInfo for using as a data type in arraylist*/

public class PersonInfo {  //follow naming convention to class name

    String name;
    String address;
    String phoneNumber;
    String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail(){ return email; }

    public void setEmail(String email) { this.email = email;}
//Constructor

    public PersonInfo(String n, String add, String phone, String email ) {

        name = n;
        address = add;
        phoneNumber = phone;     //follow naming convention fo variable names
        email = email;


    }  // PersonInfo constructor

    public void print() {

        JOptionPane.showMessageDialog(null, "Name:" + name + "Address:" + address + "Phone No.:" + phoneNumber);
    }

    @Override
    public String toString() {
        return "PersonInfo{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

