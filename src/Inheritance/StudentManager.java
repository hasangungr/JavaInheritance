package Inheritance;

public class StudentManager extends CrudManager{
	public void queryId(Student student) {
		System.out.println(student.getStudentId()+" Numaral� ��renci");
	}
	public void List(Student[] st) {
		for(Student i:st) {
			System.out.println(i.getDepartment()+" "+i.getName()+" "+i.getStudentId());
		}
	}
}
