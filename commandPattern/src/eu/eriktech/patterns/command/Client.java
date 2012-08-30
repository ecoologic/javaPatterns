package eu.eriktech.patterns.command;

public class Client {
	public static void main (String[] arg0){
		// ? so this is how it works with just the simple class
		Command c = new ConcreteCommand1("you need the pack in the bucket");
		c.execute();
		c.hello();
		
		// ? but if you have many extended classes, this will behave in different ways
		MacroCommand mc = new MacroCommand();
		mc.addCommand(new ConcreteCommand1("cobra is not a snake"));
		mc.addCommand(new ConcreteCommand2());	
		mc.execute();
	}
}
