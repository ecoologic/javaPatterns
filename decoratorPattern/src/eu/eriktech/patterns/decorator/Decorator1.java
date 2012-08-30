package eu.eriktech.patterns.decorator;

public class Decorator1 extends Decorator {

	public Decorator1(ComponentInterface component){
		super(component);
	}
	
	@Override
	public String operation() {
		return "Decorator.operation() OVER1";
	}
	
	public String operation1(){
		return "Decorator1.operation1()";
	}
	
}
