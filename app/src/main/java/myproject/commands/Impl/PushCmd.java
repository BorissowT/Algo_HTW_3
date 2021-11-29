package myproject.commands.Impl;

import myproject.commands.ICommand;
import myproject.console.IConsole;
import myproject.data.Student;
import myproject.stack.IStackable;


public class PushCmd implements ICommand {

	final private IConsole console;
	private final IStackable<Student> stack;

	public PushCmd(IConsole console, IStackable<Student> stack) {
		this.console = console;
		this.stack = stack;
	}

	@Override
	public void execute() {
		String prename = console.readString("Please enter prename: ");
		String surname = console.readString("Please enter surname: ");
		int matriculationNumber = console.readInteger("Please enter course number: ");
		int course = console.readInteger("Please enter matriculation number: ");
		Student student = new Student(prename, surname, matriculationNumber, course);
		stack.push(student);
	}
	@Override
	public String toString() {

		return "Push student to stack.";

	}
}