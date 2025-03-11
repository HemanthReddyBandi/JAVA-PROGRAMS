import java.io.*;
interface inf
{
  void show();
  void run();
}
abstract class testinf implements inf
{
  public void show()
  {
   System.out.println("hlrlo");
   }
 }
class testinf2 extends testinf
{
  public void run()
  {
   System.out.println("byeee");
   }
 }
class  test1
{
 public static void main(String [] args)
 {
  testinf2 obj = new testinf2();
  obj.show();
  obj.run();
  }
}
