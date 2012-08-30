package eu.eriktech.patterns.template;

import java.util.ArrayList;
import java.util.List;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Shoolar> shoolars = new ArrayList<Shoolar>();
		shoolars.add(new Philosopher());
		shoolars.add(new Phisic());
		
		for (Shoolar s : shoolars)
			System.out.println(s.study());

	}

}
