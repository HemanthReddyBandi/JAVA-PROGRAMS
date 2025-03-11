import java.io.*;
class method
{
  int a,b;
   float f1,f2;
   method()
  {
    a=23;
    b=12;
  }
  void display()
  {
    System.out.println(" a and b values are::"+a+" "+b);
    System.out.println("i am from default method overloading");
   }
  void display(int x,int y)
  {
    a=x;
    b=y;
    System.out.println(" a and b values are::"+a+" "+b);
    System.out.println("i am from parametarised method overloading");
  }
  void display(float p,float q)
  {
    f1=p;
    f2=q;
    System.out.println(" f1 and f2 values are::"+f1+" "+f2);
    System.out.println("i am from two float method overloading");
  }
 void display(int x,float q)
  {
    a=x;
    f2=q;
    System.out.println(" a and f2 values are::"+f1+" "+f2);
    System.out.println("i am from one integer and one float method overloading");
  }
}
class methover
{
  public static void main(String [] args)
  {
    method obj=new method();
    obj.display();
    obj.display(12,23);
    obj.display(20.2f,12.2f);
    obj.display(15,105.5f);
   }
}