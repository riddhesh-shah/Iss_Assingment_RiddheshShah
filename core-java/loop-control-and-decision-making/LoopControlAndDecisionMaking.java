/*
* Types of loops in java
*   for loop - Execute a sequence of statements multiple times and abbreviates the code that manages the loop variable
*   while loop - Repeats a statement or group of statements while a given condition is true. It tests the condition before executing the loop body
*   do-while loop - Like a while statement, except that it tests the condition at the end of the loop body
* */

/*
* Loop control statments in java
*   break - Terminates the loop or switch statement and transfers execution to the statement immediately following the loop or switch
*   continue - Causes the loop to skip the remainder of its body and immediately retest its condition prior to reiterating
* */

/*
* Decision making statements in java
*   if - An if statement consists of a boolean expression followed by one or more statements
*   if..else - An if statement can be followed by an optional else statement, which executes when the boolean expression is false
*   nested if - You can use one if or else if statement inside another if or else if statement
*   switch - A switch statement allows a variable to be tested for equality against a list of values
* */

public class LoopControlAndDecisionMaking {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void numberTypeUsingIfElse(int number){
        String type = "";
        if(number < 0){
            type = "negative";
        } else if (number > 0) {
            type = "positive";
        }else {
            type = "zero";
        }
        System.out.println("This given number " + number + " is: " + type);
    }

    public static void gradingUsingSwitchCase(char grade){
        switch(grade) {
            case 'A' :
                System.out.println("Excellent!");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");
            case 'F' :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
        }
    }

    public static void main(String[] args) {

        int[] forLoopArray = new int[10];
        int[] whileLoopArray = new int[10];
        int[] doWhileLoopArray = new int[10];

        /* for loop */
        for(int i=0;i<forLoopArray.length;i++){
            forLoopArray[i] = i+1;
        }
        System.out.println("For loop Array: ");
        printArray(forLoopArray);

        /* while loop */
        int tempLengthForWhileLoop = 0;
        while(tempLengthForWhileLoop<whileLoopArray.length){
            if(tempLengthForWhileLoop == 5){
                break;
            }
            whileLoopArray[tempLengthForWhileLoop] = tempLengthForWhileLoop+1;
            tempLengthForWhileLoop++;
        }
        System.out.println("While loop Array: ");
        printArray(whileLoopArray);

        /* do while loop */
        int tempLengthForDoWhileLoop = 0;
        do{
            if(tempLengthForDoWhileLoop == 5){
                tempLengthForDoWhileLoop++;
                continue;
            }
            doWhileLoopArray[tempLengthForDoWhileLoop] = tempLengthForDoWhileLoop+1;
            tempLengthForDoWhileLoop++;
        }while(tempLengthForDoWhileLoop<doWhileLoopArray.length);
        System.out.println("Do While loop Array: ");
        printArray(doWhileLoopArray);

        /* Display of outputs */
        numberTypeUsingIfElse(1);
        gradingUsingSwitchCase('A');

    }

}