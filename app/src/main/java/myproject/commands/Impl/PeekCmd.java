package myproject.commands.Impl;

import myproject.commands.ICommand;
import myproject.data.Student;
import myproject.stack.IStackable;

public class PeekCmd implements ICommand {
	private final IStackable<Student> stack;

	public PeekCmd(IStackable<Student> stack) {
		this.stack = stack;
	}

	@Override
	public void execute() {
		Student studentToPrint = stack.peek();
		System.out.println(studentToPrint);
	}
	@Override
	public String toString() {

		return "Peek student.";

	}
}
