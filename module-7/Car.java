// Steve Stylin Module 7: this reference

public class Car {
    private String model;
    private int year;
    private String make;

    // Constructor
    public Car(String model, int year, String make) {
        this.model = model; // 'this.model' refers to the instance variable
        this.year = year;   // 'this.year' refers to the instance variable
        this.make = make;  // 'this.year' refers to the instance variable 
    }

    // Method to display car details
    public void displayInfo() {
        System.out.println("Car Model: " + this.model); // car model
        System.out.println("Car Year: " + this.year);  // car year
        System.out.println("Car Year: " + this.make);  // car maker
    }

    public static void main(String[] args) {
        Car myCar = new Car("Forester", 2019, "Subaru");
        myCar.displayInfo();
    }
}
