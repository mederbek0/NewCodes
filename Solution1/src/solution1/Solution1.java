package solution1;
import java.util.Scanner;

public class Solution1 {
    public static int pow(int n){
        int sum=1;
        for(int i=1;i<=n;i++)
            sum=sum*2;
        return sum;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i;
       Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       for (i=0;i<s;i++)
           {
                if(ar[i]==0)
                    System.out.println(1);
                else if(ar[i]==1)
                    System.out.println(2);
                else if(ar[i]==2)
                    System.out.println(3);
                else if(ar[i]==3)
                    System.out.println(6);
                else if(ar[i]==4)
                    System.out.println(7);
                else if(ar[i]%2!=0)
                    System.out.println(pow(ar[i]/2+2)-2);
                else if(ar[i]%2==0)
                    System.out.println(pow(ar[i]/2+1)-1);
                
                
           }
    }
}