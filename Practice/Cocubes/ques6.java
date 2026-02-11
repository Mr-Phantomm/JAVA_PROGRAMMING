public class ques6 {
    public static void main(String[] args) {
        String str="aaaaabbbccccccccdaa";
        int count=1;
        StringBuilder sb=new StringBuilder("");
        sb.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==sb.charAt(sb.length()-1)){
                count++;
            }
            else{
                if(count!=1)sb.append(count);
                count=1;
                sb.append(ch);
            }
        }
        if(count!=0)sb.append(count);
        System.out.println(sb);
    }
}
