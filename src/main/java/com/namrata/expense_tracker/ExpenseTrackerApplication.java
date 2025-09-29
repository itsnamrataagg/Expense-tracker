package com.namrata.expense_tracker;
//import java.util.List;
//import java.util.Scanner;

// import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Bean;
// import com.namrata.expense_tracker.model.User;



//import com.namrata.expense_tracker.repository.UserRepository;

@SpringBootApplication
public class ExpenseTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrackerApplication.class, args);
	}
}
	 //@Bean
    //public CommandLineRunner run(UserRepository userRepository) {
       // return args -> {
           // Scanner sc = new Scanner(System.in);
           // int choice;

           // do {
                //System.out.println("\n==== Expense Tracker Menu ====");
                //System.out.println("1. Add User");
                //System.out.println("2. Update User");
                //System.out.println("3. View All Users");
                //System.out.println("4. Delete User");
               // System.out.println("5. Exit");
               // System.out.print("Enter your choice: ");
                //choice = sc.nextInt();
                //sc.nextLine();

//                 switch (choice) {
//                     case 1 -> {
//                         System.out.print("Enter Name: ");
//                         String name = sc.nextLine();
//                         System.out.print("Enter Email: ");
//                         String email = sc.nextLine();
//                         System.out.print("Enter Balance: ");
//                         double balance = sc.nextDouble();
//                         sc.nextLine();
//                          if (userRepository.existsByEmail(email)) {
//         System.out.println("❌ User with this email already exists!");
//     } else {
                        

//                         User user = new User();
//                         user.setName(name);
//                         user.setEmail(email);
//                         user.setBalance(balance);

//                         userRepository.save(user);
//                         System.out.println("✅ User Added Successfully!");
//                     }
//                 }
//                 case 2 -> {
//     System.out.print("Enter User ID to update: ");
//     Long id = sc.nextLong();
//     sc.nextLine(); // consume newline

//     User existing = userRepository.findById(id).orElse(null);
//     if (existing != null) {
//         System.out.print("Enter New Name (press Enter to keep same): ");
//         String name = sc.nextLine();
//         if (!name.isEmpty()) existing.setName(name);

//         System.out.print("Enter New Email (press Enter to keep same): ");
//         String email = sc.nextLine();
//         if (!email.isEmpty()) {
//             User userWithEmail = userRepository.findByEmail(email);
//             if (userWithEmail == null || userWithEmail.getId().equals(existing.getId())) {
//                 existing.setEmail(email);
//             } else {
//                 System.out.println("❌ Email already in use by another user! Keeping old email.");
//             }
//         }

//         System.out.print("Enter New Balance (enter -1 to keep same): ");
//         double balance = sc.nextDouble();
//         sc.nextLine(); // consume newline
//         if (balance >= 0) existing.setBalance(balance);

//         userRepository.save(existing);
//         System.out.println("✅ User Updated Successfully!");
//     } else {
//         System.out.println("❌ User Not Found!");
//     }
// }


// 					case 2 -> {
//     System.out.print("Enter User ID to update: ");
//     Long id = sc.nextLong();
//     sc.nextLine();

//     User existing = userRepository.findById(id).orElse(null);
//     if (existing != null) {
//         System.out.print("Enter New Name (press Enter to keep same): ");
//         String name = sc.nextLine();
//         if (!name.isEmpty()) existing.setName(name);

//         System.out.print("Enter New Email (press Enter to keep same): ");
//         String email = sc.nextLine();
//         if (!email.isEmpty()) existing.setEmail(email);

//         System.out.print("Enter New Balance (enter -1 to keep same): ");
//         double balance = sc.nextDouble();
//         sc.nextLine();
//         if (balance >= 0) existing.setBalance(balance);

//         userRepository.save(existing);
//         System.out.println("✅ User Updated Successfully!");
//     } else {
//         System.out.println("❌ User Not Found!");
//     }
// }
  

                    // case 2 -> {
                    //     System.out.print("Enter User ID to update: ");
                    //     Long id = sc.nextLong();
                    //     sc.nextLine();

                    //     User existing = userRepository.findById(id).orElse(null);
                    //     if (existing != null) {
                    //         System.out.print("Enter New Name: ");
                    //         existing.setName(sc.nextLine());
                    //         System.out.print("Enter New Email: ");
                    //         existing.setEmail(sc.nextLine());
                    //         System.out.print("Enter New Balance: ");
                    //         existing.setBalance(sc.nextDouble());

                    //         userRepository.save(existing);
                    //         System.out.println("✅ User Updated Successfully!");
                    //     } else {
                    //         System.out.println("❌ User Not Found!");
                    //     }
                    // }

                //     case 3 -> {
                //         List<User> users = userRepository.findAll();
                //         if (users.isEmpty()) {
                //             System.out.println("No users found.");
                //         } else {
                //             System.out.println("\n--- All Users ---");
                //             users.forEach(System.out::println);
                //         }
                //     }

                //     case 4 -> {
                //         System.out.print("Enter User ID to delete: ");
                //         Long id = sc.nextLong();
                //         userRepository.deleteById(id);
                //         System.out.println("✅ User Deleted Successfully!");
                //     }

                //     case 5 -> System.out.println("Exiting... Bye!");

                //     default -> System.out.println("❌ Invalid choice, try again.");
                // }

           // } while (choice != 5);
       // };
    //}

//}
