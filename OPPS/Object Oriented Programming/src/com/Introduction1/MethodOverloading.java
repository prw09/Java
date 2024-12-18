package com.Introduction1;

public class MethodOverloading {

    // Calculate the area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Overloaded method: Calculate the area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Overloaded method: Calculate the area of a triangle
    public double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return 0; // Return 0 if not a triangle (extra safeguard)
    }

    public static void main(String[] args) {
        MethodOverloading calculator = new MethodOverloading();

        // Calculate and display the area of a rectangle
        System.out.println("Area of Rectangle: " + calculator.calculateArea(5.0, 10.0));

        // Calculate and display the area of a circle
        System.out.println("Area of Circle: " + calculator.calculateArea(7.0));

        // Calculate and display the area of a triangle
        System.out.println("Area of Triangle: " + calculator.calculateArea(5.0, 8.0, true));
    }
}

