package fr.dauphine.ja.phamducchinh.shapes;

import java.util.Objects;

public class Point 
{
    private int x;
    private int y;
    
    public Point(int x, int y)
    {
    	this.x = x;
    	this.y = y;
    }
    
    public Point(Point p)
    {
    	x = p.x;
    	y = p.y;
    }
    
    @Override
    public String toString()
    {
    	return "(" + x + "," + y + ")";
    }
    
    public boolean isSameAs(Point p)
    {
    	if(Objects.requireNonNull(p) != null) return p.x == x && p.y == y;
    	return false;
    }
}
