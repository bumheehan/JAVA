package soozl.study;

import java.util.ArrayList;

public class EnhancedFor {

	public static void main(String[] args) {
//		String[] color = {"red", "yellow", "green"};
//		for(String s : color) {
//			System.out.println(s);
//		}
		ArrayList<String> drink = new ArrayList<String>();
		drink.add("beer");
		drink.add("coffee");
		drink.add("coke");
		drink.add("water");
		for(String d : drink) {
			System.out.println(d);
		}
	}
}
