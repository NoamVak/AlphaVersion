package com.example.alphaversion;

public class User {
    private String email;
    private String password;

    public User(){}
    public User (String email, String password){
        this.email=email;
        this.password=password;
    }

    public String GetEmail(){return email;}
    public String GetPassword(){return password;}
}
