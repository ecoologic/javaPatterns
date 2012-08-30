package eu.eriktech.patterns.decorator;

public class ConcreteComponent implements ComponentInterface {
	private String value = "concreteComponentValue";
	@Override
	public String operation(){
		return "ConcreteComponent.operation() value= " + value;
	}

}
