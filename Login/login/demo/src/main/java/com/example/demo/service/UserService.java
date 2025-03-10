package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Create a new user
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get a user by ID
    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    // Get a user by Email
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    // Update a user
    public User updateUser(String id, User updatedUser) {
        return userRepository.findById(id).map(existingUser -> {
            // Only update fields that are provided (non-null)
            if (updatedUser.getFullName() != null) {
                existingUser.setFullName(updatedUser.getFullName());
            }
            if (updatedUser.getEmail() != null) {
                existingUser.setEmail(updatedUser.getEmail());
            }
            if (updatedUser.getPhoneNumber() != null) {
                existingUser.setPhoneNumber(updatedUser.getPhoneNumber());
            }
            if (updatedUser.getAge() != 0) { // Assuming age is an integer, checking if it's non-zero
                existingUser.setAge(updatedUser.getAge());
            }
            if (updatedUser.getGender() != null) {
                existingUser.setGender(updatedUser.getGender());
            }
            if (updatedUser.getCity() != null) {
                existingUser.setCity(updatedUser.getCity());
            }
//            if (updatedUser.getPassword() != null) { // If updating password, encode it
//                existingUser.setPassword(passwordEncoder.encode(updatedUser.getPassword()));
//            }

            return userRepository.save(existingUser);
        }).orElse(null); // Return null if user not found
    }


    // Delete a user
    public boolean deleteUser(String id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
