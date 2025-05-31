import java.util.*;
import java.io.*;
public class filehandling4 {
    public static void main(String args[]){
    try{
        FileWriter writer=new FileWriter("example.txt",true);
        writer.write("\nHello Arun");
        writer.close();
        System.out.println("Successful appended");

    }
    catch(IOException e){
        System.out.print("An error occured");
        e.printStackTrace();
    }}
}
