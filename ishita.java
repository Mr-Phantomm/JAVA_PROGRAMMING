public class ishita {
    public static boolean palindromecheck(String str){
        StringBuilder st = new StringBuilder("");
       for(int i =0; i<str.length(); i++){
        if(str.charAt(i)>='0' && str.charAt(i)<='9'|| str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z'){
            st.append(Character.toUpperCase(str.charAt(i)));
        }
       }
       String st2 = st.toString();
       int start =0;
       int end = st2.length()-1;
       while(start<end){
        if(st2.charAt(start)!=st2.charAt(end))return false;
        start++;
        end--;
       }
       return true;

    }
    public static void main(String args[]){
        String str="123456  -=';abcDdcbA65;;.;[4321";
        System.out.println(palindromecheck(str));
    }
}
