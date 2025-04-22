public class crowAdapter implements swan {
    private Crow crow;
    public crowAdapter(Crow c) {
        this.crow = c;
    }
    public void eat() {
        crow.eat();
    }
    public void sing() {
        crow.cry();
    }
    public void swim() {
        crow.fly();
    }
}