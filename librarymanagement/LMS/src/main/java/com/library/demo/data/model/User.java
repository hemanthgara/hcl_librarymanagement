package com.library.demo.data.model;

public class User {

  private String id;
  private String name;
  private String address;
  private String password;

  public User(String id, String name,String addres, String password) {
    super();
    this.id = id;
    this.name = name;
    this.address = addres;
    this.password = password;
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

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;

  }

}
