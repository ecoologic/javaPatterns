package eu.eriktech.patterns.visitor;

public class Emploee implements Visited{
	public String name;
	public Integer vacationDays = 0;
	public Integer sickDays = 0;
	
	
	
	public Emploee(String name, Integer vacationDays, Integer sickDays) {
		super();
		this.name = name;
		this.vacationDays = vacationDays;
		this.sickDays = sickDays;
	}

	@Override
	public void accept(Visitor v){
		v.visit(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getVacationDays() {
		return vacationDays;
	}

	public void setVacationDays(Integer vacationDays) {
		this.vacationDays = vacationDays;
	}

	public Integer getSickDays() {
		return sickDays;
	}

	public void setSickDays(Integer sickDays) {
		this.sickDays = sickDays;
	}
	
	
}
