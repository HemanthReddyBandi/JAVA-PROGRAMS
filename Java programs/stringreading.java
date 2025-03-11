import java.io.*;
import java.util.*;
class stringreading
{
 public static void main(String args[])
  {
     Scanner s=new Scanner(System.in);
     System.out.println("enter character::");
     char c=s.next().charAt(0);
     System.out.println("entered character is ::"+c);
     s.nextLine();
     System.out.println("enter string::");
     String ch=s.nextLine();
     System.out.println("entered string is ::"+ch);

  }
}