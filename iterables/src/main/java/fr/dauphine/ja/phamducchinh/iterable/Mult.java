package fr.dauphine.ja.phamducchinh.iterable;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Mult
{
	public static List<Integer> mult(final int n, final List<Integer> l)
	{
		AbstractList<Integer> al = new AbstractList<Integer>()
		{
			
			@Override
			public int size()
			{
				return l.size();
			}
			
			@Override
			public Integer get(int index)
			{
				return l.get(index) * n;
			}
		};
		
		return al;
	}
	
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0; i < 1000000; i++)
			al.add(i);
		long t0 = System.nanoTime();
		List<Integer> ret = mult(2, al);
		long sum = 0;
		for(int val: ret)
			sum += val / 2;
		System.out.println(System.nanoTime() - t0);
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for(int i = 0; i < 1000000; i++)
			ll.add(i);
		t0 = System.nanoTime();
		sum = 0;
		ret = mult(2, ll);
		for(int val: ret)
			sum += val / 2;
		System.out.println(System.nanoTime() - t0);
		
		return;
	}
}
