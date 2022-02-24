package tests;

import model.User;

public class UserTests {
  public static void main(String[] args){
    /**
     * OLD: Manual Testing
    User testUser = new User("mike", "my_passwd", "Mike", "Smith", "07771234567");
    System.out.println(testUser.toString());
     */


    //automated testing - using ifs

    String test_username = "mike";
    String test_password = "my_passwd";
    String test_first_name = "Mike";
    String test_last_name = "Smith";
    String test_mobile_number = "07771234567";

    User testUser = new User(test_username, test_password, test_first_name, test_last_name, test_mobile_number);

    boolean passed = true;

    if (testUser.getUsername() != test_username){
      System.out.println("TC1 failed: username did not match");
      passed = false;
    }

    if (testUser.getPassword() != test_password){
      System.out.println("TC2 failed: password did not match");
      passed = false;
    }

    if (testUser.getFirst_name() != test_first_name) {
      System.out.println("TC3 failed: firstName did not match");
      passed = false;
    }

    if (testUser.getLast_name() != test_last_name) {
      System.out.println("TC4 failed: lastName did not match");
      passed = false;
    }

    if ( testUser.getMobile_number() != test_mobile_number){
      System.out.println("TC5 failed: mobileNumber did not match");
      passed = false;
    }

    if (passed){
      System.out.println("All TC's passed.");
    }

    //automated testing - using assertions
    //assert 1 == 2;

    assert testUser.getUsername() == test_username;
    assert testUser.getPassword() == test_password;
    assert testUser.getFirst_name() == test_username;
    assert testUser.getLast_name() == test_last_name;
    assert testUser.getMobile_number() == test_mobile_number;
  }
}
