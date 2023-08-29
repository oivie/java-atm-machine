package com.humber.asgmnts;
import java.util.Date;

public class Account {
        private int id;
        private double balance;
        private double annualInterestRate;
        private Date dateCreated;
        
        // No-arg constructor
        public Account() {
            this.id = 0;
            this.balance = 0.0;
            this.annualInterestRate = 0.0;
            this.dateCreated = new Date();
        }
    	
        // Getters and setters for the data fields
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }

        public Date getDateCreated() {
            return dateCreated;
        }
        
}
