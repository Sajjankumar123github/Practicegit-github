package com.velocity.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
	  TreeSet<String> ts = new TreeSet<String>();
	  ts.add("chotu");
	  ts.add("motu");
	  ts.add("balu");
	  System.out.println(ts);
	  
	  TreeSet<Integer> ts1 = new TreeSet<Integer>();
	  ts1.add(10);
	  ts1.add(12);
	  ts1.add(20);
	  System.out.println(ts1);

	}

}
