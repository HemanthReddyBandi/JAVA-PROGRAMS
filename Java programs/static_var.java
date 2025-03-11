import java.io.*;
class b
{
 static int a=10;

}
class static_var
{
 public static void main(String args[])
  {
      b ob=new b();
      int a=20;
      System.out.println(" a value is:"+a);
      System.out.println("b class a value is:"+ob.a);
  }
}