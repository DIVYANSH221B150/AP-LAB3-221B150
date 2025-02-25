class LakeDuck implements SwimBehavior, FlyBehavior, QuackBehavior {
    public void swim() {
        System.out.println("Lake Duck swims");
    }

    public void fly() {
        System.out.println("Lake Duck flies");
    }

    public void quack() {
        System.out.println("Lake Duck quacks");
    }
}