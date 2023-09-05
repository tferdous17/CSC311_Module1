package org.example;

public class Main {
    public static void main(String[] args) {
        // Instantiate new course object and use overloaded constructor
        Course course1 = new Course(123, "Tasnim", "CSC311");
        System.out.println(course1.getName());

        // Utilize setters
        course1.setId(5678);
        course1.setName("Testname");
        course1.setCode("CSC555");

        System.out.println(course1.getName());
    }
}