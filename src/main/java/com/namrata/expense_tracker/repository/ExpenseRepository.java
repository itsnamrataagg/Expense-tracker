package com.namrata.expense_tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.namrata.expense_tracker.model.Expense;

// Ye interface Expense table ke liye CRUD operations provide karega
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    // Agar chaho to custom queries bhi yahan add kar sakte ho
}
