import javax.swing.JOptionPane;

public class WaterHeatingEnergy {
    // Author: Steve Stylin
	// Bellevue University
    // Class: Java for Programmers
	//Module: M1

    public static void main(String[] args) {
        // Prompt user for input
        String waterMassInput = JOptionPane.showInputDialog("Enter the mass of water in kilograms:");
        String initialTempInput = JOptionPane.showInputDialog("Enter the initial temperature in Celsius:");
        String finalTempInput = JOptionPane.showInputDialog("Enter the final temperature in Celsius:");

        // Parse the input values
        double waterMass = Double.parseDouble(waterMassInput);
        double initialTemperature = Double.parseDouble(initialTempInput);
        double finalTemperature = Double.parseDouble(finalTempInput);

        // Calculate the energy required
        double energyRequired = calculateEnergy(waterMass, initialTemperature, finalTemperature);

        // Display the result
        JOptionPane.showMessageDialog(null, "The energy required to heat the water is: " + energyRequired + " Joules");
    }

    public static double calculateEnergy(double waterMass, double initialTemperature, double finalTemperature) {
        return waterMass * (finalTemperature - initialTemperature) * 4184;
    }
}
