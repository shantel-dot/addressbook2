package com.tts;

import javax.swing.*;
import java.util.*;

class AddressBook {
    ArrayList<PersonInfo> persons;

    //constructor
    public AddressBook ( ) {
        persons = new ArrayList<PersonInfo>();
    }

    //add new person record to arraylist after taking input
    public void addPerson( ) {

        String name = JOptionPane.showInputDialog("Enter name");
        String add = JOptionPane.showInputDialog("Enter address");
        String pNum = JOptionPane.showInputDialog("Enter phone no");
        String email = JOptionPane.showInputDialog("Enter email");

        //construct new person object
        PersonInfo p = new PersonInfo(name, add, pNum, email);

        //add the above PersonInfo object to arraylist
        persons.add(p);
    }

    public void search(String name){

        for(int i = 0; i < persons.size(); i++){
            PersonInfo p = (PersonInfo)persons.get(i);
            if(name.equals(p.name)){
                p.print();

            }//if statement
        } //for loop

    }//function search

    public void remove(String name){
        for(int i = 0; i < persons.size(); i++){
            PersonInfo p = (PersonInfo)persons.get(i);
            if(name.equals(p.name)){
                persons.remove(i); }
        }


    }

    public void email(String email) {
    }//remove function
}