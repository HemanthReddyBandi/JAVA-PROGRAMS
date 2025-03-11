class a {
  void display() {
    System.out.println("hello;/.");
  }
}

class b extends a {
  void display() {
super.display();
    System.out.println("hiiii;/.");
  }
}

class method_override {
  public static void main(String[] args) {
    b ob = new b();
    ob.display();
    
  }
}