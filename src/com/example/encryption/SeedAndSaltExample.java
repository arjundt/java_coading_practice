package com.example.encryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Random;

public class SeedAndSaltExample {

    // Generate a reproducible random number using a SEED
    public static int generateRandomNumberWithSeed(long seed) {
        Random seededRandom = new Random(seed); // same seed → same sequence
        return seededRandom.nextInt(100); // number between 0-99
    }

    // Generate a secure random SALT for password hashing
    public static byte[] generateSalt() {
        byte[] salt = new byte[16]; // 128-bit salt
        SecureRandom sr = new SecureRandom();
        sr.nextBytes(salt);
        return salt;
    }

    // Hash a password with a given salt using SHA-256
    public static String hashPassword(String password, byte[] salt) throws NoSuchAlgorithmException {
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(salt); // add salt before hashing
        byte[] hashedBytes = md.digest(password.getBytes());
        return Base64.getEncoder().encodeToString(hashedBytes);
    }

    public static void main(String[] args) {
        try {
            // 1️⃣ Demonstrate SEED usage
            long seed = 12345L;
            int randomNumber1 = generateRandomNumberWithSeed(seed);
            int randomNumber2 = generateRandomNumberWithSeed(seed);
            System.out.println("Random number with seed (first run): " + randomNumber1);
            System.out.println("Random number with seed (second run, same seed): " + randomNumber2);

            // 2️⃣ Demonstrate SALT usage for password hashing
            String password = "MySecurePassword123!";
            byte[] salt = generateSalt();
            String hashedPassword = hashPassword(password, salt);

            System.out.println("\nSalt (Base64): " + Base64.getEncoder().encodeToString(salt));
            System.out.println("Hashed Password (Base64): " + hashedPassword);
            
            byte[] salt1 = generateSalt();
            String hashedPassword1 = hashPassword(password, salt1);

            System.out.println("\nSalt (Base64): " + Base64.getEncoder().encodeToString(salt1));
            System.out.println("Hashed Password (Base64): " + hashedPassword1);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}