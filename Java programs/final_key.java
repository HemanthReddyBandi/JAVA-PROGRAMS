import java.io.*;

class test {
  final int a = 12;

  void display() {
    System.out.println("a=" + a);
    // a = 100;
    System.out.println(a);
  }
}

class final_key {
  public static void main(String[] args) {
    test ob = new test();
    ob.display();
  }
}