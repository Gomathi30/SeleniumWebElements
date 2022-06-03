package Package;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DemoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> newList = new ArrayList<Integer> ();
		newList.add(1);
		newList.add(2);
		newList.add(1, 3);
		newList.add(2,4);
		newList.remove(3);
		System.out.println(newList.get(0));
		for (int i :newList)
			System.out.println(i);
		
		HashSet<String> newSet = new HashSet<String> ();
		newSet.add("John");
		newSet.add("Joe");
		newSet.add("Jove");
		newSet.add("Joe");
		System.out.println(newSet);
		
		HashMap<Integer,String> newHash = new HashMap<Integer,String>();
		newHash.put(1,"Thanksi");
		newHash.put(1,"Thanksi");
		newHash.put(2,"Harsi");
		System.out.println(newHash);
	}

}
