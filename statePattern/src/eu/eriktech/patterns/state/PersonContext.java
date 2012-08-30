package eu.eriktech.patterns.state;

// ? it implements the STATE and HAS the state as a property too
// ? this patter is similar to strategy, but
// ? strategy does not store the state, it just uses once
public class PersonContext implements PersonState{
	private PersonState state;

	public PersonState getState() {
		return state;
	}

	public void setState(PersonState state) {
		this.state = state;
	}
	
	
	//** this is also the delegate pattern
	public String work(){
		return state.work();
	}
}
