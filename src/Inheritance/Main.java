package Inheritance;



public class Main {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Hasan");
		s1.setDepartment("MIS");
		s1.setMail("@gmail.com");
		Student s2 = new Student();
		s2.setName("Hakan");
		s2.setDepartment("Software");
		s2.setMail("@gmail.com");
		///*****///
		Instructor i1 = new Instructor();
		i1.setDepartment("Economy");
		i1.setMail("@hotmail.com");
		i1.setName("Mustafa");
		i1.setSalary(15.000);
		Instructor i2 = new Instructor();
		i2.setDepartment("PR");
		i2.setMail("@hotmail.com");
		i2.setName("Salim");
		i2.setSalary(16.000);
		
		User[] users = {i1,i2,s1,s2};
		Student[] students = {s1,s2};
		Instructor[] instructors =  {i1,i2};
		
		StudentManager studentManager = new StudentManager();
		studentManager.Add(s1);
		studentManager.List(students);
		studentManager.queryId(s2);	
		System.out.println("******************");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.Add(i1);
		instructorManager.List(instructors);
		instructorManager.raiseSalary(i2, 1.500);
		System.out.println("***********************");
		CrudManager crudManager = new CrudManager();
		crudManager.List(users);
		System.out.println("******************");
		
	
	}
	

}
