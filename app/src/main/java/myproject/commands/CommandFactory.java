package myproject.commands;

import myproject.commands.Impl.ExitProgramCmd;
import myproject.console.IConsole;

import java.util.LinkedList;

public class CommandFactory {

	final private IConsole console;

	public CommandFactory(IConsole console) {
		super();
		this.console = console;
	}
	public LinkedList<ICommand> returnsCommands() {
		LinkedList<ICommand> cmds = new LinkedList<ICommand>();

		cmds.add(new ExitProgramCmd());

		return cmds;
	}
}
