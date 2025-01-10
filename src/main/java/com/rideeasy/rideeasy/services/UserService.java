
package com.rideeasy.rideeasy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 import com.rideeasy.rideeasy.repository.UserRepository; 
 import com.rideeasy.rideeasy.entity.User;
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public String getUserById(Long id) {
        try {
            // Attempt to fetch the user by ID
            User a = userRepository.findById(id).orElse(null);
    
            // Check if user is null and handle accordingly
            if (a == null) {
                // You can log this or throw a custom exception
                System.out.println("User not found with ID: " + id);
                return "User not found";  // Or throw an exception
            }
    
            // Log and return the username
            System.out.print("Check one: " + a.getUsername());
            return a.getUsername();
        } catch (Exception e) {
            // Catch any exception that occurs during the process
            System.err.println("Error fetching user with ID: " + id);
            e.printStackTrace();  // Print stack trace for debugging
            return "Error occurred while fetching user";  // Return a generic error message
        }
    }
    
}
