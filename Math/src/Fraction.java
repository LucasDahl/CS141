/**
 * This class will create a Fraction object. The class will allow to call methods, such as equal,
 * multiple, and getDecimalValue to help people use fractions and understand them.
 *
 * @author Lucas D. Dahl
 * @version 8/14/20
 */
public class Fraction {

    // **************************** Fields ****************************
    private int numerator;
    private int denominator;

    // ************************** Constructors *************************

    /**
     * This constructor will set the numerator and denominator
     * fields based on the parameters.
     *
     * @param numerator This will set the numerator field.
     * @param denominator This will set the denominator field.
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;

        if(denominator == 0) {
            this.denominator = 1;
        } else {
            this.denominator = denominator;
        }
    }

    /**
     * This constructor will set the fraction to 1/1 or just 1.
     */
    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    // **************************** Methods ****************************

    @Override
    public String toString() {
        if(denominator == 1) {
            return " " + numerator;
        }
        return " " + numerator + "/" + denominator + " ";
    }

    /**
     * THis method will return the current numerator.
     *
     * @return Returns the numerator.
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * This method will return the current denominator.
     *
     * @return Returns the denominator.
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * This method will get the decimal value
     * of the fraction object.
     *
     * @return Returns the decimal value.
     */
    public double getDecimalValue() {
        return (double)numerator / (double)denominator;
    }

    /**
     * This method will set numerator.
     *
     * @param x Will replace the current numerator.
     */
    public void setNumerator(int x) {
        numerator = x;
    }

    /**
     * This method will set the denominator.
     *
     * @param x Replaces the current denominator.
     */
    public void setDenominator(int x) {
        if(x != 0) {
            denominator = x;
        }
    }

    /**
     * This method takes in a fraction and compares it to
     * another to determine if they are equal or not.
     *
     * @return This returns a bool based on if the fraction is equal to another.
     */
    public Boolean equals(Fraction fraction) {

        if(this.getDecimalValue() == fraction.getDecimalValue()) {
            return true;
        }

        return false;

    }

    /**
     * This parameter will multiply the current fraction
     * with another, without changing the parameter fraction.
     *
     * @param fraction This is the passed in fraction to multiply by.
     */
    public void multiply(Fraction fraction) {
        numerator = numerator * fraction.numerator;
        denominator = denominator * fraction.denominator;
    }

}
