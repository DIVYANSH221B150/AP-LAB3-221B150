class Mother {
  void talking() {
    System.out.println("Hello, Mother is talking");
  }
}

class Child extends Mother {
  void talking() {
    System.out.println("Hello, Child is talking");
  }
}

class Question2 {
  public static void main(String[] args) {
    Mother mother = new Mother();
    mother.talking();
    Child child = new Child();
    child.talking();
  }
}