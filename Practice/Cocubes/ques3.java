public class ques3 {
    public static void main(String[] args) {
        String str="1A0B1";
        int ans=str.charAt(0)-'0';
        for(int i=1;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='A'){
                ans=ans&(str.charAt(i+1)-'0');
                i++;
            }
            else if(ch=='B'){
                ans=ans|(str.charAt(i+1)-'0');
                i++;
            }
            else if(ch=='C'){
                ans=ans^(str.charAt(i+1)-'0');
                i++;
            }
        }
        System.out.println(ans);

    }
}
