package com.aryan.SplitwiseMay2023.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class ExpenseOwingUser extends User{
    @ManyToOne
    private Expense expense;
    @ManyToOne
    private User user;
    private double amount;
}
