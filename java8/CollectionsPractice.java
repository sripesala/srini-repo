package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeSet;

import javafx.collections.transformation.SortedList;

public class CollectionsPractice {
	
	String[] s = new String [] {"A","G","F","I","K"};

	public static void main(String[] args) {
		CollectionsPractice coll = new CollectionsPractice();
		coll.checkmeout();
		coll.reflect(Map.class);
		coll.reflect(List.class);
		coll.reflect(Queue.class);
		
		coll.addValues(new ArrayList<>());
		coll.addValues(new LinkedList());

		coll.addValues(new HashSet<>());
		coll.addValues(new LinkedHashSet());
		coll.addValues(new TreeSet<>());



	}

	public void checkmeout() {
		System.out.println("b4");
		assert true; //assert false breaks if false.
		System.out.println("after");
	}
	
	public void reflect(Class cls) {
		System.out.println(cls.getName());
		Arrays.asList(cls.getInterfaces()).stream().forEach(System.out::println);
	}
	
	public <T extends Collection> void addValues(T t) {
		System.out.println(t.getClass().getName());
		t.addAll(Arrays.asList(s));
		t.stream().forEach(System.out::println);
	}
}
