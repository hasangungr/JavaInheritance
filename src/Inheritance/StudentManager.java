package Inheritance;

public class StudentManager extends CrudManager{
	public void queryId(Student student) {
		System.out.println(student.getStudentId()+" Numaralı Öğrenci");
	}
	public void List(Student[] st) {
		for(Student i:st) {
			System.out.println(i.getDepartment()+" "+i.getName()+" "+i.getStudentId());
		}
	}
}
