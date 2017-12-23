package javaPractise;

public class calling {

	public static void main(String[] args) {

		Const a1 = new Const(10, 10);
		System.out.println("Adding result is " + a1.add());

		Const b1 = new Const(50, 20);
		System.out.println("Subsctracting result is " + b1.subs());

		Const c1 = new Const(5, 8);
		System.out.println("Multiplication result is " + c1.multiple());

		Const d1 = new Const(125, 5);
		System.out.println("Multiplication result is " + d1.Divide());

	}

}
