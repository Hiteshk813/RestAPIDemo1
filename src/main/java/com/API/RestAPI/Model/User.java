package com.API.RestAPI.Model;
public class User {

    private String id;
    private String name ;
    private int age ;
    private float exp;

    public User() {
        System.out.println("User Constructor");
    }

    public User(String id, String name, int age, float exp) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.exp = exp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getExp() {
        return exp;
    }

    public void setExp(float exp) {
        this.exp = exp;
    }
}
