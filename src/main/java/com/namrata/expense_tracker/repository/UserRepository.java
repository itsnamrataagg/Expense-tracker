package com.namrata.expense_tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.namrata.expense_tracker.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

