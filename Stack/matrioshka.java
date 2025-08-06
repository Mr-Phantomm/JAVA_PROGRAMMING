import java.util.*;
public class matrioshka {
    public static boolean checkMatrioshka(List<Integer> list){
        Stack<Integer> stack=new Stack<>();
        Stack<Integer> sumCheck=new Stack<>();
        for(int i=0;i<list.size();i++){
            int number=list.get(i);
            if(number<0){
                stack.push(number);
                sumCheck.push(0);
            }
            else{
                if(stack.isEmpty()||number!=stack.peek()*-1){
                    return false;
                }
                if(sumCheck.peek()>number)return false;
                sumCheck.push(sumCheck.pop()+sumCheck.pop()+number);
                stack.pop();
            }
            System.out.println("Stack : "+stack);
            System.out.println("SumStack : "+sumCheck);
            
        }
        return stack.isEmpty();
    }
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        while(obj.hasNextInt()){
            int x=obj.nextInt();
            list.add(x);
        }
        System.out.println(list);
        if(checkMatrioshka(list)){
            System.out.println(":-) Matrioshka!");
        }
        else{
            System.out.println(":-( Try again.");

        }

    }
}
