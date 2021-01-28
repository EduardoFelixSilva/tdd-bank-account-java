package org.xpdojo.bank;

public class Account {

    private Double balance;

    public Account() {
        balance = 0D;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        balance = this.balance;
    }

    public void addBalance(Double depositValue){
        setBalance(balance + depositValue);
    }

}
