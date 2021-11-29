package myproject.commands.Impl;

import myproject.commands.ICommand;
import myproject.data.Student;
import myproject.stack.IStackable;

public class ClearCmd implements ICommand {

	private final IStackable<Student> stack;

	public ClearCmd(IStackable<Student> stack) {
		this.stack = stack;
	}

	@Override
	public void execute() {
		this.stack.clear();
	}
	@Override
	public String toString() {

		return "Clear stack.";

	}
}
