package model;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
//		Map<String, String> map = new HashMap<String, String>();
		SortedMap<String, String> map = new TreeMap<String, String>();
		System.out.println(map.isEmpty()+":"+map.size());
		map.put("GDB", "8511");
		map.put("YT", "1158");
		map.put("RR", "56");
		System.out.println(map.isEmpty()+":"+map.size());
		Set<String> keys = map.keySet();
		for(Iterator<String> it = keys.iterator(); it.hasNext(); ){
			String key = it.next();
			String value = map.get(key);
			System.out.println(key+":"+value);
		}
		

	}

}
