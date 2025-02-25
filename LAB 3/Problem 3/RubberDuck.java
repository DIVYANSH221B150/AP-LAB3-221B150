class RubberDuck implements SwimBehavior, SqueakBehavior {
    public void swim() {
        System.out.println("Rubber Duck swims");
    }

    public void squeak() {
        System.out.println("Rubber Duck squeaks");
    }
}