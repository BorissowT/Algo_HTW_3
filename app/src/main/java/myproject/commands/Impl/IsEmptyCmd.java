package myproject.commands.Impl;

import myproject.commands.ICommand;
import myproject.data.Student;
import myproject.stack.IStackable;

public class IsEmptyCmd implements ICommand {

	private final IStackable<Student> stack;

	public IsEmptyCmd(IStackable<Student> stack) {
		this.stack = stack;
	}

	@Override
	public void execute() {
		System.out.println("Is empty: " + this.stack.isEmpty());
	}
	@Override
	public String toString() {

		return "Is stack empty.";

	}
}
