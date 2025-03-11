import java.io.*;
import java.util.*;
class parent

{
    String name="parent";
    String message()
    {
        return "from parent";
        
    }
}
class child extends parent

{
    String name="child";
    String message()
    {
        return "from child";
        
    }
}
public class Main_objinherit 
{
    public static void main (String[] args) 
    {
    parent p =new child();
    
    System.out.println(p.name+" "+p.message());
        
    }
}
