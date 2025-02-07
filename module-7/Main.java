class Bicycle {
    // Attributes of the Bicycle class
    private String color;
    private int gear;

    // Constructor to initialize Bicycle objects
    public Bicycle(String color, int gear) {
        this.color = color;
        this.gear = gear;
    }

    // Method to display bicycle details
    public void displayDetails() {
        System.out.println("Bicycle Color: " + color + ", Gear: " + gear);
    }

    // Method to change gear
    public void changeGear(int newGear) {
        this.gear = newGear;
        System.out.println("Gear changed to: " + gear);
    }
}

public class Main {
    public static void main(String[] args) {
        Bicycle myBicycle = new Bicycle("Red", 5);
        myBicycle.displayDetails(); // Output: Bicycle Color: Red, Gear: 5
        myBicycle.changeGear(7);    // Output: Gear changed to: 7
    }
}
