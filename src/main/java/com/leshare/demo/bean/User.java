package com.leshare.demo.bean;

public class User {

  private int id;
  private String name;
  private int age;
  private String sex;

  public void setId(int id){
    this.id = id;
  }

  public int getId(){
    return id;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void setAge(int age){
    this.age = age;
  }

  public int getAge(){
    return age;
  }

  public void setSex(String sex){
    this.sex = sex;
  }

  public String getSex(){
    return sex;
  }

  @Override
  public String toString(){
    return "User=[id=" + id
          + ", name=" + name
          + ", age=" + age
          + ", sex=" + sex
          + "]";
  }
}
