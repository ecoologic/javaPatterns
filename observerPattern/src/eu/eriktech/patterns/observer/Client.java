package eu.eriktech.patterns.observer;

public class Client {

	/**
	 * @param args
	 */
	// TODO: probably some kind of observer opattern is in java.util see x.notify()
	//  use interfaces better or use superclasses
	public static void main(String[] args) {
		ConcreteObserver1 obs1 = new ConcreteObserver1();
		
		ConcreteSubject sub = new ConcreteSubject();
		sub.add(obs1);
		
		sub.setValue(1);
		
		System.out.println(obs1.getValue());
	}

}
