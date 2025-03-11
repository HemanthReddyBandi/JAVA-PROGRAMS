import java.io.*;
import java.util.*;
class pc
{
int x,y;

   pc(int x,int y)
{
this.x=x;
this.y=y;
  System.out.println("parametarized constructor");
  System.out.println("x & y values is::"+x+","+y);
}
public void display()
{
int z=x+y;
  System.out.println("addition is:"+z);
System.out.println("display method");
}
}
class conoverload
{
public static void main(String[]args)
{
  pc ob=new pc(10,20);
  ob.display();
}
}