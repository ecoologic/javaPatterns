package eu.eriktech.patterns.observer;

public class ConcreteObserver1 implements Observer {

	private Integer value;
	
	@Override
	public void update(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	
}
