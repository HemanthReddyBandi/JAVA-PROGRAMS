import java.io.*;
import java.util.*;
class sarray
{
  public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int size;
   System.out.println("enter the size of array");
   size=sc.nextInt();
   int[]a=new int[size];
   System.out.println("enter the elements of array A");
   for(int i=0;i<size;i++)
    {
      a[i]=sc.nextInt();
    }
  int sum=0;
  for(int i=0;i<size;i++)
  {
     sum=sum+a[i];
     System.out.print("sum is ::"+sum);
  }
 }
}