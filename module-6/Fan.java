public class Fan {
    /*Steve Stylin
     Module 6.2: Introduction: Objects and Classes
     */

    // Constants for fan speeds
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    // Constructor with parameters
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and setter methods
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    @Override
    public String toString() {
        if (on) {
            return "Fan is on with speed " + speed + ", radius " + radius + ", and color " + color + ".";
        } else {
            return "Fan is off.";
        }
    }

    // Test code
    public static void main(String[] args) {
        // Creating a Fan instance using the default constructor
        Fan defaultFan = new Fan();
        System.out.println(defaultFan.toString());

        // Creating a Fan instance using the argument constructor
        Fan customFan = new Fan(MEDIUM, true, 7, "Orange");
        System.out.println(customFan.toString());
    }
}
