import java.io.*;
import java.util.*;

class mularray {
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
    if(c1==r2) {  
      System.out.println("enter the elements of array A::");
      for(int i=0;i<r1;i++) {
        for(int j=0;j<c1;j++) {
          a[i][j]=s.nextInt();
        }
      }
      System.out.println("enter the elements of array B::");
      for(int i=0;i<r2;i++) {
        for(int j=0;j<c2;j++) {
          b[i][j]=s.nextInt();
        }
      }
      //multiplication of two matrices
      int[][] c=new int[r1][c2];
      for(int i=0;i<r1;i++) {
        for(int j=0;j<c2;j++) {
          for(int k=0;k<c1;k++) {
            c[i][j]=c[i][j]+a[i][k]*b[k][j];
          }
        }
      }
      System.out.println(" resultant array::");
      for(int i=0;i<r1;i++) {
        for(int j=0;j<c2;j++) {
          System.out.print(c[i][j]+" ");
        }
        System.out.println("");
      }
    } else {
      System.out.println("not possible to multiply given array");
    }
  }
}
