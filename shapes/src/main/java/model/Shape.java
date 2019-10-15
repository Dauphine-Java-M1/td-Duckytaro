package model;

import java.awt.Graphics;

import fr.dauphine.ja.phamducchinh.shapes.Point;

public abstract class Shape
{
	private Point point;
	
	public Point getPoint()
	{
		return point;
	}
	
	public void setPoint(Point point)
	{
		this.point = point;
		return;
	}
	
	public abstract void draw(Graphics g);
}
