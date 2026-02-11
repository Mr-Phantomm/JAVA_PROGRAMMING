public class ques7 {
    public static void main(String[] args) {
        String str="abcdc";
        StringBuilder sb=new StringBuilder("");
        int s=0;
        int e=str.length()-1;
        // StringBuilder ans=new StringBuilder("");
        while(s<e){
            if(str.charAt(s)==str.charAt(e)){
                s++;
                e--;
            }
            else{
                sb.insert(0,str.charAt(s));
                s++;
            }
        }
        System.out.println(sb);
    }
}
