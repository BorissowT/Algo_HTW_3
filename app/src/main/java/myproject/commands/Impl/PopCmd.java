package myproject.commands.Impl;

import myproject.commands.ICommand;
import myproject.console.IConsole;
import myproject.data.Student;
import myproject.stack.IStackable;

public class PopCmd implements ICommand {
	private final IStackable<Student> stack;

	public PopCmd(IStackable<Student> stack) {
		this.stack = stack;
	}

	@Override
	public void execute() {
		this.stack.pop();
	}
	@Override
	public String toString() {

		return "Pop student from stack.";

	}
}