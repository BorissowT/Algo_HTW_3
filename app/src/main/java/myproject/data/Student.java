package myproject.data;

public class Student {
	private String prename;
	private String surname;
	private int matriculationNumber;
	private int course;

	public Student(String prename, String surname, int matriculationNumber, int course) {
		this.prename = prename;
		this.surname = surname;
		this.matriculationNumber = matriculationNumber;
		this.course = course;
	}

	public String toString() {
		return "Student [prename=" + this.prename + ", surname=" + this.surname + ", matriculationNumber=" + this.matriculationNumber + ", course=" + this.course + "]";
	}

	public String getPrename() {
		return this.prename;
	}

	public void setPrename(String prename) {
		this.prename = prename;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getMatriculationNumber() {
		return this.matriculationNumber;
	}

	public void setMatriculationNumber(int matriculationNumber) {
		this.matriculationNumber = matriculationNumber;
	}

	public int getCourse() {
		return this.course;
	}

	public void setCourse(int course) {
		this.course = course;
	}
}

