/*
 * Final Keyword
 *   1. Final Variables
 *       Final keyword before variable makes the variable constant. This means once the value assigned to variable cannot be changed further
 *   2. Final Methods
 *       Final method cannot be overridden by any subclasses. Final modifier prevents a method from being modified in a subclass
 *   3. Final Class
 *       Final class declared once then  no class can inherit any feature from the final class
 * */

final class FinalClass{
    /* This class can only be used explicitly and cannot be inherited */
}

class DemoClass {
    final String finalVariable = "This is a constant. Value cannot be changed now";

    final void methodWhichCannotBeOverridden(){
        /* This method cannot be overridden */
    }
}

/* Below code will generate an error as Final class has been extended */
/*
class ExtendFinalClassDemo extends FinalClass {

}
*/

class ExtendDemoClass extends DemoClass {
    /* Below code will generate an error as Final method cannot be overidden */
    /*
    final void methodWhichCannotBeOverridden(){

    }
    */
}

/*
* Variable Types in Java
*   Local variable: This is a variable that is declared inside the body of a method
*   Instance variable: They are object-specific variables, which is why they are known by this name
*   Static variable: This variable is initialized only once, just when the program execution starts using 'STATIC' keyword
* */

/*
* Modifier Types in Java
*   Private
*       Accessible - Same class
*   Protected
*       Accessible - Same class, Same package, Different package but subclass
*   Default
*       Accessible - Same class, Same package
*   Public
*       Accessible - Same class, Same package, Different package
* */

/*
* Types of constructors in java
*   No parameter Constructor - Constructor with no parameters to be passed
*   Parameterized Constructor - Constructor having parameters to be passed
*   Default Constructor - Constructor with no parameters. Created by compiler if no other constructor is created. It is an invisible constructor
* */

public class BasicFunctionalitiesOfJava {

    static String staticVariable = "This is a static variable";

    void functionForVariableTypes(){
        String localVariable = "This is a local variable";
        System.out.println(localVariable);
    }

    private String privateVariable = "This is a private variable";
    protected String protectedVariable = "This is a protected variable";
    String defaultVariable = "This is a default variable";
    public String publicVariable = "This is a public variable";

    /* getter for private variable */
    public String getPrivateVariable(){
        return privateVariable;
    }

    public BasicFunctionalitiesOfJava(){
        System.out.println("This is a no parameter constructor");
    }

    public BasicFunctionalitiesOfJava(String parameter){
        System.out.println("This is a parameterized constructor. Parameter: " + parameter);
    }

    /*
    * As 2 constructors are created above default constructor won't be created. Default constructor is only created if there are no user defined constructors
    * */

    public static void main(String[] args) {

        String instanceVariable = "This is an instance variable";

        /*
         * Datatypes
         *   1. byte
         *   2. short
         *   3. int
         *   4. long
         *   5. float
         *   6. double
         *   7. boolean
         *   8. char
         * */

        /*
         * byte
         * Range: -128 to 127
         * */
        byte byteData = 100;

        /*
         * short
         * Range: -32768 to 32767
         * */
        short shortData = 10000;

        /*
         * int
         * Range: - 2147483648 to 2147483647
         * */
        int intData = 450000;

        /*
         * long
         * */
        long longData = 10000000L;

        /*
         * float
         * */
        float floatData = 3.14F;

        /*
         * double
         * */
        double doubleData = 76.345;

        /*
         * boolean
         * Range: true or false
         * */
        boolean booleanData = true;

        /*
         * char
         * */
        char charData = 'a';

        /* Display of outputs */
        BasicFunctionalitiesOfJava basicFunctionalitiesOfJava = new BasicFunctionalitiesOfJava();

        System.out.println("Byte Data: " + byteData);
        System.out.println("Short Data: " + shortData);
        System.out.println("Int Data: " + intData);
        System.out.println("Long Data: " + longData);
        System.out.println("Float Data: " + floatData);
        System.out.println("Double Data: " + doubleData);
        System.out.println("Boolean Data: " + booleanData);
        System.out.println("Char Data: " + charData);

        System.out.println(instanceVariable);
        System.out.println(BasicFunctionalitiesOfJava.staticVariable);
        basicFunctionalitiesOfJava.functionForVariableTypes();

        System.out.println(basicFunctionalitiesOfJava.getPrivateVariable());
        System.out.println(basicFunctionalitiesOfJava.protectedVariable);
        System.out.println(basicFunctionalitiesOfJava.defaultVariable);
        System.out.println(basicFunctionalitiesOfJava.publicVariable);

        System.out.println(new BasicFunctionalitiesOfJava());
        System.out.println(new BasicFunctionalitiesOfJava("This is a parameter"));

    }

}