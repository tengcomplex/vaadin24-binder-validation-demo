package com.example.application.views.validation;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotEmpty;

public class Person {
  @NotEmpty
  private String name;
  @Length(min = 3, max = 5)
  private String address;

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
}
