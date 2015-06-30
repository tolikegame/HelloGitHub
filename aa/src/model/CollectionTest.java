package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionTest {

	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
		SortedSet<String> list = new TreeSet<String>();
		list.add("AAA");
		list.add("CHE");
		list.add("AVA");
		for(Iterator<String> it = list.iterator(); it.hasNext(); ){
			String s = it.next();
			System.out.println(s);
		}
		System.out.println(list.isEmpty()+":"+list.size());

	}

}
