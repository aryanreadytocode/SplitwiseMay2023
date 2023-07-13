package com.aryan.SplitwiseMay2023.services.settlup.strategies;

import com.aryan.SplitwiseMay2023.dtos.Transaction;
import com.aryan.SplitwiseMay2023.dtos.UserAmountPair;
import com.aryan.SplitwiseMay2023.models.ExpenseOwingUser;
import com.aryan.SplitwiseMay2023.models.ExpensePayingUser;
import com.aryan.SplitwiseMay2023.models.User;

import java.util.*;

public class MinMaxSettleUpStrategy implements SettleUpTransactionCalculatorStrategy{
    @Override
    public List<Transaction> getTransaction(List<ExpenseOwingUser> expenseOwingUsers, List<ExpensePayingUser> expensePayingUsers) {
        HashMap<User, Double> debtCollectionMap = new HashMap<>();
        // Calculating the total borrowed or lended amount for each user, Map will store the same.
        // update the owing users with negative value
        for (ExpenseOwingUser expenseOwingUser: expenseOwingUsers) {
            if (debtCollectionMap.containsKey(expenseOwingUser.getUser())){ // If any entry the user is present
                double currentAmount = debtCollectionMap.get(expenseOwingUser.getUser()); // get the current amount
                double updatedAmount = currentAmount - expenseOwingUser.getAmount();
                debtCollectionMap.put(expenseOwingUser.getUser(), updatedAmount);
            }else {
                debtCollectionMap.put(expenseOwingUser.getUser(), -1* (expenseOwingUser.getAmount()));
            }
        }
        // update the paying users with positive values
        for (ExpensePayingUser expensePayingUser: expensePayingUsers) {
            if (debtCollectionMap.containsKey(expensePayingUser.getUser())){ // If any entry the user is present
                double currentAmount = debtCollectionMap.get(expensePayingUser.getUser()); // get the current amount
                double updatedAmount = currentAmount + expensePayingUser.getAmount();
                debtCollectionMap.put(expensePayingUser.getUser(), updatedAmount);
            }else {
                debtCollectionMap.put(expensePayingUser.getUser(),  (expensePayingUser.getAmount()));
            }
        }

        // Start getting the transaction
        // Creating two buckets -> borrowers (minheap) and lenders(maxheap)

        // minHeap => borrowers
        PriorityQueue<UserAmountPair> borrowersMinHeap = new PriorityQueue<>(Comparator.comparingDouble(
                UserAmountPair::getAmount
        ));

//        maxHeap => lenders
        PriorityQueue<UserAmountPair> lendersMaxHeap = new PriorityQueue<>(Comparator.comparingDouble(
                UserAmountPair::getAmount
        ));

        for (Map.Entry<User, Double> userAmount : debtCollectionMap.entrySet()) {
            if (userAmount.getValue() < 0) {
                borrowersMinHeap.add(new UserAmountPair(userAmount.getKey(), userAmount.getValue()));
            }else if (userAmount.getValue()> 0) {
                lendersMaxHeap.add(new UserAmountPair(userAmount.getKey(), userAmount.getValue()));
            }
        }
        return null;
    }
}
