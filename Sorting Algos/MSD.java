import java.util.Arrays;

public class MSD {

    public void sort(String[] a){
        String[] aux = new String[a.length];
        sort(a,0,a.length-1,0,aux);
    }

    private int getChar(String s,int d){
        return s.length()>d?s.charAt(d):-1;
    }
    


     public void sort(String[] a,int L,int R,int d,String[] aux){
        if(R<=L)return;

        // if R-L < 10 insertion sort and return

            int[] count = new int[257];
            for(int i=L;i<=R;i++){
                count[getChar(a[i],d)+2]++;
            }
            for(int i=1;i<256;i++){
                count[i]+=count[i-1];
            }
            for(int i=L;i<=R;i++){
                aux[count[getChar(a[i],d)+1]++] = a[i];
            }
            for(int i=L;i<= R;i++){
                a[i]=aux[i-L];
            }

            for(int i=0;i<256;i++){
                sort(a,count[i],count[i+1]-1,d+1,aux);
            }

            //System.out.println(Arrays.toString(a));

    }

    public static void main(String[] args) {
        String[] input = {"100110","1000000","1231"};
        MSD l =new MSD();
        // Stable in end but not in imediatery
        System.out.println(Arrays.toString(input));
        l.sort(input);
        System.out.println(Arrays.toString(input));
    }   
}
