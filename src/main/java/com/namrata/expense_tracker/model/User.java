package com.namrata.expense_tracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    private Double balance;
    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role; // "USER" ya "ADMIN"



    public User() {}

    public User(String name, String email, Double balance, String role) {
        this.name = name;
        this.email = email;
        this.balance = balance;
        this.role = role;
        

    }

    // Getters & Setters
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Double getBalance() { return balance; }
    public void setBalance(Double balance) { this.balance = balance; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }


    @Override
    public String toString() {
        return "User [ID=" + id + ", Name=" + name + ", Email=" + email + ", Balance=" + balance + "]";
    }
}
