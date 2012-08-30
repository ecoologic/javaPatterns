package eu.eriktech.patterns.decorator;

public class Decorator implements ComponentInterface {

	protected ComponentInterface component;
	
	public Decorator(ComponentInterface component){
		this.component = component;
	}
	
	@Override
	public String operation() {
		return "Decorator.component()";
	}

	public ComponentInterface getComponent() {
		return component;
	}

	public void setComponent(ComponentInterface component) {
		this.component = component;
	}

}
