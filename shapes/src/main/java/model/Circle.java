package model;

import java.awt.Color;
import java.awt.Graphics;

import fr.dauphine.ja.phamducchinh.shapes.Point;

public class Circle extends Shape
{
	private int r;
	
	public Circle(Point point, int r)
	{
		super.setPoint(point);
		this.r = r;
	}
	
	public int getR()
	{
		return r;
	}
	
	@Override
	public void setPoint(Point point)
	{
		super.setPoint(new Point(point.getX() - (int) Math.round(r/2), point.getY() - (int) Math.round(r/2)));
		
		return;
	}
	
	@Override
	public void draw(Graphics g)
	{
		if(getPoint().getX() >= 0 && getPoint().getY() >= 0)
		{
			g.setColor(Color.BLUE);
			g.fillOval(getPoint().getX(), getPoint().getY(), r, r);
			g.setColor(Color.BLACK);
			g.drawOval(getPoint().getX(), getPoint().getY(), r, r);
		}
		
		return;
	}
	
}
