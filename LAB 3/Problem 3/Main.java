/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.swim();
        rubberDuck.squeak();

        WoodenDuck woodenDuck = new WoodenDuck();
        woodenDuck.swim();
        woodenDuck.mute();

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.swim();
        redHeadDuck.fly();
        redHeadDuck.quack();

        LakeDuck lakeDuck = new LakeDuck();
        lakeDuck.swim();
        lakeDuck.fly();
        lakeDuck.quack();
    }
}
