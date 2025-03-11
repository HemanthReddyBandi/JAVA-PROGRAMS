import java.io.*;
import java.util.*;
class twarray
{
  public static void main(String args[])
{  
  int[][]a=new int[3][2];
  int[][]b={{1,2,3},{4,5,6}};
  int[][]c=new int[][]{{1,5,4},{7,9,3}};
System.out.println("array-a elements::");
for(int i=0;i<3;i++)
{
 for(int j=0;j<2;j++)
 {
 System.out.print(a[i][j]+" ");

 }
System.out.println(" ");
}
System.out.println("array-b elements::");
for(int i=0;i<2;i++)
{
 for(int j=0;j<3;j++)
 {
 System.out.print(b[i][j]+" ");

 }
System.out.println(" ");
}
System.out.println("array-c elements::");

for(int i=0;i<2;i++)
{
 for(int j=0;j<3;j++)
 {
 System.out.print(c[i][j]+" ");

 }
System.out.println(" ");
}
}
}
