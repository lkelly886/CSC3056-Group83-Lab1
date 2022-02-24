package model;

import java.util.Date;

public class Transaction {
  private String account_number;
  private double transaction_amount;
  private Date transaction_date;

  public Transaction(String account_number, double transaction_amount, Date transaction_date) {
    this.account_number = account_number;
    this.transaction_amount = transaction_amount;
    this.transaction_date = transaction_date;
  }

  public String getAccount_number() {
    return account_number;
  }

  public Transaction setAccount_number(String account_number) {
    this.account_number = account_number;
    return this;
  }

  public double getTransaction_amount() {
    return transaction_amount;
  }

  public Transaction setTransaction_amount(double transaction_amount) {
    this.transaction_amount = transaction_amount;
    return this;
  }

  public Date getTransaction_date() {
    return transaction_date;
  }

  public Transaction setTransaction_date(Date transaction_date) {
    this.transaction_date = transaction_date;
    return this;
  }

  @Override
  public String toString(){
    return account_number + ", " + transaction_amount + ", " + transaction_date;
  }
}
