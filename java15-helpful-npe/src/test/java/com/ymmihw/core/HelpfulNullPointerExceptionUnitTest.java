package com.ymmihw.core;

import com.ymmihw.core.HelpfulNullPointerException.Employee;
import com.ymmihw.core.HelpfulNullPointerException.PersonalDetails;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelpfulNullPointerExceptionUnitTest {

  @Test
  public void givenAnEmptyPersonalDetails_whenEmailAddressIsAccessed_thenThrowNPE() {
    var helpfulNPE = new HelpfulNullPointerException();

    var employee = new Employee();
    employee.setName("Eduard");
    employee.setPersonalDetails(new PersonalDetails());
    Assertions.assertThrows(
        NullPointerException.class, () -> helpfulNPE.getEmployeeEmailAddress(employee));
  }

  @Test
  public void givenCompletePersonalDetails_whenEmailAddressIsAccessed_thenSuccess() {
    var helpfulNPE = new HelpfulNullPointerException();
    var emailAddress = "eduard@gmx.com";

    var employee = new Employee();
    employee.setName("Eduard");

    var personalDetails = new PersonalDetails();
    personalDetails.setEmailAddress(emailAddress.toUpperCase());
    personalDetails.setPhone("1234");
    employee.setPersonalDetails(personalDetails);

    assertThat(helpfulNPE.getEmployeeEmailAddress(employee)).isEqualTo(emailAddress);
  }
}
