package eu.eriktech.patterns.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//** Employees creation
		List<Emploee> emps = new ArrayList<Emploee>();
		for (Integer i= 0; i < 10 ; i++){
			emps.add(new Emploee(i.toString(), i*2, i*3));			
		}
		
		//** visit acceptance
		VacationCounterVisitor v = new VacationCounterVisitor();
		
		Iterator<Emploee> i = emps.iterator();
		while( i.hasNext() )
			(i.next()).accept(v);
		
		//** result
		System.out.println("Total vacation days = " + v.getTotVacationDays());
	}

}
