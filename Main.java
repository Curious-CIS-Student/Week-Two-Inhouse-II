/**
 * STUDENT:     Isaac Blasiman
 * CLASS:       CIS222 Object Oriented Programming
 * INSTRUCTOR:  Dr. Neumann
 * ASSIGNMENT:  Week-Two-Inhouse-II
 */
public class Main {

    public static void main(String[] args) {
        // Step 1:  Create several instances of the Money class using the various constructors.
        System.out.println("Creating three Money objects money1, money2, and money3,");
        System.out.println("with the monetary values $0.00, $53.30, and 4.60 respectively.");
        System.out.println();
        Money money1 = new Money();
        Money money2 = new Money(53,30);
        Money money3 = new Money(4,60);

        //Test the class by printing out the values using the getter methods and the toString method.
        System.out.println("TESTING PRINTING VALUES");
        System.out.println("Dollars and cents for money1 are " + money1.getDollars() +
                           " and " + money1.getCents() + ", and " +
                           "money1 is displayed as " + money1.toString() + ".");

        System.out.println("Dollars and cents for money2 are " + money2.getDollars() +
                " and " + money2.getCents() + ", and " +
                "money2 is displayed as " + money2.toString() + ".");

        System.out.println("Dollars and cents for money3 are " + money3.getDollars() +
                " and " + money3.getCents() + ", and " +
                "money3 is displayed as " + money3.toString() + ".");
        System.out.println();

        //Test the add method by adding together two instances of Money objects.
        System.out.println("TESTING THE ADD() METHOD");
        System.out.println("money2 + money3 = " + (money2.add(money3)).toString() + ".");
        System.out.println();

        //Does the Money class correctly handle all possibilities for input?  Did you check edge cases?
        //Also, for the purpose of this exercise, the Money object should not allow negative values.
        System.out.println("TESTING CONSTRUCTOR FOR DISALLOWING NEGATIVE VALUES");
        System.out.println("Result of trying to create a money object called negativeDollars with a negative dollars value:");
        Money negativeDollars = new Money(-3,0);
        System.out.println("Dollars and cents for negativeDollars are " + negativeDollars.getDollars() +
                " and " + negativeDollars.getCents() + ", and " +
                "negativeDollars is displayed as " + negativeDollars.toString() + ".");
        System.out.println();

        System.out.println("Result of trying to create a money object called negativeCents with a negative cents value:");
        Money negativeCents = new Money(6,-25);
        System.out.println("Dollars and cents for negativeCents are " + negativeCents.getDollars() +
                " and " + negativeCents.getCents() + ", and " +
                "negativeCents is displayed as " + negativeCents.toString() + ".");
        System.out.println();

        //Step 2:  Have the parameterized constructor normalize the arguments. That is, convert cents to dollars and cents if cents > 99.
        //Modify the add method to normalize the returned object as well.
        //Modify the constructor to zero out any negative inputs.
        System.out.println("TESTING NORMALIZING THE ARGUMENTS TO THE CONSTRUCTOR");
        System.out.println("Creating a new money object tooManyCents with dollars value of 10 and cents value of 225.");
        Money tooManyCents = new Money(10,225);
        System.out.println("Dollars and cents for tooManyCents are " + tooManyCents.getDollars() +
                " and " + tooManyCents.getCents() + ", and " +
                "tooManyCents is displayed as " + tooManyCents.toString() + ".");
        System.out.println();

        System.out.println("TESTING NORMALIZING THE ARGUMENTS TO THE ADD() METHOD");
        System.out.println("Creating two money objects addMoney1 and addMoney2, with monetary values of $3.60 and $5.80 respectively.");
        Money addMoney1 = new Money(3,60);
        Money addMoney2 = new Money(5,80);
        System.out.println("addMoney1 + addMoney2 = " + addMoney1.add(addMoney2));
        System.out.println();

        //Step 3:  Include a subtract method that subtracts the parameter from the instance to which it is applied.
        //There are several ways we can handle a resulting negative amount.  We could crash the program,
        //simply zero out the result, ignore the method if the result is zero, or throw an exception.
        //For now, if the result is negative, zero out the returning object and print an error message.  Later we will look at how to throw
        //an exception.
        System.out.println("TESTING SUBTRACT() METHOD");
        System.out.println("Creating two new money objects, biggerMoney and smallerMoney, with monetary values of $6.25 and 4.50 respectively.");
        Money biggerMoney = new Money(6,25);
        Money smallerMoney = new Money(4,50);
        System.out.println("biggerMoney.subtract(smallerMoney) = " + biggerMoney.subtract(smallerMoney) + ".");
        System.out.println();
        System.out.println("smallerMoney.subtract(biggerMoney) results in: ");
        Money result = (smallerMoney.subtract(biggerMoney));
        System.out.println("The dollars and cents values for the object returned by smallerMoney.subtract(biggerMoney) are " +
                result.getDollars() + " and " + result.getCents() + ".");
        System.out.println("The object returned a display value of " + result.toString() + ".");
    }
}
