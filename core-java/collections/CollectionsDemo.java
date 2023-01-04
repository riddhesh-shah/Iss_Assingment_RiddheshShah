/*
* Collections in java
*   List
*       ArrayList - Arraylist class implements List interface and it is based on an Array data structure
*       LinkedList - LinkedList is a linear data structure. However LinkedList elements are not stored in contiguous locations like arrays, they are linked with each other using pointers
*       Vector - Vector implements List Interface. Like ArrayList it also maintains insertion order but it is rarely used in non-thread environment as it is synchronized and due to which it gives poor performance in searching, adding, delete and update of its elements
*       Stack - Stack class extends Vector class, which means it is a subclass of Vector. Stack works on the concept of Last In First Out (LIFO)
*   Set
*       HashSet - HashSet which stores its elements in a hash table, is the best-performing implementation. HashSet allows only unique elements
*       LinkedHashSet - LinkedHashSet maintains the insertion order. Elements gets sorted in the same sequence in which they have been added to the Set
*       TreeSet - TreeSet sorts the elements in ascending order
*   Map
*       HashMap - HashMap is like HashSet, it doesn’t maintain insertion order and doesn’t sort the elements in any order
*       TreeMap - It stores its elements in a red-black tree. The elements of TreeMap are sorted in ascending order
*       LinkedHashMap - It maintains insertion order
* */

import java.util.*;
class Student implements Comparable<Student>{

    private String name;
    private int percentage;

    Student(String name, int percentage){
        this.name = name;
        this.percentage = percentage;
    }

    public String getName(){
        return this.name;
    }

    public int getPercentage() {
        return this.percentage;
    }

    public String toString(){
        return this.name + ": " + this.percentage;
    }

    /* Comparable - Used to compare by name */
    public int compareTo(Student student){
        return (this.name).compareTo(student.name);
    }

}

class SortByName implements Comparator<Student> {
    /* Comparator - Used to compare by percentage */
    public int compare(Student student1, Student student2){
        return student1.getPercentage() - student2.getPercentage();
    }
}

public class CollectionsDemo {

    public static void displayCollection(Collection collection){
        for(Object item: collection){
            System.out.println(item);
        }
    }

