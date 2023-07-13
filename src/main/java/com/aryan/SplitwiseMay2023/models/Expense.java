package com.aryan.SplitwiseMay2023.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Currency;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Expense extends BaseModel{
    private double amount;
    @ManyToOne
    private User createdBy; // one user can create may expenses -> Many to One -> User to expense
    private String description;
    private Date createdAt;
    @ManyToOne
    private Currency baseCurrency; // one currency can have many expenses
    @ManyToMany
    private List<User> participants; // One user can many expenses, one expenses can have may user
}
