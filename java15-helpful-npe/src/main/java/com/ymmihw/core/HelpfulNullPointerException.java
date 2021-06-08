package com.ymmihw.core;

import lombok.Getter;
import lombok.Setter;

public class HelpfulNullPointerException {

  public static void main(String[] args) {
    Employee employee = null;
    employee.getName();
  }

  public String getEmployeeEmailAddress(Employee employee) {
    String emailAddress = employee.getPersonalDetails().getEmailAddress().toLowerCase();
    return emailAddress;
  }

  @Getter
  @Setter
  static class Employee {
    String name;
    PersonalDetails personalDetails;
  }

  @Getter
  @Setter
  static class PersonalDetails {
    String emailAddress;
    String phone;
  }
}
