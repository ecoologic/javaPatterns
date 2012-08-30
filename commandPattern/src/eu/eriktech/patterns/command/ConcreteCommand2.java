package eu.eriktech.patterns.command;

public class ConcreteCommand2 implements Command{

	@Override
	public void execute() {
		System.out.println("ConcreteCommand2.execute");
	}

	@Override
	public void hello() {
		System.out.println("concreteCommand2.hello()");
		
	}


}
