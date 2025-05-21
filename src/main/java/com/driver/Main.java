package com.driver;

public class Main {
    public static void main(String[] args) {
        // Creating object of Product class
        Product p = new Product();

        // Calling overloaded methods
        System.out.println(p.product(5, 10));        // Calls product(int, int)
        System.out.println(p.product(2, 3, 4));      // Calls product(int, int, int)
        System.out.println(p.product(2.5, 4.5));     // Calls product(double, double)
    }
}

// Task 1: Creating Product class inside Main class
class Product {

    // Task 3: Method with two int parameters
    public int product(int x, int y) {
        return x * y;
    }

    // Task 4: Overloaded method with three int parameters
    public int product(int x, int y, int z) {
        return x * y * z;
    }

    // Task 5: Overloaded method with two double parameters
    public double product(double x, double y) {
        return x * y;
    }
}
