/*
* Multithreading in java
*   Thread - A subprocess with lightweight with the smallest unit of processes and also has separate paths of execution
*   A multi-threaded program contains two or more parts that can run concurrently and each part can handle a different task at the same time making optimal use of the available resources specially when your computer has multiple CPUs
*   Thread life cycle
*       New − A new thread begins its life cycle in the new state. It remains in this state until the program starts the thread. It is also referred to as a born thread
*       Runnable − After a newly born thread is started, the thread becomes runnable. A thread in this state is considered to be executing its task
*       Waiting − Sometimes, a thread transitions to the waiting state while the thread waits for another thread to perform a task
*       Timed Waiting − A runnable thread can enter the timed waiting state for a specified interval of time
*       Terminated − A runnable thread enters the terminated state when it completes its task or otherwise terminates
*
* Creation of thread in java
*   Extends Thread class
*   Implements runnable interface
*
* Synchronization in java
*   Synchronization - The capability to control the access of multiple threads to any shared resource
*   Ways to acheive Synchronization in java
*       Synchronization method
*           Synchronized method is used to lock an object for any shared resource.
*           When a thread invokes a synchronized method, it automatically acquires the lock for that object and releases it when the thread completes its task
*       Synchronization block
*           Synchronized method locks are accessed on the method, whereas synchronized block locks are accessed on the object
*
* Volatile keyword in java
*   Volatile keyword is used to modify the value of a variable by different threads
*   It is also used to make classes thread safe
*   It means that multiple threads can use a method and instance of the classes at the same time without any problem
*   The volatile keyword can be used either with primitive type or objects
*
* Thread pool in java
*   A thread pool is a collection of pre-initialized threads
*   Once the thread completes its service, it returns to the pool and awaits a lot of work
*   If the pool contains no accessible thread, the server waits till one becomes free
*   It saves time as a result of there's no need to produce new thread
*
* */

import java.lang.*;
import java.util.concurrent.*;
class OddNumberThread implements Runnable{

    private int limit;
    private Thread thread;

    OddNumberThread(int limit){
        this.limit = limit;
    }

    public void run(){
        try{
            for (int i=1;i<limit;i+=2){
                System.out.println("Odd Number: " + i);
                Thread.sleep(10);
            }
        }catch (InterruptedException ie) {
            System.out.println("Exception: " + ie);
        }
    }

    public void start(){
        if (thread == null) {
            thread = new Thread (this, "OddNumberThread");
            thread.start();
        }
    }

}

class EvenNumberThread extends Thread{

    private int limit;
    private Thread thread;

    EvenNumberThread(int limit){
        this.limit = limit;
    }

    public void run(){
        try {
            for (int i=2;i<limit;i+=2){
                System.out.println("Even Number: " + i);
                Thread.sleep(10);
            }
        }catch (InterruptedException ie) {
            System.out.println("Exception: " + ie);
        }
    }

    public void start(){
        if (thread == null) {
            thread = new Thread (this, "EvenNumberThread");
            thread.start();
        }
    }

}

class SquareNumberThread extends Thread{

    private int limit;
    private Thread thread;

    SquareNumberThread(int limit){
        this.limit = limit;
    }

    private void printSquareNumber(int limit){
        try{
            for (int i=0;(i*i)<limit;i++){
                System.out.println("Square number: " + (i*i));
                Thread.sleep(10);
            }
        }catch (InterruptedException ie) {
            System.out.println("Exception: " + ie);
        }
    }

    public void run(){
        synchronized (this){
            printSquareNumber(limit);
        }
    }

    public void start(){
        if (thread == null) {
            thread = new Thread (this, "SquareNumberThread");
            thread.start();
        }
    }

}

class CubeNumberThread extends Thread{

    private int limit;
    private Thread thread;

    CubeNumberThread(int limit){
        this.limit = limit;
    }

    private void printCubeNumber(int limit){
        try{
            for (int i=0;(i*i*i)<limit;i++){
                System.out.println("Cube number: " + (i*i*i));
                Thread.sleep(10);
            }
        }catch (InterruptedException ie) {
            System.out.println("Exception: " + ie);
        }
    }

    public synchronized void run(){
        printCubeNumber(limit);
    }

    public void start(){
        if (thread == null) {
            thread = new Thread (this, "SquareNumberThread");
            thread.start();
        }
    }

}

public class Multithreading {

    public static void main(String[] args) {

        OddNumberThread oddNumberThread = new OddNumberThread(100);
        EvenNumberThread evenNumberThread = new EvenNumberThread(100);
        SquareNumberThread squareNumberThread = new SquareNumberThread(100);
        CubeNumberThread cubeNumberThread = new CubeNumberThread(100);

        Thread squareNumberThread1 = new Thread(squareNumberThread);
        Thread squareNumberThread2 = new Thread(squareNumberThread);

        Thread cubeNumberThread1 = new Thread(cubeNumberThread);
        Thread cubeNumberThread2 = new Thread(cubeNumberThread);

        oddNumberThread.start();
        evenNumberThread.start();

        try{
            Thread.sleep(1000);
        }catch (InterruptedException ie) {
            System.out.println("Exception: " + ie);
        }

        /* synchronized block */
        squareNumberThread1.start();
        squareNumberThread2.start();
        try {
            squareNumberThread1.join();
            squareNumberThread2.join();
        } catch (InterruptedException ie) {
            System.out.println("Exception: " + ie);
        }

        /* synchronized method */
        cubeNumberThread1.start();
        cubeNumberThread2.start();
        try {
            cubeNumberThread1.join();
            cubeNumberThread2.join();
        } catch (InterruptedException ie) {
            System.out.println("Exception: " + ie);
        }

        /* Thread pool */
        ThreadPoolExecutor executor = (ThreadPoolExecutor)Executors.newCachedThreadPool();

        System.out.println("Largest executions: " + executor.getLargestPoolSize());
        System.out.println("Maximum allowed threads: " + executor.getMaximumPoolSize());
        System.out.println("Current threads in pool: " + executor.getPoolSize());
        System.out.println("Currently executing threads: " + executor.getActiveCount());
        System.out.println("Total number of threads(ever scheduled): " + executor.getTaskCount());

        executor.submit(new OddNumberThread(50));
        executor.submit(new EvenNumberThread(50));

        //Stats after tasks execution
        System.out.println("Core threads: " + executor.getCorePoolSize());
        System.out.println("Largest executions: " + executor.getLargestPoolSize());
        System.out.println("Maximum allowed threads: " + executor.getMaximumPoolSize());
        System.out.println("Current threads in pool: " + executor.getPoolSize());
        System.out.println("Currently executing threads: " + executor.getActiveCount());
        System.out.println("Total number of threads(ever scheduled): " + executor.getTaskCount());

        executor.shutdown();

    }

}