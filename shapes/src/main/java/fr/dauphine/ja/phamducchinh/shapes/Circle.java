package fr.dauphine.ja.phamducchinh.shapes;

public class Circle {
	private Point centre;
	private int r;
	
	public Circle(Point centre, int r)
	{
		this.centre = centre;
		this.r = r;
	}
	
	@Override
	public String toString()
	{
		return "Cercle de centre " + centre.toString() + ", de rayon " + r + " et de surface " + surface();
	}
	
	public void translate(int dx, int dy)
	{
		centre.translate(dx, dy);
		return;
	}
	
	public Point getCenter()
	{
		return centre;
	}
	
	public int getR()
	{
		return r;
	}
	
	public double surface()
	{
		return Math.pow(r, 2) * Math.PI;
	}
	
	public boolean contains(Point p)
	{
		return (Math.pow(p.getX() - centre.getX(), 2) + Math.pow(p.getY() - centre.getY(), 2) < Math.pow(r, 2));
	}
	
	public static boolean contains(Point p, Circle...circles)
	{
		for (Circle c : circles) {
			if(c.contains(p)) return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		/*
		Point p = new Point(1, 2);
		Circle c2 = new Circle(p, 2);
		c2.translate(1, 1);
		System.out.println(c + " " + c2);
		*/
		Circle c = new Circle(new Point(1, 2), 2);
		c.getCenter().translate(1, 1);
		System.out.println(c);
		
		return;
	}
}
