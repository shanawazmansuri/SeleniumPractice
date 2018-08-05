package javaPractise;

import java.util.ArrayList;

public class Listing {

	int id;
	int qty;
	String bookname;

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();

		Listing b1 = new Listing(2, 515, "Razavi");
		Listing b2 = new Listing(25, 715, "Qadri");
		Listing b3 = new Listing(75, 355, "Chishti");

		a1.add(b1);
		a1.add(b2);
		a1.add(b3);

		for (Object oo : a1) {
			System.out.println("Each values in list is " + oo);
		}

	}

	public Listing(int id, int qty, String bookname) {

		this.id = id;
		this.qty = qty;
		this.bookname = bookname;
	}

}
