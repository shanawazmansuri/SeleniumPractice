package javaPractise;

public class WrapperClass {

	public static void main(String[] args) {

		String a = "100";
		String x = "10.10";
		String p = "True";

		double z = Double.parseDouble(x);
		int b = Integer.parseInt(a);

		Boolean q = Boolean.parseBoolean(p);

		System.out.println(a + 100);
		System.out.println(b + 100);
		System.out.println(x + 100);
		System.out.println(z + 100);
		System.out.println(p + 100);
		System.out.println(q);
	}

}
