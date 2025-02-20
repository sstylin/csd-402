/*Steve Stylin Module 10: Abstract Classes and Interfaces*
 * Class representing a domestic division.
 */
public class DomesticDivision extends Division {
    private String state;

    /**
     * Constructor for DomesticDivision class.
     * 
     * @param divisionName Name of the division.
     * @param accountNumber Account number of the division.
     * @param state State where the division is located.
     */
    public DomesticDivision(String divisionName, String accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Domestic Division: " + super.divisionName + 
                           ", Account Number: " + super.accountNumber + 
                           ", State: " + state);
    }
}
