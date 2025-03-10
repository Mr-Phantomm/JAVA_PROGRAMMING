public class ishitastudent2 {
public static void sequence(String str,String output,int i){
    if(i>=str.length()){
        System.out.println(output);
        return;
    }
    sequence(str,output,i+1);
    sequence(str,output+str.charAt(i),i+1);


}
    public static void main(String args[]){
        String str="abc";
        String output="";
        sequence(str,output,0);
    }
}
