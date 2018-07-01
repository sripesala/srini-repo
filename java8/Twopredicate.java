package com.java8;

@FunctionalInterface
public interface Twopredicate<T> {

	public T isBetter(T s1,T s2);
}
