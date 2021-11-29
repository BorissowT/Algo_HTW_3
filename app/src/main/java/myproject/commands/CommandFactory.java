package myproject.commands;

import myproject.commands.Impl.*;
import myproject.console.IConsole;
import myproject.data.Student;
import myproject.stack.IStackable;
import myproject.stack.Stack;

import java.util.LinkedList;

public class CommandFactory {

	final private IConsole console;
	IStackable<Student> stack = new Stack();

	public CommandFactory(IConsole console) {
		super();
		this.console = console;
	}
	public LinkedList<ICommand> returnsCommands() {
		LinkedList<ICommand> cmds = new LinkedList<ICommand>();

		cmds.add(new ExitProgramCmd());
		cmds.add(new PushCmd(console, stack));
		cmds.add(new PopCmd());
		cmds.add(new PeekCmd());
		cmds.add(new IsEmptyCmd());
		cmds.add(new ClearCmd());
		cmds.add(new PrintCmd());
		cmds.add(new GetSizeCmd());

		return cmds;
	}
}
