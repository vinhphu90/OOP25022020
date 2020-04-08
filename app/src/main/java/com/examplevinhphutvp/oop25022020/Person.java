package com.examplevinhphutvp.oop25022020;

public class Person {
    private String name;
    private int age;
    private String address;
    private int phone;
    private int city_id;
    private int state_code;

    //alt + insert
    //constructor
    public Person(String name , int age , String address , int phone , int city_id , int state_code){
        this.name = name;
        this.age = age;
        this.address = address;
        this.city_id = city_id;
        this.state_code = state_code;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public int getState_code() {
        return state_code;
    }

    public void setState_code(int state_code) {
        this.state_code = state_code;
    }
}
