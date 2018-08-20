package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapIter {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("key1", "abc");
		map.put("key2", "abc1");
		map.put("key3", "abc2");
		map.put("key4", "abc3");
		
		System.out.println(map.get("key1"));//1
		//iterator interface prints random
		Set me=map.entrySet();//The entrySet( ) method declared by the Map interface returns a Set containing the map entries. Each of these set elements is a Map.Entry object.
		Iterator it = me.iterator();
		while(it.hasNext()){
			Map.Entry pairs = (Map.Entry)it.next();//returning one element which have key and value
	        System.out.println(pairs.getKey() + " = " + pairs.getValue());
		}
		
		Set s2=map.keySet();
		Iterator it1=s2.iterator();
		while(it1.hasNext()){
			Object key=it1.next();
			System.out.println(key +"="+map.get(key));
		}
	}
}
