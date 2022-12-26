package com.bzl.registration;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    String firstName;
    public static void main(String[] args) {
        UserRegistration users = new UserRegistration();
        users.addUser();

    }
    public void addUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        String fName = sc.nextLine();
        Pattern p1 = Pattern.compile("^[A-Z]+[a-z]{2,}");
        Matcher mat = p1.matcher(fName);
        boolean b = mat.matches();
        if(b){
            this.firstName = fName;
        }else{
            System.out.println("Invalid First name.");
        }

    }
}