package com.velocity.collections;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {

		HashSet hashSet = new HashSet();
		hashSet.add("ram");
		hashSet.add("shyam");
		hashSet.add(null);
		hashSet.add(10);
		hashSet.add("ram"); // return false
		System.out.println(hashSet);
	}


}
