package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        System.out.println(p.product(5, 10));   // Calls product(int, int)
        System.out.println(p.product(2, 3, 4)); // Calls product(int, int, int)
        System.out.println(p.product(2.5, 4.5)); // Calls product(double, double)
    }
}

class Product {
    public int product(int x, int y) {
        return x * y;
    }

    public int product(int x, int y, int z) {
        return x * y * z;
    }

    public double product(double x, double y) {
        return x * y;
    }
}
