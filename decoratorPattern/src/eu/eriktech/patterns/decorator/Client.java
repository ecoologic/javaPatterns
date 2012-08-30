package eu.eriktech.patterns.decorator;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//** ?? TODO : it works but I'm not sure that's it.

		ConcreteComponent c = new ConcreteComponent();
		c.operation();
		
		Decorator1 dec1 = new Decorator1(c);

		Decorator dec = new Decorator(dec1);
		
		System.out.println(dec1.getComponent().operation());
		System.out.println(dec1.operation());
		System.out.println(dec1.operation1());
		System.out.println(dec.operation());
		
	}

}
