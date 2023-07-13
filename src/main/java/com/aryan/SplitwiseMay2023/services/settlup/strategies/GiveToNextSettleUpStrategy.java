package com.aryan.SplitwiseMay2023.services.settlup.strategies;

import com.aryan.SplitwiseMay2023.dtos.Transaction;
import com.aryan.SplitwiseMay2023.models.ExpenseOwingUser;
import com.aryan.SplitwiseMay2023.models.ExpensePayingUser;

import java.util.List;

public class GiveToNextSettleUpStrategy implements SettleUpTransactionCalculatorStrategy{
    @Override
    public List<Transaction> getTransaction(List<ExpenseOwingUser> expenseOwingUsers, List<ExpensePayingUser> expensePayingUsers) {
        return null;
    }
}
