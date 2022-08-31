package com.geeksforless.homework.repository;
import com.geeksforless.homework.expenses.Expense;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ExpenseRepository extends JpaRepository<Expense, Long>{

}
