
/* Steve Stylin, Java for Programmers: Module 12.2  */

public class AutoServiceCost {

    // Standard service charge
    private static final double STANDARD_SERVICE_CHARGE = 100.00;
    private static final double OIL_CHANGE_FEE = 30.00;
    private static final double TIRE_ROTATION_CHARGE = 20.00;

    /**
     * Method to calculate the standard service charge.
     * @return The standard service charge.
     */
    public double yearlyService() {
        return STANDARD_SERVICE_CHARGE;
    }

    /**
     * Method to calculate the service charge with an oil change fee.
     * @param oilChange Indicates if an oil change is included.
     * @return The total service charge including oil change fee.
     */
    public double yearlyService(boolean oilChange) {
        return oilChange ? STANDARD_SERVICE_CHARGE + OIL_CHANGE_FEE : STANDARD_SERVICE_CHARGE;
    }

    /**
     * Method to calculate the service charge with an oil change and tire rotation fee.
     * @param oilChange Indicates if an oil change is included.
     * @param tireRotation Indicates if a tire rotation is included.
     * @return The total service charge including oil change and tire rotation fees.
     */
    public double yearlyService(boolean oilChange, boolean tireRotation) {
        double total = STANDARD_SERVICE_CHARGE;
        if (oilChange) total += OIL_CHANGE_FEE;
        if (tireRotation) total += TIRE_ROTATION_CHARGE;
        return total;
    }

    /**
     * Method to calculate the service charge with an oil change, tire rotation, and a coupon deduction.
     * @param oilChange Indicates if an oil change is included.
     * @param tireRotation Indicates if a tire rotation is included.
     * @param couponAmount The amount to be deducted from the total.
     * @return The total service charge after applying the coupon.
     */
    public double yearlyService(boolean oilChange, boolean tireRotation, double couponAmount) {
        double total = yearlyService(oilChange, tireRotation);
        return total - couponAmount;
    }

    public static void main(String[] args) {
        AutoServiceCost serviceCost = new AutoServiceCost();

        // Testing the methods
        System.out.println("Standard Service Charge: $" + serviceCost.yearlyService());
        System.out.println("Service Charge with Oil Change: $" + serviceCost.yearlyService(true));
        System.out.println("Service Charge with Oil Change and Tire Rotation: $" + serviceCost.yearlyService(true, true));
        System.out.println("Service Charge with Oil Change, Tire Rotation, and Coupon: $" + serviceCost.yearlyService(true, true, 15.00));
        
        // Additional tests
        System.out.println("Standard Service Charge (Test 2): $" + serviceCost.yearlyService());
        System.out.println("Service Charge with Oil Change (Test 2): $" + serviceCost.yearlyService(true));
        System.out.println("Service Charge with Oil Change and Tire Rotation (Test 2): $" + serviceCost.yearlyService(true, true));
        System.out.println("Service Charge with Oil Change, Tire Rotation, and Coupon (Test 2): $" + serviceCost.yearlyService(true, true, 10.00));
    }
}
