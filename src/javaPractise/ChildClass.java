package javaPractise;

public class ChildClass {

	String names = "Child";
	String subname = "SubChild";

	public static void main(String[] args) {

		ChildClass cc = new ChildClass();
		ParentClass pp = new ParentClass("Shanawaz", "Mansuri");
		ParentClass pp1 = new ParentClass("Mohammed Husain", "Shanawaz Mansuri");
		ParentClass pp3 = new ParentClass("Mohammed Husain", "Shanawaz Mansuri");

	}

	public void ChildMethod() {

		System.out.println("My Class name is " + names);

	}

	public void ParentMethod() {

		System.out.println("My Class name is " + subname);

	}

}