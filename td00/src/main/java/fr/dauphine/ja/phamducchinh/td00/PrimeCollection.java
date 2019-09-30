package fr.dauphine.ja.phamducchinh.td00;

import java.util.ArrayList;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class PrimeCollection 
{
    private ArrayList<Integer> numbers;
	
	public PrimeCollection()
	{
		numbers = new ArrayList<Integer>();
	}
	
	public int getSize()
	{
		return numbers.size();
	}
	
	public int getNumber(int i)
	{
		return numbers.get(i);
	}
	
	public void initRandom(int n, int m)
	{
		Random r = new Random();
		for(int i = 0; i < n; i++)
			numbers.add(r.nextInt(m) + 1);
		
		return;
	}
	
	private boolean isPrime(int p)
	{
		for(int i = 2; i < Math.sqrt((double) p); i++)
		{
			if(p % i == 0) return false;
		}
		
		return true;
	}
	
	public void printPrimes()
	{
		for(int i = 0; i < numbers.size(); i++)
		{
			if(isPrime(numbers.get(i)))
				System.out.print(numbers.get(i) + " ");
		}
		
		return;
	}
	
	public static void main(String[] args) {
		PrimeCollection test = new PrimeCollection();
		test.initRandom(100, 1999);
		test.printPrimes();
		
		return;
	}
}
