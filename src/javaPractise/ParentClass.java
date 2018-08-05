package javaPractise;

public class ParentClass {

	String name;
	String surname;

	public void ParentMethod() {

		System.out.println("My Class name is " + name + "and Surname is " + surname);

	}

	public ParentClass(String aa, String bb) {
		name = aa;
		surname = bb;
		System.out.println("my name is name " + name + "and my surname is " + surname);

	}

}
