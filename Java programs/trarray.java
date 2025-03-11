import java.io.*;
import java.util.*;
class  trarray
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  int row_size,coloumn_size;
  System.out.println("enter the row size of array::");
  row_size=s.nextInt();
  System.out.println("enter the coloumn size of array::");
  coloumn_size=s.nextInt();
  int[][] a=new int[row_size][coloumn_size];
   System.out.println("enter the elements of array A::");
   for(int i=0;i<row_size;i++)
   {
     for(int j=0;j<coloumn_size;j++)
     {
      a[i][j]=s.nextInt();
     }
    }
   System.out.println(" elements of array A::");
   for(int i=0;i<row_size;i++)
   {
     for(int j=0;j<coloumn_size;j++)
     {
        System.out.print(a[i][j]+" ");
      }
      System.out.println(" ");
    }
   }
  }