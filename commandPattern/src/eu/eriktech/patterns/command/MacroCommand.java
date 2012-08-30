package eu.eriktech.patterns.command;

import java.util.ArrayList;
import java.util.Iterator;

public class MacroCommand implements Command{
	private java.util.List<Command> commands = new ArrayList<Command>();

	@Override
	public void hello(){
		System.out.println("MacroCommand.hello()");
	}
	
	public void addCommand(Command command){
		commands.add(command);
	}
	
	@Override
	public void execute() {
		System.out.println("MacroCommand.execute");
		Iterator<Command> i = commands.iterator();
		while (i.hasNext()){
			Command c = (Command)i.next();
			c.execute();			
		}
		
	}
	

}
