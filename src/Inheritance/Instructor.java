package Inheritance;

public class Instructor extends User{
	private String instructorId;
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Instructor() {
		super();
		this.instructorId = instructorId;
	}

	public String getInstructorId() {
		return getName().substring(0,2)+"000";
	}

	
}
