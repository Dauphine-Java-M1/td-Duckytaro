package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import fr.dauphine.ja.phamducchinh.shapes.Point;
import view.MyDisplay;
import model.Shape;

public class MouseController implements MouseMotionListener
{
	private MyDisplay view;
	private Shape model;
	
	public MouseController(MyDisplay view, Shape model)
	{
		this.view = view;
		this.model = model;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		
		return;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		model.setPoint(new Point(e.getX(), e.getY()));
		view.notifyView();
		
		return;
	}
}
