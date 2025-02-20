/*Steve Stylin Module 10: Abstract Classes and Interfaces*
 * Class representing an international division.
 */
public class InternationalDivision extends Division {
    private String country;
    private String language;

    /**
     * Constructor for InternationalDivision class.
     * 
     * @param divisionName Name of the division.
     * @param accountNumber Account number of the division.
     * @param country Country where the division is located.
     * @param language Language spoken in the division.
     */
    public InternationalDivision(String divisionName, String accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division: " + super.divisionName + 
                           ", Account Number: " + super.accountNumber + 
                           ", Country: " + country + 
                           ", Language: " + language);
    }
}
