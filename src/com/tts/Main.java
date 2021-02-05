package com.tts;
import javax.swing.*;
import java.io.*;




class Main{

    public static void main(String args[]){
        AddressBook add = new AddressBook();
        int ch;
        String name;

        while(true){
            name = JOptionPane.showInputDialog("Enter 1 to add\n Enter 2 to search\n Enter 3 to add email\n Enter 4 to remove\n");
            ch = Integer.parseInt(name); //converting String to character
            switch(ch){
                case 1:
                    add.addPerson();
                    break;
                case 2:
                    name = JOptionPane.showInputDialog("Enter The Name");
                    add.search(name);
                    break;
                case 3:
                    name = JOptionPane.showInputDialog("Enter The Name");
                    add.remove(name);
                    break;

                case 5:
                    name = JOptionPane.showInputDialog("Enter The Email");
                    add.email("");
                    break;

                case 4:
                    System.exit(0);
                    break;



            }//statement
        }//while

    }
}
