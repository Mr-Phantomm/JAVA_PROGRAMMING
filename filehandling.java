import java.io.*;
public class filehandling {
    public static void main(String args[]){
        try{
            File file=new File("example.txt");
            if(file.createNewFile()){
                System.out.print("file created: "+file.getName());
            }
            else{
                System.out.print("File already exists");
            }
        }
        catch(IOException e){
            System.out.print("An error occured");
            e.printStackTrace();
        }
    }
}
