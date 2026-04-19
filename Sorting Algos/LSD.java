import java.util.*;
public class LSD {

    public void sort(String[] a){
        int d = a[0].length()-1;
        String[] aux = new String[a.length];
        while(d>=0){
            int[] count = new int[256];
            for(int i=0;i<a.length;i++){
                count[a[i].charAt(d)+1]++;
            }
            for(int i=1;i<256;i++){
                count[i]+=count[i-1];
            }
            for(int i=0;i<a.length;i++){
                aux[count[a[i].charAt(d)]++] = a[i];
            }
            for(int i=0;i<a.length;i++){
                a[i]=aux[i];
            }
            d--;
            System.out.println(Arrays.toString(a));
        }

    }

    public static void main(String[] args) {
        String[] input = {"man","cat","mat","met","sat","get","set","sat"};
        LSD l =new LSD();
        // Stable in end but not in imediatery
        System.out.println(Arrays.toString(input));
        l.sort(input);
        System.out.println(Arrays.toString(input));
    }    
}
