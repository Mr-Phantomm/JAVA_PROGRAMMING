public class convert{
    public static void main(String args[]){
        String str="123a";
        Integer out=0;
        boolean check=true;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                out=out*10+str.charAt(i)-'0';
            }
            else{
                
            }
        }
        if(check)System.out.println(out);
        else System.out.println(0);
    }

}