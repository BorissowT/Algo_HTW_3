package myproject.commands;

import myproject.commands.Impl.*;
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
		cmds.add(new PushCmd());
		cmds.add(new PopCmd());
		cmds.add(new PeekCmd());
		cmds.add(new IsEmptyCmd());
		cmds.add(new ClearCmd());
		cmds.add(new PrintCmd());
		cmds.add(new GetSizeCmd());

		return cmds;
	}
}
