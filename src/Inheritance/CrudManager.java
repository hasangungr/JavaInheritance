package Inheritance;

public class CrudManager {
	public void Add(User user) {
		System.out.println(user.getName()+" Eklendi");
	}
	public void List(User[] user) {
		for(User i:user) {
			System.out.println(i.getDepartment()+" "+i.getName()+" ");
		}
	}
}
