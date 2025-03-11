import java.util.*; 
interface Multiple 
{ 
    void show();
} 
class inherit implements Multiple 
{ 
    public void show() 
    {
    System.out.println("Multipe");
    } 
   void print() 
   { 
    System.out.println("Print method"); 
   } 
} 
class Single 
{ 
    void get()
 { 
 System.out.println("Single");
 } 
} 
class Multilevel extends Single 
{ 
    void display() 
   { 
  System.out.println("Multilevel");
   } 
}  
class Hierarchical extends Single
{ 
    void show() 
    { 
  System.out.println("Hierarchic");
    } 
} 
class Hybrid extends Hierarchical 
{ 
    void display() 
    { 
 System.out.println("Hybrid"); 
    } 
public static void main(String[]args) 
   { 
       inherit ob=new inherit(); 
       ob.show(); 
       ob.print();
      Multilevel obj1 = new Multilevel();
      obj1.display();  
      Hybrid obj=new Hybrid();
     obj.show(); 
     obj.display(); 
     obj.get();
   } 
}