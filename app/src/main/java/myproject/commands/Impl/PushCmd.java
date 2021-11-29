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
		String prename = console.readString("Please type firstname of the student");
		String surname = console.readString("Please lastname name of the student");
		int matriculationNumber = console.readInteger("Please type matriculation number of the student");
		int course = console.readInteger("Please type course number of the student");
		Student student = new Student(prename, surname, matriculationNumber, course);
		stack.push(student);
	}
	@Override
	public String toString() {

		return "Push student to stack.";

	}
}