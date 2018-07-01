package com.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8Practice {

	static String string1 = "Longggggggggggggstring";
	static String string2 = "short";
	static List<String> words = Arrays.asList("hi", "hello", "yeild","fork","join","asynch");
	List<String> words1 = Arrays.asList("hi", "hello", "yeild","fork","join","asynch");
	
	public static void main(String[] args) {
		
		//Customized functional interface
		System.out.println("long string is ..."+ betterEntry(string1, string2, (f,s)->{
			
			if(f.length()>s.length()) {
				return f;
			}else {
				return s;
			}}
			));
		
		System.out.println("long string is ..."+ betterEntry(1, 2, (f,s)->{
			
			if(f>s) {
				return f;
			}else {
				return s;
			}}
			));
		
		sortArray(Arrays::sort,new Integer[] {3,5,2,8,20});
		List<Integer> list  = Arrays.asList(new Integer[] {3,5,2,8,20});
		list.stream().forEach(System.out::println);		

		Elementutilslocal util = new Elementutilslocal();
		util.allmatches((str)->((String) str).length()>4, words).stream().forEach(System.out::println);
		
		List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);
		util.allmatches((num)->((Integer) num)>500, nums).stream().forEach(System.out::println);

		util.transformedList((str)->((String)str).toUpperCase() ,words).stream().forEach(System.out::println);
		util.transformedList((str)->((String)str).replaceAll("o", "LL") ,words).stream().forEach(System.out::println);

	}
	
	private static <T> T betterEntry(T s1,T s2,Twopredicate<T> p) {
		return p.isBetter(s1, s2);
	}
	
	private static <T> void sortArray(SortUp<T> s,T[] arraytoSort) {
		s.sort(arraytoSort);
		List<Integer> list  = Arrays.asList(new Integer[] {3,5,2,8,20});
		list.stream().forEach(System.out::println);		
	}

	public class innerclass{
		innerclass(){
			words1.forEach(System.out::println);
		}
	}
	
	public static class staticinnerclass{
		staticinnerclass(){
//			words1.forEach(System.out::println);
		}
	}
}

class Elementutilslocal<T>{
	
	public List<T> allmatches(Predicate<T> p,List<T> l){
		return l.stream().filter(p).collect(Collectors.toList());
	}
	
	public List<T> transformedList(Function<String, String> f, List<T> l){
		return (List<T>) l.stream().map((str)->str.toString()).map(f).collect(Collectors.toList());
	}
}