    public static void displayMap(Map map){
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry m = (Map.Entry) iterator.next();
            System.out.println(m.getValue());
        }
    }

    public static void main(String[] args) {

        /* Primitive Datatypes */
        String red = "red";
        String blue = "blue";
        String green = "green";
        String yellow = "yellow";

        /* User defined datatypes */
        Student johnDoe = new Student("John Doe", 94);
        Student janeDoe = new Student("Jane Doe", 86);
        Student jennyDoe = new Student("Jenny Doe", 56);
        Student jackDoe = new Student("Jack Doe", 72);

        SortByName sortByName = new SortByName();

        /*********************************************** ArrayList ***************************************************/

        /* Primitive datatype */
        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add(red);
        stringArrayList.add(blue);
        stringArrayList.add(green);
        stringArrayList.add(yellow);

        System.out.println("Before stringArrayList sorting");
        displayCollection(stringArrayList);
        Collections.sort(stringArrayList);
        System.out.println("After stringArrayList sorting");
        displayCollection(stringArrayList);

        /* User defined datatype */
        ArrayList<Student> studentArrayList = new ArrayList<>();

        studentArrayList.add(johnDoe);
        studentArrayList.add(janeDoe);
        studentArrayList.add(jennyDoe);
        studentArrayList.add(jackDoe);

        System.out.println("Before studentArrayList sorting - name");
        displayCollection(studentArrayList);
        Collections.sort(studentArrayList);
        System.out.println("After studentArrayList sorting - name");
        displayCollection(studentArrayList);

        System.out.println("Before studentArrayList sorting - percentage");
        displayCollection(studentArrayList);
        Collections.sort(studentArrayList, sortByName);
        System.out.println("After studentArrayList sorting - percentage");
        displayCollection(studentArrayList);

        /********************************************** LinkedList **************************************************/

        /* Primitive datatype */
        LinkedList<String> stringLinkedList = new LinkedList<>();

        stringLinkedList.add(red);
        stringLinkedList.add(blue);
        stringLinkedList.add(green);
        stringLinkedList.add(yellow);

        System.out.println("Before stringLinkedList sorting");
        displayCollection(stringLinkedList);
        Collections.sort(stringLinkedList);
        System.out.println("After stringLinkedList sorting");
        displayCollection(stringLinkedList);

        /* User defined datatype */
        LinkedList<Student> studentLinkedList = new LinkedList<>();

        studentLinkedList.add(johnDoe);
        studentLinkedList.add(janeDoe);
        studentLinkedList.add(jennyDoe);
        studentLinkedList.add(jackDoe);

        System.out.println("Before studentLinkedList sorting - name");
        displayCollection(studentLinkedList);
        Collections.sort(studentLinkedList);
        System.out.println("After studentLinkedList sorting - name");
        displayCollection(studentLinkedList);

        System.out.println("Before studentLinkedList sorting - percentage");
        displayCollection(studentLinkedList);
        Collections.sort(studentLinkedList, sortByName);
        System.out.println("After studentLinkedList sorting - percentage");
        displayCollection(studentLinkedList);

        /************************************************* Vector *****************************************************/

        /* Primitive datatype */
        Vector<String> stringVector = new Vector<>();

        stringVector.add(red);
        stringVector.add(blue);
        stringVector.add(green);
        stringVector.add(yellow);

        System.out.println("Before stringVector sorting");
        displayCollection(stringVector);
        Collections.sort(stringVector);
        System.out.println("After stringVector sorting");
        displayCollection(stringVector);

        /* User defined datatype */
        Vector<Student> studentVector = new Vector<>();

        studentVector.add(johnDoe);
        studentVector.add(janeDoe);
        studentVector.add(jennyDoe);
        studentVector.add(jackDoe);

        System.out.println("Before studentVector sorting - name");
        displayCollection(studentVector);
        Collections.sort(studentVector);
        System.out.println("After studentVector sorting - name");
        displayCollection(studentVector);

        System.out.println("Before studentVector sorting - percentage");
        displayCollection(studentVector);
        Collections.sort(studentVector, sortByName);
        System.out.println("After studentVector sorting - percentage");
        displayCollection(studentVector);

        /************************************************* Stack *****************************************************/

        /* Primitive datatype */
        Stack<String> stringStack = new Stack<>();

        stringStack.push(red);
        stringStack.push(blue);
        stringStack.push(green);
        stringStack.push(yellow);

        System.out.println("Before stringStack sorting");
        displayCollection(stringStack);
        Collections.sort(stringStack);
        System.out.println("After stringStack sorting");
        displayCollection(stringStack);

        /* User defined datatype */
        Stack<Student> studentStack = new Stack<>();

        studentStack.push(johnDoe);
        studentStack.push(janeDoe);
        studentStack.push(jennyDoe);
        studentStack.push(jackDoe);

        System.out.println("Before studentStack sorting - name");
        displayCollection(studentStack);
        Collections.sort(studentStack);
        System.out.println("After studentStack sorting - name");
        displayCollection(studentStack);

        System.out.println("Before studentStack sorting - percentage");
        displayCollection(studentStack);
        Collections.sort(studentStack, sortByName);
        System.out.println("After studentStack sorting - percentage");
        displayCollection(studentStack);

        /*********************************************** HashSet ***************************************************/

        /* Primitive datatype */
        HashSet<String> stringHashSet = new HashSet<>();

        stringHashSet.add(red);
        stringHashSet.add(blue);
        stringHashSet.add(green);
        stringHashSet.add(yellow);

        System.out.println("Elements of stringHashSet");
        displayCollection(stringHashSet);

        /* User defined datatype */
        HashSet<Student> studentHashSet = new HashSet<>();

        studentHashSet.add(johnDoe);
        studentHashSet.add(janeDoe);
        studentHashSet.add(jennyDoe);
        studentHashSet.add(jackDoe);

        System.out.println("Elements of studentHashSet");
        displayCollection(studentHashSet);

        /*********************************************** LinkedHashSet ***************************************************/

        /* Primitive datatype */
        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();

        stringLinkedHashSet.add(red);
        stringLinkedHashSet.add(blue);
        stringLinkedHashSet.add(green);
        stringLinkedHashSet.add(yellow);

        System.out.println("Elements of stringLinkedHashSet");
        displayCollection(stringLinkedHashSet);

        /* User defined datatype */
        LinkedHashSet<Student> studentLinkedHashSet = new LinkedHashSet<>();

        studentLinkedHashSet.add(johnDoe);
        studentLinkedHashSet.add(janeDoe);
        studentLinkedHashSet.add(jennyDoe);
        studentLinkedHashSet.add(jackDoe);

        System.out.println("Elements of studentLinkedHashSet");
        displayCollection(studentLinkedHashSet);

        /*********************************************** TreeSet ***************************************************/

        /* Primitive datatype */
        TreeSet<String> stringTreeSet = new TreeSet<>();

        stringTreeSet.add(red);
        stringTreeSet.add(blue);
        stringTreeSet.add(green);
        stringTreeSet.add(yellow);

        System.out.println("Elements of stringTreeSet");
        displayCollection(stringTreeSet);

        /* User defined datatype */
        TreeSet<Student> studentTreeSet = new TreeSet<>();

        studentTreeSet.add(johnDoe);
        studentTreeSet.add(janeDoe);
        studentTreeSet.add(jennyDoe);
        studentTreeSet.add(jackDoe);

        System.out.println("Elements of studentTreeSet");
        displayCollection(studentTreeSet);

        /*********************************************** HashMap ***************************************************/

        /* Primitive datatype */
        HashMap<Integer, String> stringHashMap = new HashMap<>();

        stringHashMap.put(1, red);
        stringHashMap.put(2, blue);
        stringHashMap.put(3, green);
        stringHashMap.put(4, yellow);

        System.out.println("Elements of stringHashMap");
        displayMap(stringHashMap);

        /* User defined datatype */
        HashMap<Integer, Student> studentHashMap = new HashMap<>();

        studentHashMap.put(1, johnDoe);
        studentHashMap.put(2, janeDoe);
        studentHashMap.put(3, jennyDoe);
        studentHashMap.put(4, jackDoe);

        System.out.println("Elements of studentHashMap");
        displayMap(studentHashMap);

        /*********************************************** TreeMap ***************************************************/

        /* Primitive datatype */
        LinkedHashMap<Integer, String> stringLinkedHashMap = new LinkedHashMap<>();

        stringLinkedHashMap.put(1, red);
        stringLinkedHashMap.put(2, blue);
        stringLinkedHashMap.put(3, green);
        stringLinkedHashMap.put(4, yellow);

        System.out.println("Elements of stringLinkedHashMap");
        displayMap(stringLinkedHashMap);

        /* User defined datatype */
        LinkedHashMap<Integer, Student> studentLinkedHashMap = new LinkedHashMap<>();

        studentLinkedHashMap.put(1, johnDoe);
        studentLinkedHashMap.put(2, janeDoe);
        studentLinkedHashMap.put(3, jennyDoe);
        studentLinkedHashMap.put(4, jackDoe);

        System.out.println("Elements of studentLinkedHashMap");
        displayMap(studentLinkedHashMap);

        /*********************************************** LinkedHashMap ***************************************************/

        /* Primitive datatype */
        TreeMap<Integer, String> stringTreeMap = new TreeMap<>();

        stringTreeMap.put(1, red);
        stringTreeMap.put(2, blue);
        stringTreeMap.put(3, green);
        stringTreeMap.put(4, yellow);

        System.out.println("Elements of stringTreeMap");
        displayMap(stringTreeMap);

        /* User defined datatype */
        TreeMap<Integer, Student> studentTreeMap = new TreeMap<>();

        studentTreeMap.put(1, johnDoe);
        studentTreeMap.put(2, janeDoe);
        studentTreeMap.put(3, jennyDoe);
        studentTreeMap.put(4, jackDoe);

        System.out.println("Elements of studentTreeMap");
        displayMap(studentTreeMap);

    }

}