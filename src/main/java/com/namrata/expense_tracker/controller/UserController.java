package com.namrata.expense_tracker.controller;

import com.namrata.expense_tracker.model.User;
import com.namrata.expense_tracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin // allows frontend to call API
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Get all users
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Add user
    @PostMapping
    public ResponseEntity<?> addUser(@RequestBody User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                                 .body("Email already exists");
        }
         boolean nameExists = userRepository.findAll()
                          .stream()
                          .anyMatch(u -> u.getName().equalsIgnoreCase(user.getName()));
    if (nameExists) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                             .body("User with this name already exists!");
    }
        User saved = userRepository.save(user);
        return ResponseEntity.ok(saved);
    }
    // Signup (similar to addUser but returns a message)
@PostMapping("/signup")
public ResponseEntity<?> signup(@RequestBody User user) {
    if (userRepository.existsByEmail(user.getEmail())) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body("Email already exists");
    }
    boolean nameExists = userRepository.findAll()
                          .stream()
                          .anyMatch(u -> u.getName().equalsIgnoreCase(user.getName()));
    if (nameExists) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                             .body("User with this name already exists!");
    }
    userRepository.save(user);
    return ResponseEntity.ok("User registered successfully");
}

// Login
@PostMapping("/login")
public ResponseEntity<?> login(@RequestBody User loginUser) {
    User user = userRepository.findByEmail(loginUser.getEmail());
    if (user != null && user.getPassword().equals(loginUser.getPassword())) {
        //return ResponseEntity.ok("Login successful");
        return ResponseEntity.ok(user);
    }
    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
}


    // Update user
    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@PathVariable Long id, @RequestBody User user) {
        User existing = userRepository.findById(id).orElse(null);
        if (existing == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");

        if (!existing.getEmail().equals(user.getEmail()) &&
            userRepository.existsByEmail(user.getEmail())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Email already exists");
        }

        existing.setName(user.getName());
        existing.setEmail(user.getEmail());
        existing.setBalance(user.getBalance());
        userRepository.save(existing);
        return ResponseEntity.ok(existing);
    }

    // Delete user
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        if (!userRepository.existsById(id)) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        userRepository.deleteById(id);
        return ResponseEntity.ok("Deleted successfully");
    }
}


// package com.namrata.expense_tracker.controller;

// import com.namrata.expense_tracker.model.User;
// import com.namrata.expense_tracker.repository.UserRepository;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/users")
// @CrossOrigin(origins = "http://localhost:8080")
// public class UserController {

//     private final UserRepository userRepository;

//     public UserController(UserRepository userRepository) {
//         this.userRepository = userRepository;
//     }

//     // Create User
//     @PostMapping
//     public User createUser(@RequestBody User user) {
//         User savedUser = userRepository.save(user);
//         System.out.println("✅ User Added -> ID: " + savedUser.getId() + " | Name: " + savedUser.getName());
//         return savedUser;
//     }

//     // Get All Users
//     @GetMapping
//     public List<User> getAllUsers() {
//         List<User> users = userRepository.findAll();
//         System.out.println("📋 All Users Fetched -> Count: " + users.size());
//         return users;
//     }

//     // Get User by ID
//     @GetMapping("/{id}")
//     public User getUserById(@PathVariable Long id) {
//         User user = userRepository.findById(id).orElse(null);
//         if (user != null) {
//             System.out.println("🔎 User Fetched -> ID: " + user.getId() + " | Name: " + user.getName());
//         } else {
//             System.out.println("❌ User Not Found with ID: " + id);
//         }
//         return user;
//     }

//     // Update User
//     @PutMapping("/{id}")
//     public User updateUser(@PathVariable Long id, @RequestBody User newUser) {
//         return userRepository.findById(id).map(user -> {
//             user.setName(newUser.getName());
//             user.setEmail(newUser.getEmail());
//             user.setBalance(newUser.getBalance());
//             User updatedUser = userRepository.save(user);
//             System.out.println("✏️ User Updated -> ID: " + updatedUser.getId() + " | Name: " + updatedUser.getName());
//             return updatedUser;
//         }).orElseGet(() -> {
//             System.out.println("❌ Update Failed. User Not Found with ID: " + id);
//             return null;
//         });
//     }

//     // Delete User
//     @DeleteMapping("/{id}")
//     public String deleteUser(@PathVariable Long id) {
//         userRepository.deleteById(id);
//         System.out.println("🗑️ User Deleted with ID: " + id);
//         return "User deleted with id " + id;
//     }
// }
