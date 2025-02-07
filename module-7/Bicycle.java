/* Steve Stylin
 * Module 7: Objects with Methods and Methods Receiving Instances
 */

 import javax.swing.*;

 public class Bicycle {
     private String color;
     private int gear;
 
     // Constructor
     public Bicycle(String color, int gear) {
         this.color = color;
         this.gear = gear;
     }
 
     // Method to display bicycle details
     public void displayDetails() {
         System.out.println("Bicycle Color: " + color);
         System.out.println("Bicycle Gear: " + gear);
     }
 
     // Method to create a Bicycle instance from user input
     public static Bicycle createBicycle() {
         String color = JOptionPane.showInputDialog("Enter Bicycle Color:");
         String gearInput = JOptionPane.showInputDialog("Enter Bicycle Gear:");
         int gear = Integer.parseInt(gearInput);
         return new Bicycle(color, gear);
     }
 
     public static void main(String[] args) {
         Bicycle myBicycle = Bicycle.createBicycle();
         myBicycle.displayDetails();
     }
 }
 