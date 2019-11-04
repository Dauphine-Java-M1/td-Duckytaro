package fr.dauphine.ja.phamducchinh.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
	public static Iterator<Integer> panel1(int i, int j)
	{
		List<Integer> list = new ArrayList<Integer>();
		for(; i <= j; i++)
			list.add(i);
		
		Iterator<Integer> it = list.iterator();
		
		return it;
	}
	
    public static void main( String[] args )
    {
        Iterator<Integer> it = panel1(1, 5);
        for(; it.hasNext(); )
        	System.out.println(it.next());
        return;
    }
}
