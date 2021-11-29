package myproject.commands.Impl;

import myproject.commands.ICommand;
import myproject.data.Student;
import myproject.stack.IStackable;

public class GetSizeCmd implements ICommand {
	private final IStackable<Student> stack;

	public GetSizeCmd(IStackable<Student> stack) {
		this.stack = stack;
	}

	@Override
	public void execute() {
		System.out.println("Size of Stack: " + this.stack.size());
	}
	@Override
	public String toString() {

		return "Returns size of stack.";

	}
}