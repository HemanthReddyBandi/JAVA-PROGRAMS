import java.io.*;
import java.util.*;
class primenum
{
 public static void main(String []args)
{
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the number to print the primes upto the number");
int n=sc.nextInt();
 for (int i=0;i<=n;i++)
 {
     int flag=0;
    for(int j=1;j<=i;j++)
     {
          if (i%j==0)
           {
             flag++;
            }
      }
      if (flag==2)
        {
        System.out.println(i);
         }
     
   }
}
}
      