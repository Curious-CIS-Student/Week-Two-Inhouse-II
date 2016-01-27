public class Money {
    private long dollars;
    private long cents;

    // Constructors
// Made a change
    /**
     * Empty constructor that sets dollars and cents to zero.
     */

    /**
     * Constructor with parameter for dollars, cents
     */

    // Getters & Setters

    /**
     * Getters for private variables
     */

    // Public Methods

    /**
     * toString() method returns a formatted string for printing
     */

    /**
     * add(Money value) binary operator
     * returns sum of object plus value
     */
    public Money add(Money value)
    {
        Money result = new Money();
        result.cents = cents + value.cents;
        result.dollars = dollars + value.dollars;
        return result;
    }
}
