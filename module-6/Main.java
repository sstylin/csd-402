

// Steve Stylin: Module 6: Creating a Class vs. Creating an Object
// Defining a class named Car
class Car {
    // Attributes
    String color;
    String model;

    // Constructor
    Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Model: " + model + ", Color: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Red", "Toyota");
        myCar.displayDetails(); // Output: Car Model: Toyota, Color: Red
    }
}
