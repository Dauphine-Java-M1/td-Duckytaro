package fr.dauphine.ja.phamducchinh.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App
{
    /*
	public static Integer myMax(Integer... numbers)
    {
    	if(numbers == null || numbers.length == 0) return null;
    	else if(numbers.length == 1) return numbers[0];
    	int max = numbers[0];
    	for(int i = 1; i < numbers.length; i++)
    	{
    		if(max < numbers[i]) max = numbers[i];
    	}
    	
    	return max;
    }
	
	public static void main(String[] args)
    {
        System.out.println(myMax(42, 1664));
        System.out.println(myMax(2014, 86, 13));
		
		return;
    }
    */
	
	public static <T extends Object & Comparable<T>> T myMax(T... objects)
	{
		if(objects == null || objects.length == 0) return null;
		else if(objects.length == 1) return objects[0];
		T max = objects[0];
		for(int i = 1; i < objects.length; i++)
		{
			if(max.compareTo(objects[i]) <= 0) max = objects[i];
		}
		
		return max;
	}
	
	private static <T> void print(List<T> list)
	{
		for(T o : list) System.out.println(o);
		
		return;
	}
	
	private static <T extends CharSequence> void printLength(List<T> list)
	{
		for(T o : list) System.out.println(o + ": " + o.length());
		
		return;
	}
	
	public static List<Integer> listLength(List<? extends CharSequence> list)
	{
		ArrayList<Integer> length = new ArrayList<Integer>();
		for(int i = 0; i < list.size(); i++)
		{
			length.add(((CharSequence) list.get(i)).length());
		}
		
		return length;
	}
	
	@SuppressWarnings("unchecked")
	private static <T, S> List<T> fusion(List<T> l1, List<S> l2)
	{
		if(l1.size() != l2.size()) return null;
		
		
		List<T> list = new ArrayList<T>(l1.size() + l2.size());
		for(int i = 0; i < l1.size(); i++)
		{
			list.add(l1.get(i));
			list.add((T) l2.get(i));
		}
		
		return list;
	}
	
	private <T> void swap(List<T> list, int i, int j)
	{
		T obj = list.remove(i);
		list.add(i, list.get(j));
		list.add(j, obj);
		
		return;
	}
	
	public static void main(String[] args) 
	{
		/*
		System.out.println(myMax(8.6, 16.64));
		System.out.println(myMax("baa", "aba"));
		// System.out.println(myMax(8.6, "baa"));
		
		List<String> list = Arrays.asList("foo", "toto");
		print(list);
		printLength(list);
		System.out.println(listLength(list));
		*/
		List<String> l1 = Arrays.asList("C", "rc");
		List<StringBuilder> l2 = Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!"));
		List<? extends CharSequence> r1 = fusion(l1, l2);
		List<?> r2 = fusion(l1, l2);
		List<Integer> l3 = Arrays.asList(1, 2);
		List<Integer> l4 = Arrays.asList(10, 20);
		List<Integer> r3 = fusion(l3, l4);
		List<?> r4 = fusion(l1, l3);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		return;
	}
}
