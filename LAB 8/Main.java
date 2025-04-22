/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		Crow crow = new indianCrow();
		crowAdapter fakeSwam = new crowAdapter(crow);
		
		princess(fakeSwam);
	}
	public static void princess(crowAdapter swam) {
	    swam.sing();
	    swam.eat();
	    swam.swim();
	}
}