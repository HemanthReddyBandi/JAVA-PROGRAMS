import java.io.*;
class conover
{
  int a,b;
  conover()
   {
     System.out.println("i am from default constructor");
    }
  conover(int x,int y)
   {
     System.out.println("x and y values are::"+x+" "+y);
     System.out.println("i am from parametaraised constructor");
    }
  void display()   
   {
     System.out.println("i am from display method");
    }
}
class consover
{
  public static void main (String [] args)
  {
     conover obj=new conover();
      conover obj1=new conover(10,20);
     obj.display();
   }
}