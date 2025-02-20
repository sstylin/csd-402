/*  Steve Stylin Module 10: Rational Class*/

public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    private void reduce() {
        int rtn = rtn(numerator, denominator);
        numerator /= rtn;
        denominator /= rtn;
    }

    private int rtn(int a, int b) {
        return b == 0 ? a : rtn(b, a % b);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        RationalNumber r1 = new RationalNumber(8, 4);
        RationalNumber r2 = new RationalNumber(5, 9);
        System.out.println("RationalNumber number 1: " + r1);
        System.out.println("RationalNumber number 2: " + r2);
    }
}
