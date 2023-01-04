/*
* Three different classes to use string
*   1. String
*   2. StringBuilder
*   3. StringBuffer
* */

public class StringDemo {

    public static void main(String[] args) {

        /*
        * String Creation
        *   1. Normal creation
        *   2. Construcor creation
        *   3. Character array constructor creation
        * */

        /* Normal creation */
        String normalString = "String creation - Normal creation";

        /* Constructor creation */
        String constructorString = new String("String creation - Constructor string");

        /* Character array constructor creation */
        char[] characterArray = {'S', 't', 'r', 'i', 'n', 'g', ' ', 'c', 'r', 'e', 'a', 't', 'i', 'o', 'n', ' ', '-', ' ', 'C', 'h', 'a', 'r', 'a', 'c', 't', 'e', 'r', ' ', 'a', 'r', 'r', 'a', 'y'};
        String characterArrayConstructorString = new String(characterArray);

        /*
        * String method applications
        *   1. String length
        *   2. String concatenation
        *   3. Charcter at particular index
        *   4. String case change
        *   5. Index of character
        * */

        String demoString1 = "Demo String 1 ";
        String demoString2 = "Demo String 2 ";

        /* String length */
        int stringLength = demoString1.length();

        /* String concatenation */
        String concatenatedString = demoString1 + demoString2;

        /* Charcter at particular index */
        int characterIndex = 3;
        char character = demoString1.charAt(characterIndex);

        /* String case change */
        String uppercaseString = demoString1.toUpperCase();
        String lowercaseString = demoString1.toLowerCase();

        /* Index of character */
        String indexofCharacterRequired = "S";
        int index = demoString1.indexOf(indexofCharacterRequired);

        /* Display of outputs */
        System.out.println(normalString);
        System.out.println(constructorString);
        System.out.println(characterArrayConstructorString);
        System.out.println("Length of String: " + stringLength);
        System.out.println("Concatednated String: " + concatenatedString);
        System.out.println("Character at index " + characterIndex + " is: " + character);
        System.out.println("Lowercase of the string: " + lowercaseString);
        System.out.println("Uppercase of the string: " + uppercaseString);
        System.out.println("Index of character '" + indexofCharacterRequired + "' is: " + index);

    }

}