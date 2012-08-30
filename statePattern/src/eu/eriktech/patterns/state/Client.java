package eu.eriktech.patterns.state;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ? State pattern allows to set the state of an object
		// ? and depending to it the behaviour of the class changes.
		
		PersonContext person = new PersonContext();
		
		// ? THIS IS THE CORE: you set the state with it's interface
		person.setState(new PersonActive());
		System.out.println("Bruno! lavora cane!");
		System.out.println(person.work());
		
		person.setState(new PersonLazy());
		System.out.println("Bruno! lavora cane!");
		System.out.println(person.work());
	}

}
