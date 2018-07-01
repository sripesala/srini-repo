package com.java8;

@FunctionalInterface
public interface SortUp<T> {
	
	public <T>  void sort(T[] arraytosort); 
}
