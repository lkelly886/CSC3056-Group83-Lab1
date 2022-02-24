package model;

import java.util.Date;

public class Account {
  private String account_number;
  private String username_of_account_holder;
  private String account_type;
  private Date account_opening_date;

  public Account(String account_number, String username_of_account_holder, String account_type, Date account_opening_date) {
    this.account_number = account_number;
    this.username_of_account_holder = username_of_account_holder;
    this.account_type = account_type;
    this.account_opening_date = account_opening_date;
  }

  public String getAccount_number() {
    return account_number;
  }

  public Account setAccount_number(String account_number) {
    this.account_number = account_number;
    return this;
  }

  public String getUsername_of_account_holder() {
    return username_of_account_holder;
  }

  public Account setUsername_of_account_holder(String username_of_account_holder) {
    this.username_of_account_holder = username_of_account_holder;
    return this;
  }

  public String getAccount_type() {
    return account_type;
  }

  public Account setAccount_type(String account_type) {
    this.account_type = account_type;
    return this;
  }

  public Date getAccount_opening_date() {
    return account_opening_date;
  }

  public Account setAccount_opening_date(Date account_opening_date) {
    this.account_opening_date = account_opening_date;
    return this;
  }

  @Override
  public String toString(){
    return account_number + ", " + username_of_account_holder + ", " + account_type + ", " + account_opening_date;
  }
}
