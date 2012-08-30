package eu.eriktech.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

	private Integer value = null;
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	@Override
	public void add(Observer obs) {
		observers.add(obs);
	}

	public void notifyObservers(){
		if (observers != null)
		for (Observer observer : observers) {
			observer.update(value);
		}
	}
	
	public void setValue(Integer value){
		this.value = value;
		notifyObservers();
	}
	
}
