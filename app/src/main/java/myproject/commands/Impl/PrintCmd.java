package myproject.commands.Impl;

import myproject.commands.ICommand;
import myproject.data.Student;
import myproject.stack.IStackable;

public class PrintCmd implements ICommand {
	private final IStackable<Student> stack;

	public PrintCmd(IStackable<Student> stack) {
		this.stack = stack;
	}

	@Override
	public void execute() {
		this.stack.print();

	}
	@Override
	public String toString() {

		return "Print all students from stack.";

	}
}