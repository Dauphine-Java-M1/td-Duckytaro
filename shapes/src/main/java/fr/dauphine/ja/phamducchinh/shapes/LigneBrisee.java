package fr.dauphine.ja.phamducchinh.shapes;

import java.util.LinkedList;

public class LigneBrisee
{
	private LinkedList<Point> array;
	
	public LigneBrisee(int n)
	{
		array = new LinkedList<Point>();
	}
	
	@Override
	public String toString()
	{
		String str = "[";
		for(int i = 0; i < array.size(); i++)
		{
			str += array.get(i);
			if(i+1 != array.size())
				str += ", ";
			else
				break;
		}
		
		return str + "]";
	}
	/*
	public void add(Point p)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == null)
			{
				array[i] = p;
				break;
			}
		}
		
		return;
	}
	
	public int pointCapacity()
	{
		return array.length;
	}
	
	public int nbPoints()
	{
		int nb = 0;
		for(int i = 0; i < array.length && array[i] != null; i++)
			nb++;
		if(nb == array.length && array[array.length-1] == null) return 0;
		else return nb;
	}
	
	public boolean contains(Point p)
	{
		for (Point point : array)
		{
			if(point.isSameAs(p)) return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		LigneBrisee test = new LigneBrisee(5);
		System.out.println(test.pointCapacity());
		System.out.println(test.nbPoints());
		test.add(new Point(1, 2));
		System.out.println(test);
		test.add(new Point(2, 3));
		System.out.println(test);
		test.add(new Point(3, 4));
		System.out.println(test);
		test.add(new Point(4, 5));
		System.out.println(test);
		test.add(new Point(5, 6));
		System.out.println(test);
		test.add(new Point(6, 7));
		System.out.println(test);
		System.out.println(test.nbPoints());
		System.out.println(test.contains(new Point(1, 2)));
		System.out.println(test.contains(new Point(0, 0)));
		
		return;
	}
	*/
}
