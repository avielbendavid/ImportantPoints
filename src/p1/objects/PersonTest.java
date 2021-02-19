package p1.objects;

// Runnable class
public class PersonTest {

	public static void main(String[] args) {

		
		// every object called instance -
		// instance of person class
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();

		p1.name = "aaa";
		p2.name = "bbb";
		p3.name = "ccc";
		// print
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);

	}
}
