package com.namrata.expense_tracker.controller;

import com.namrata.expense_tracker.model.User;
import com.namrata.expense_tracker.model.Expense;
import com.namrata.expense_tracker.repository.UserRepository;
import com.namrata.expense_tracker.repository.ExpenseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ExpenseRepository expenseRepository;

    // Get all users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get all expenses
    @GetMapping("/expenses")
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }
}
