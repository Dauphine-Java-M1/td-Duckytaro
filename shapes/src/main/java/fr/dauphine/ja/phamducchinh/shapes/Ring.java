package fr.dauphine.ja.phamducchinh.shapes;

public class Ring extends Circle
{
	private int internR;
	
	public Ring(Point p, int r, int internR)
	{
		super(p, r);
		this.internR = internR;
	}
	
	public boolean equals(Ring ring)
	{
		return (getCenter().equals(ring.getCenter()) && getR() == ring.getR() && internR == ring.internR);
	}
	
	@Override
	public String toString()
	{
		return "Anneau de centre " + getCenter() + ", de rayon externe " + getR() + " et de rayon interne " + internR;
	}
	
	@Override
	public boolean contains(Point p)
	{
		if(super.contains(p))
		{
			return (Math.pow(p.getX() - getCenter().getX(), 2) + Math.pow(p.getY() - getCenter().getY(), 2) > Math.pow(internR, 2));
		}
		return false;
	}
	
	public boolean contains(Point p, Ring...rings)
	{
		for (Ring ring : rings) {
			if(ring.contains(p)) return true;
		}
		return false;
	}
}
