import java.io.*;
import java.util.*;
class  atarray
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  int r1,c1;
  System.out.println("enter the row size of array A::");
  r1=s.nextInt();
  System.out.println("enter the coloumn size of array A::");
  c1=s.nextInt();
  int r2,c2;
System.out.println("enter the row size of array B::");
  r2=s.nextInt();
  System.out.println("enter the coloumn size of array B::");
  c2=s.nextInt();
  int[][] a=new int[r1][c1];
  int[][] b=new int[r2][c2];
 if((r1==r2)&&(c1==c2))
 {  
   System.out.println("enter the elements of array A::");
   for(int i=0;i<r1;i++)
   {
     for(int j=0;j<c1;j++)
     {
      a[i][j]=s.nextInt();
     }
    }
  System.out.println("enter the elements of array B::");
   for(int i=0;i<r2;i++)
   {
     for(int j=0;j<c2;j++)
     {
      b[i][j]=s.nextInt();
     }
    }
   int[][] c=new int[r1][c1];
    for(int i=0;i<r1;i++)
   {
     for(int j=0;j<c1;j++)
     {
      c[i][j]=a[i][j]+b[i][j];
     }
    }
   System.out.println(" resultant array::");
   for(int i=0;i<r1;i++)
   {
     for(int j=0;j<c1;j++)
     {
        System.out.print(c[i][j]+" ");
      }
      System.out.println(" ");
    }
   }
else
   {
     System.out.println("not possible to add given array");
   }
   }
  }