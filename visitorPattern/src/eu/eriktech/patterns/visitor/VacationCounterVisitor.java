package eu.eriktech.patterns.visitor;

/*
 * if you think to extend from a general Visitor with a visit method,
 * just know that the visit(Visitor)
 * will be called instead of visit(Emploee)..
 * 
 */
public class VacationCounterVisitor implements Visitor {
	
	protected Integer totVacationDays = 0;

	
	public void visit(Emploee v){
		totVacationDays += v.getVacationDays();
	}

	public Integer getTotVacationDays() {
		return totVacationDays;
	}




}
