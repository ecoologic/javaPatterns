/**
 * 
 */
package eu.eriktech.patterns.strategy;

/**
 * This class starts the program
 * 
 * @author erik
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) { 
		System.out.println(Writer.write("and where there was grass now there's a city...", new StrategyNoChange()));
		System.out.println(Writer.write("and where there was grass now there's a city...", new StrategyUppercase()));
	}

}
