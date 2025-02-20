/* Steve Stylin Module 10: Abstract Classes and Interfaces*
 * Abstract class representing a company's division.
 */
public abstract class Division {
    //private String divisionName;
    //private String accountNumber;
    protected String divisionName; // Change to protected
    protected String accountNumber; // Change to protected

    /**
     * Constructor for Division class.
     * 
     * @param divisionName Name of the division.
     * @param accountNumber Account number of the division.
     */
    public Division(String divisionName, String accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    /**
     * Abstract method to display division details.
     */
    public abstract void display();
}
