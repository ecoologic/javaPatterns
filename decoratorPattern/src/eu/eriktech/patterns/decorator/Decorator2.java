package eu.eriktech.patterns.decorator;

public class Decorator2 extends Decorator {
	public Decorator2(ComponentInterface component)	
	{
		super(component);
	}
	@Override
	public String operation() {
		return "Decorator.operation() OVER2";
	}

	public String operation2(){
		return "Decorator2.operation2()";
	}
}
