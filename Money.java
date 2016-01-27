/**
 * STUDENT:     Isaac Blasiman
 * CLASS:       CIS222 Object Oriented Programming
 * INSTRUCTOR:  Dr. Neumann
 * ASSIGNMENT:  Week-Two-Inhouse-II
 */
public class Money {
    private long dollars;
    private long cents;

    // Constructors

    /**
     * Empty constructor that sets dollars and cents to zero.
     */
    public Money() {
        dollars = 0;
        cents = 0;
    }

    /**
     * Constructor with parameter for dollars, cents
     */
    public Money(long dollars, long cents) {
        // Check that the amounts entered are reasonable.
        if (dollars >= 0 && cents >= 0){
            if (cents < 100) {
                this.dollars = dollars;
                this.cents = cents;
            }
            else { // Need to "roll over" extra cents over 100 into another dollar.
                this.dollars = dollars + (cents/100);
                this.cents = cents % 100;
            }
        }
        else {
            System.out.println("! ERROR: Dollars and cents must be positive. " +
                               "Setting dollars and cents to default values of 0.");
            this.dollars = 0;
            this.cents = 0;
        }
    }

    // Getters & Setters

    /**
     * Getter for dollars value
     */
    public long getDollars() {
        return dollars;
    }

    /**
     * Getter for cents value
     */
    public long getCents() {
        return cents;
    }

    // Public Methods

    /**
     * toString() method returns a formatted string for printing
     */
    public String toString() {
        String displayCents;
        // Add leading zeros to cents if necessary.
        if (cents < 10) {
            displayCents = "0" + cents;
        }
        else {
            displayCents = "" + cents;
        }
        return ("$" + dollars + "." + displayCents);
    }

    /**
     * add(Money value) binary operator
     * returns sum of object plus value
     */
    public Money add(Money value)
    {
        Money result = new Money();
        result.cents = cents + value.cents;
        result.dollars = dollars + value.dollars;
        // Only need to check if cents is greater than 100 since the
        // largest value that can result from an addition is 198
        if (result.cents >= 100) {
            ++result.dollars;
            result.cents -= 100;
        }
        return result;
    }

    /**
     * subtract(Money value) binary operator
     * returns the difference between object and value
     * returns an error if value is larger than the object calling the method
     */
    public Money subtract(Money value)
    {
        Money result = new Money();
        // Find the total cents values for the subtrahend (value) and the minuend (this), and compare them to make sure
        // that the subtrahend is smaller than the minuend.
        long myCentsAmount = (this.dollars * 100) + this.cents;
        long valueCentsAmount = (value.dollars * 100) + value.cents;
        long differenceBetween = myCentsAmount - valueCentsAmount;
        if (differenceBetween < 0) { // Subtraction will result in a negative money value
            System.out.println("! ERROR: Subtraction can't result in a negative Money value! " +
                    "Setting dollars and cents to default values of 0.");
        }
        else { // Proper values for subtraction
            result.dollars = differenceBetween / 100;
            result.cents = differenceBetween % 100;
        }
        return result;
        }
}
