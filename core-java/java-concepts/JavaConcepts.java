/*
* Inheritance in java
*   Inheritance can be defined as the process where one class acquires the properties of another
*   extends is the keyword used to inherit the properties of a class
*   Types of inheitance in java
*       Single-level inheritance - Only one class is derived from the parent class
*       Multi-level Inheritance - One class inherits the features from a parent class and the newly created sub-class becomes the base class for another new class
*       Hierarchical Inheritance - Multiple classes are being derived from one superclass
*       Multiple Inheritance - Type of inheritance where a subclass can inherit features from more than one parent class. In java this type of inheritance can only be acheived using interfaces
*       Hybrid Inheritance - A combination of more than two types of inheritances
*   Keywords while using inheritance
*       extends - Creating a subclass of the base class you are extending
*       implements - Using the elements of a Java Interface in your class
*       super
*           super can be used to refer immediate parent class instance variable
*           super can be used to invoke immediate parent class method
*           super() can be used to invoke immediate parent class constructor
* */

/*
* Interfaces in java
*   an abstract type used to specify the behavior of a class
* */

/*
* Overriding in java
*    It is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes
* */

/*
* Polymorphism in java
*   Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance
* */

/*
* Abstraction in java
*   The process of hiding certain details and showing only essential information to the user
*   Abstraction can be achieved with either abstract classes or interfaces
*   Abstract Keyword
*       Abstract class - Is a restricted class that cannot be used to create objects
*       Abstract method - Can only be used in an abstract class, and it does not have a body. The body is provided by the subclass
 * */

/*
* Encapsultion in java
*   Process of wrapping code and data together into a single unit
* */

/*
* Packages in java
*   A java package is a group of similar types of classes, interfaces and sub-packages.
*   Package in java can be categorized in two form, built-in package and user-defined package.
*   There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.
* */

/********************************************** Single Inheritance ****************************************************/

class ParentSingleInheritance{

    private String encapsulatedData = "Encapsulated data";

    ParentSingleInheritance(){
        System.out.println("Constructor of ParentSingleInheritance");
    }

    void methodToBeOveridden(){
        System.out.println("Method of ParentSingleInheritance");
    }

    public String getEncapsulatedData() {
        return encapsulatedData;
    }

    public void setEncapsulatedData(String encapsulatedData) {
        this.encapsulatedData = encapsulatedData;
    }

}

class ChildSingleInheritance extends ParentSingleInheritance{

    ChildSingleInheritance(){
        super();
        System.out.println("Constructor of ChildSingleInheritance");
    }

    void methodToBeOveridden(){
        System.out.println("Method of ChildSingleInheritance");
        System.out.println("Method Overidden");
    }

}

/******************************************** Multilevel Inheritance **************************************************/

abstract class ParentMultilevelInheritance{

    ParentMultilevelInheritance(){
        System.out.println("Constructor of ParentMultilevelInheritance");
    }

    public abstract void abstractMethod();

}

class ChildMultilevelInheritance extends ParentMultilevelInheritance{

    ChildMultilevelInheritance(){
        super();
        System.out.println("Constructor of ChildMultilevelInheritance");
    }

    public void abstractMethod() {
        System.out.println("Abstract method has been overidden");
    }

}

class GrandChildMultilevelInheritance extends ChildMultilevelInheritance{

    GrandChildMultilevelInheritance(){
        super();
        System.out.println("Constructor of GrandChildMultilevelInheritance");
    }

}

/******************************************* Hierarchical Inheritance *************************************************/

class ParentHierarchicalInheritance{

    ParentHierarchicalInheritance(){
        System.out.println("Constructor of ParentHierarchicalInheritance");
    }

}

class FirstChildHierarchicalInheritance extends ParentHierarchicalInheritance{

    FirstChildHierarchicalInheritance(){
        super();
        System.out.println("Constructor of FirstChildHierarchicalInheritance");
    }

}

class SecondChildHierarchicalInheritance extends ParentHierarchicalInheritance{

    SecondChildHierarchicalInheritance(){
        super();
        System.out.println("Constructor of SecondChildHierarchicalInheritance");
    }

}

class ThirdChildHierarchicalInheritance extends ParentHierarchicalInheritance{

    ThirdChildHierarchicalInheritance(){
        super();
        System.out.println("Constructor of ThirdChildHierarchicalInheritance");
    }

}

/********************************************* Multiple Inheritance ***************************************************/

interface FirstParentMultipleInheritance{

}

interface SecondParentMultipleInheritance{

}

class ChildMultipleInheritance implements FirstParentMultipleInheritance, SecondParentMultipleInheritance{

}

/********************************************* Hybrid Inheritance ***************************************************/

interface GrandParentHybridInheritance{

}

interface FirstParentHybridInheritance extends GrandParentHybridInheritance{

}

interface SecondParentHybridInheritance extends GrandParentHybridInheritance{

}

class ChildHybridInheritance implements FirstParentHybridInheritance, SecondParentHybridInheritance{

}

/*********************************************************************************************************************/

public class JavaConcepts {

    public static void main(String[] args) {

        ParentSingleInheritance parentSingleInheritance = new ParentSingleInheritance();
        ChildSingleInheritance childSingleInheritance = new ChildSingleInheritance();
        ChildMultilevelInheritance childMultilevelInheritance = new ChildMultilevelInheritance();

        System.out.println("Polymorphism acheived");
        parentSingleInheritance.methodToBeOveridden();
        childSingleInheritance.methodToBeOveridden();
        System.out.println("Abstraction");
        childMultilevelInheritance.abstractMethod();
        System.out.println("Encapsultaion");
        System.out.println("Encapsulated Data: " + parentSingleInheritance.getEncapsulatedData());
        parentSingleInheritance.setEncapsulatedData("Changed encapsulated data");
        System.out.println("Encapsulated Data: " + parentSingleInheritance.getEncapsulatedData());

    }

}