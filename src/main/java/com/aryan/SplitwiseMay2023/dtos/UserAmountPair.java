package com.aryan.SplitwiseMay2023.dtos;

import com.aryan.SplitwiseMay2023.models.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class UserAmountPair {
    private User user;
    private double amount;


}
