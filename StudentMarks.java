package com.assignment;



class StudentMarks {
    static void saveMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Invalid marks! Enter value between 0 and 100.");
        }
        System.out.println("Marks saved successfully!");
    }

    public static void main(String[] args) {
        try {
            saveMarks(120);
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}//exception
class InvalidMarksException extends Exception {
    public InvalidMarksException(String msg) {
        super(msg);
    }
}

