import java.util.Scanner;
public class cf29 {
      public static void main(String[] args) {
        // n, k, l, c, d, p, nl, np
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int k=obj.nextInt();
        int l=obj.nextInt();
        int c=obj.nextInt();
        int d=obj.nextInt();
        int p=obj.nextInt();
        int nl=obj.nextInt();
        int np=obj.nextInt();
        int totalLimes=c*d;
        int totaldrink=k*l/nl;
        int totalsalt=p/np;
        int min=totalLimes<totaldrink?totalLimes:totaldrink;
        min=min<totalsalt?min:totalsalt;
        System.out.println(min/n);
      }
}
