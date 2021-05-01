package Inheritance;

public class InstructorManager extends CrudManager{
	
	public void raiseSalary(Instructor instructor, double raise) {
		System.out.println((instructor.getSalary()+raise));
	}
	public void List(Instructor[] it) {
		for(Instructor i:it) {
			System.out.println(i.getDepartment()+" "+i.getName()+" "+i.getSalary()+" "+i.getInstructorId());
		}
	}
}
