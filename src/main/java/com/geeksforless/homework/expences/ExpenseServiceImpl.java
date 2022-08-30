package com.geeksforless.homework.expences;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {
     @Autowired
    ExpenseRepository expenseRepository;

     @Override
    public List<Expense> findAll(){
         return expenseRepository.findAll();
     }
}
