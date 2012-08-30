package eu.eriktech.patterns.singleton;


public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//** TODO: I invented this implementation, check it out
		
		Unique unique = new Unique();
		System.out.println(unique);
		
		Unique unique2 = new Unique();
		System.out.println(unique2);

		//** TODO: I suppose this is the known and best one
		
		U u = U.getInstance();
		System.out.println(u);
		
		U u2 = U.getInstance();
		System.out.println(u2);
		
	}

}
