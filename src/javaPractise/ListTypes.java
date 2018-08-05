package javaPractise;

import java.util.ArrayList;

public class ListTypes {

	public static void main(String[] args) {
		ArrayList<String> aa = new ArrayList<String>();

		aa.add("Shanawaz");
		aa.add("Mansuri");
		aa.add("Qadri");
		int y = aa.size();
		for (int i = 0; i < y; i++) {

			String Values = aa.get(i);
			System.out.println("Each values are " + Values);

		}

		for (String s : aa) {
			System.out.println("Values of string Array is " + s);
		}

	}

}
