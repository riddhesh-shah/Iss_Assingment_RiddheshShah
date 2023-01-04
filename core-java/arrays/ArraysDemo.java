/*
* Declaring Arrays in java
*   Declaring every variable as an array
*       dataType[] arr1, arr2, arr3;
*   Declaring single variable as an array
*       dataType arr1[], arr2[];
* */

/*
* Initializing Arrays in java
*   Static intialization with data
*       dataType[] arr1 = {1,2,3,4,5};
*   Memory Size initialization
*       dataType[] arr1 = new dataType[size];
* */

/*
* Processing Arrays in java
*   Looping statements are used to process arrays
* */

/*
* Passing Arrays to Methods
*   Just as you can pass primitive type values to methods you can also pass arrays to methods
*   As arrays are objects in java and Objects are 'pass by value' in java therefore arrays are also 'pass by value'
* */


import java.util.Arrays;
public class ArraysDemo {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        /* Declaring every variable as an array */
        int[] numArray2, numArray3;
        /* Declaring single variable as an array */
        int numArray5[], numArray6[];

        /* Static intialization with data */
        int numArray1[] = {1,2,3,4,5};
        /* Memory Size initialization */
        int numArray4[] = new int[10];

        /* Processing arrays - for loop (initialize) */
        for(int i=0;i < numArray4.length;i++){
            numArray4[i] = i;
        }

        /* Processing arrays - foreach loop (display) */
        System.out.println("Displaying numArray4 using foreach loop");
        for(int num: numArray4){
            System.out.print(num + " ");
        }
        System.out.println();

        /*
        * Arrays methoda applications
        *   Searching an element
        *   Comparing arrays
        *   Initializing arrays
        *   Sorting Arrays
        * */

        /* Searching an element */
        System.out.println("Index of element is: " + Arrays.binarySearch(numArray1, 1));
        /* Comparing arrays */
        System.out.println("numArray1 and numArray are equal?: " + Arrays.equals(numArray1, numArray4));
        /* Initializing arrays */
        Arrays.fill(numArray4, 14);
        System.out.println("Filled Array: ");
        printArray(numArray4);
        /* Sorting Arrays */
        Arrays.sort(numArray1);
        System.out.println("Sorted Array: ");
        printArray(numArray1);

        /* Display of outputs */
        printArray(numArray1);
        printArray(numArray4);

    }

}