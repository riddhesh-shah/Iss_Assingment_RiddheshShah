/*
* Exceptions in java
*   An exception is a problem that arises during the execution of a program
*   When an Exception occurs the normal flow of the program is disrupted and the program terminates abnormally
*   Types of exceptions
*       Checked exceptions
*           These are the exceptions that are checked by the compiler at compile time
*           If a method throws a checked exception, then the caller of the method must either handle the exception or declare it in the throws clause
*       Unchecked exceptions
*           These are the exceptions that are not checked by the compiler at compile time
*           They include runtime exceptions and errors
*   Keywords while using Exceptions in java
*       throw - Used to transfer control from the try block to the catch block
*       throws - Used for exception handling without try & catch block. It specifies the exceptions that a method can throw to the caller and does not handle itself
*       try - Contains a set of statements where an exception can occur
*       catch - To handle the uncertain condition of a try block. A try block is always followed by a catch block, which handles the exception that occurs in the associated try block
*       finally - It is executed after the catch block. We use it to put some common code to be executed irrespective of whether an exception has occurred or not
* */

/************************************************* Checked Exceptions ************************************************/

/*
* Problem
* The below code will generate an exception as IOExceptions are not handled
* */

/*
class CheckedExceptionDemo{

    public static void main(String args[]) {

        File file = new File("E://file.txt");
        FileReader fr = new FileReader(file);

    }

}
*/

/*
* Solution
* Add try catch or throws to handle the exception
* */

import java.io.*;

class UserDefinedException extends Exception{

    public String getMessage(){
        return "Message from getMessage() ";
    }

    public String toString(){
        return "Message from toString() ";
    }

    public void printStackTrace(){
        System.out.println("Message from printStackTrace() ");
    }

}

public class ExceptionDemo {

    static void methodToThrowUserDefinedException() throws UserDefinedException{
        throw new UserDefinedException();
    }

    public static void main(String args[]){

        /* Checked Exception */
        try {
            File file = new File("E://file.txt");
            FileReader fr = new FileReader(file);
        }catch (IOException ie){
            System.out.println("Exception: " + ie);
        }finally {
            System.out.println("This will be executed even if exception occurs or not");
        }

        /* Unchecked Exception */
        try{
            int num[] = {1, 2, 3, 4};
            System.out.println(num[5]);
        }catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Exception: " + ae);
        }catch (Exception e){
            System.out.println("Exception: " + e);
        }

        /* User Defined Exception */
        try {
            methodToThrowUserDefinedException();
        }catch (UserDefinedException ue){
            System.out.println("Exception: " + ue);
        }

        /*
        * try-with-resources
        * No need to write finally to close current FileReader object as once try is finished it will be freed
        * */
        try(FileReader fr = new FileReader("E://file.txt")){

        }catch (IOException ie){
            System.out.println("Exception: " + ie);
        }

    }

}