/*
* File handling in java
*   File is an abstract data type
*   A named location used to store related information is known as a File
*   File operations
*       Create a File
*       Get File Information
*       Write to a File
*       Read from a File
*       Delete a File
*   Streams - A series of data is referred to as a stream
*       Types of streams
*           Byte stream
*               Byte Stream is mainly involved with byte data
*               A file handling process with a byte stream is a process in which an input is provided and executed with the byte data.
*               Byte stream classes
*                   Input stream classes
*                   Output stream classes
*           Character stream
*               Character Stream is mainly involved with character data
*               A file handling process with a character stream is a process in which an input is provided and executed with the character data
*               Character stream classes
*                   Reader classes
*                   Writer classes
* */

import java.io.*;
import java.util.*;
public class FileHandling {

    public void createFile(File file){
        try {
            if (file.createNewFile()) {
                System.out.println("File " + file.getName() + " is created successfully.");
            } else {
                System.out.println("File is already exist in the directory.");
            }
        } catch (IOException exception) {
            System.out.println("An unexpected error is occurred.");
            exception.printStackTrace();
        }
    }

    public void displayFileInformation(File file){
        if (file.exists()) {
            // Getting file name
            System.out.println("The name of the file is: " + file.getName());

            // Getting path of the file
            System.out.println("The absolute path of the file is: " + file.getAbsolutePath());

            // Checking whether the file is writable or not
            System.out.println("Is file writeable?: " + file.canWrite());

            // Checking whether the file is readable or not
            System.out.println("Is file readable " + file.canRead());

            // Getting the length of the file in bytes
            System.out.println("The size of the file in bytes is: " + file.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }

    public void writeToFile(File file, String content){
        try {
            FileWriter fwrite = new FileWriter(file.getName());
            // writing the content into the FileOperationExample.txt file
            fwrite.write(content);

            // Closing the stream
            fwrite.close();
            System.out.println("Content is successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Unexpected error occurred");
            e.printStackTrace();
        }
    }

    public void readFile(File file){
        try {
            Scanner dataReader = new Scanner(file.getName());
            while (dataReader.hasNextLine()) {
                String fileData = dataReader.nextLine();
                System.out.println(fileData);
            }
            dataReader.close();
        } catch (Exception exception) {
            System.out.println("Unexcpected error occurred!");
            exception.printStackTrace();
        }
    }

    public void deleteFile(File file){
        if (new File(file.getName()).delete()) {
            System.out.println(file.getName()+ " file is deleted successfully.");
        } else {
            System.out.println("Unexpected error found in deletion of the file.");
        }
    }

    public static void main(String[] args) {

        File file = new File("C:\\Users\\riddh\\OneDrive\\Desktop\\ISS Assignment\\java-assignment\\core-java\\file-handling");
        FileHandling fileHandling = new FileHandling();
        fileHandling.createFile(file);
        fileHandling.displayFileInformation(file);
        fileHandling.writeToFile(file, "This is the content which is needed to be written");
        fileHandling.readFile(file);
        fileHandling.deleteFile(file);

    }

}