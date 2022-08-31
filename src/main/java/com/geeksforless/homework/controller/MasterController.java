package com.geeksforless.homework.controller;

import com.geeksforless.homework.expenses.Expense;
import com.geeksforless.homework.expenses.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class MasterController {

    @Autowired
    ExpenseService expenseService;

    @RequestMapping("/")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("message", "List of expenses");
        List<Expense> expenses = expenseService.findAll();
        System.out.println(expenses);
        mav.addObject("expenses", expenses);
        return mav;
    }

}