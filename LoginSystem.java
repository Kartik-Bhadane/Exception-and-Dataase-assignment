package com.assignment;


class LoginSystem {
    static int attempts = 0;

    static void login(boolean success) throws LoginAttemptExceededException {
        if (!success) {
            attempts++;
            if (attempts > 3) {
                throw new LoginAttemptExceededException("Account locked! Too many invalid login attempts.");
            }
            System.out.println("Invalid login attempt " + attempts);
        } else {
            System.out.println("Login successful!");
        }
    }

    public static void main(String[] args) {
        try {
            login(false);
            login(false);
            login(false);
            login(false);
        } catch (LoginAttemptExceededException e) {
            System.out.println(e.getMessage());
        }
    }
}
class LoginAttemptExceededException extends Exception {
    public LoginAttemptExceededException(String msg) {
        super(msg);
    }
}
