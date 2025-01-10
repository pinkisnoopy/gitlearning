package com.collectons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.Vector;

public class Prog7 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(101, "hyd");
		hm.put(102, "sec");
		hm.put(103, "nam");
		
	Iterator<Entry<Integer, String>> i=hm.entrySet().iterator();
	while( i.hasNext())
	{
		System.out.println(i.next());
	}
		
		//hm.keySet().iterator();
		//hm.values().iterator();
		//hm.entrySet().iterator();
	}

}
