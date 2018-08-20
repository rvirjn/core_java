package com;

import java.util.*;

public class MapShort
{
	public static void main(String[] args)
	{
		//LinkedHashMap map=new LinkedHashMap(); to maintain insertion order and not use for sorting
		Map map = new HashMap(); //can use for sorting in treemap
//		map.put("1", "c");
//		map.put("2", "a");
//		map.put("4", "b");
//		map.put("3", "a");

//		map.put(1, "c");
//		map.put(2, "a");
//		map.put(4, "b");
//		map.put(3, "a");
		
		
		map.put("a", "1");
		map.put("d", "2");
		map.put("b", "4");
		map.put("c", "3");
		
		map.put("abbc", "ravi");
		map.put("dcf", "shahi");
		map.put("czf", "binay");
		map.put("bcc", "raaj");
		
		//System.out.println(map);
		TreeMap t1=new TreeMap(map);// on key with same type only its  working/not working sometime
		System.out.println(map);

		Map m1=sortByValues(map);
		System.out.println(m1);
	}
		private static HashMap sortByValues(Map map) { 
		       List list = new LinkedList(map.entrySet());
		       // Defined Custom Comparator here
		       Collections.sort(list, new Comparator() {
		            public int compare(Object o1, Object o2) {
		               return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
		            }
		       });

		       // Here I am copying the sorted list in HashMap
		       // using LinkedHashMap to preserve the insertion order
		       HashMap sortedHashMap = new LinkedHashMap();
		       Iterator ite = list.iterator();
		       while ( ite.hasNext()) {
		              Map.Entry entry = (Map.Entry) ite.next();//one set which have key and value =Map.Entry
		              sortedHashMap.put(entry.getKey(), entry.getValue());
		       } 
		       return sortedHashMap;
		  }
		
	}
	

