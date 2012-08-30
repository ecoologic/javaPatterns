package eu.eriktech.patterns.command;

public class ConcreteCommand1 implements Command {
	private String state;
	

	public ConcreteCommand1(String state){
		this.state  = state;
	}
	
	@Override
	public void execute() {
		System.out.println("ConcreteCommand1.execute state = " + state);
	}

	@Override
	public void hello() {
		System.out.println("hello!");
		
	}

}
