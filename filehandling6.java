import java.util.*;
import java.io.*;
public class filehandling6 {
    public static void main(String[] args) {
        try{
            FileInputStream input=new FileInputStream("input.txt");
            FileOutputStream output=new FileOutputStream("output.txt",true);
            int data;
            while((data=input.read())!=-1){
                output.write(data);
            }
            input.close();
            output.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }    
}
