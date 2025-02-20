/*Steve Stylin Module 10: Abstract Classes and Interfaces *
 * Application to demonstrate the use of Division classes.
 */
public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision intDiv1 = new InternationalDivision("Global Sales", "INT123", "Mexico", "Spanish");
        InternationalDivision intDiv2 = new InternationalDivision("European Operations", "INT456", "Italy", "Italian");
        
        DomesticDivision domDiv1 = new DomesticDivision("Northeast Coast Sales", "DOM123", "New Hampshire");
        DomesticDivision domDiv2 = new DomesticDivision("South Coast Sales", "DOM456", "South Carolina");

        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
