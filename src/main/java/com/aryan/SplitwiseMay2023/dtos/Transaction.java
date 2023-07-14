package com.aryan.SplitwiseMay2023.dtos;

import com.aryan.SplitwiseMay2023.models.User;

public class Transaction {
    private User from;
    private User to;
    private double amount;

    public Transaction() {
    }

    public Transaction(User from, User to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public User getTo() {
        return to;
    }

    public void setTo(User to) {
        this.to = to;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
