package fr.dauphine.ja.phamducchinh.iterable;

import java.util.AbstractList;
// import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Panel 
{
	public static Iterator<Integer> panel1(final int i, final int j)
	{
		/*
		HashSet<Integer> hs = new HashSet<Integer>();
		for(; i <= j; i++) hs.add(i);
		
		Iterator<Integer> it = hs.iterator();
		*/
		Iterator<Integer> it = new Iterator<Integer>()
		{
			int value = i;
			
			public boolean hasNext()
			{
				if(value <= j) return true;
				else return false;
			}

			public Integer next()
			{
				int temp = value;
				value++;
				return temp;
			}
		};
		
		return it;
	}
	
	public static Iterable<Integer> panel2(final int i, final int j)
	{
		Iterable<Integer> it = new Iterable<Integer>() {
			
			public Iterator<Integer> iterator()
			{
				return panel1(i, j);
			}
		};
		return it;
	}
	
	public static List<Integer> panel(final int i, final int j)
	{
		if(j <= i) throw new IllegalArgumentException();
		AbstractList<Integer> l = new AbstractList<Integer>()
		{
			@Override
			public Integer get(int index)
			{
				if(index >= 0 && index < size())
				{
					return i + index;
				}
				else return -1;
			}

			@Override
			public int size()
			{
				return j - i + 1;
			}
		};
		return l;
	}
	
    public static void main(String[] args)
    {
        Iterator<Integer> it = panel1(1, 5);
        System.out.print("Panel1: ");
        for(; it.hasNext(); )
        	System.out.print(it.next() + " ");
        System.out.println();
        
        System.out.print("Panel2: ");
        for(int i: panel2(1, 5))
        	System.out.print(i + " ");
        System.out.println();
        
        List<Integer> l = panel(3, 6);
        System.out.print("Panel: ");
        for(int i: l) System.out.print(i + " ");
        System.out.println();
        
        return;
    }
}
