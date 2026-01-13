package com.assignment;



class JobRegistration {
    static void register(int age) throws InvalidAgeException {
        if (age < 21 || age > 35) {
            throw new InvalidAgeException("Registration failed! Age must be between 21 and 35.");
        }
        System.out.println("Registration successful!");
    }

    public static void main(String[] args) {
        try {
            register(22);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}