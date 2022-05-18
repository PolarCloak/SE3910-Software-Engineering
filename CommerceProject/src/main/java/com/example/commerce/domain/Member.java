package com.example.commerce.domain;

import javax.persistence.*;

@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
    private int admin;

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int isAdmin() {
        return admin;
    }
    public void setAdmin(int admin) {
        this.admin = admin;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        if(isAdmin()!=0){
            return("ADMIN: " + name);
        }
        else{
            return(name);
        }

    }
}
