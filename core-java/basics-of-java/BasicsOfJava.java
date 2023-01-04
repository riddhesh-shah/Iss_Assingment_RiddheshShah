/*
* Basic concepts of java
*   Object − Objects have states and behaviors
*   Class − A class can be defined as a template that describes the state that the object of its type supports
*   Methods − A method is basically a behavior
*   Instance Variables − Each object has its unique set of instance variables. An object's state is created by the values assigned to these instance variables
* */

public class BasicsOfJava {

    BasicsOfJava(){
        System.out.println("Object of BasicOfJava has been created");
    }

    void printMessage(){
        System.out.println("This is the method of class used by an object");
    }

    public static void main(String[] args) {

        BasicsOfJava instanceObject = new BasicsOfJava();
        instanceObject.printMessage();

    }

}