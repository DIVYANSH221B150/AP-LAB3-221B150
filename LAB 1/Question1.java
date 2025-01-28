class Mother {
  static int x = 25;
  void show() {
    System.out.println(x);
  }
}

class Child extends Mother {}
public class Question1 {
  public static void main(String[] args) {
    Mother mother = new Mother();
    mother.show();
    Child child = new Child();
    child.show();
  }
}