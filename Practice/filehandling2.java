import java.io.*;
public class filehandling2 {
    public static void main(String args[]){
        try{
            FileWriter writer=new FileWriter("example.txt");
            writer.write("Hello this is a demo text");
            writer.close();
            System.out.print("Success");
        }
        catch(Exception e){
            System.out.println("Unsuccess");
            e.printStackTrace();
        }
    }
}
