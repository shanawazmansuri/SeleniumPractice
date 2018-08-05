package javaPractise;

import java.util.ArrayList;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {

		ArrayList aa = new ArrayList();
		aa.add("Shanawaz");
		aa.add("Mansuri");
		aa.add(32);
		aa.add("Shanawaz");
		Iterator it = aa.iterator();

		while (it.hasNext())
			System.out.println(it.next());

	}

}
