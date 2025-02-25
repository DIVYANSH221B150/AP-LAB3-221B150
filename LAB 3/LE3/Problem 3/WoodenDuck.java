class WoodenDuck implements SwimBehavior, MuteBehavior {
    public void swim() {
        System.out.println("Wooden Duck swims");
    }

    public void mute() {
        System.out.println("Wooden Duck is mute");
    }
}