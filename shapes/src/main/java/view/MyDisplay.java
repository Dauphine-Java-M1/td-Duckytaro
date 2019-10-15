package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.MouseController;
import fr.dauphine.ja.phamducchinh.shapes.Point;
import model.Circle;
import model.Shape;

public class MyDisplay extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private MouseController controller;
	private Shape model;
	
	public MyDisplay(Shape model)
	{
		this.model = model;
		controller = new MouseController(this, this.model);
		super.addMouseMotionListener(controller);
		this.setBackground(Color.WHITE);
	}
	

	@Override
	public void paintComponent(Graphics g)
	{
		// g.drawLine(120, 120, 200, 5);
		super.paintComponent(g);
		model.draw(g);
		
		return;
	}
	
	public void notifyView()
	{
		super.repaint();
		
		return;
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500, 500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDisplay d = new MyDisplay(new Circle(new Point(-1, -1), 50));
		frame.add(d);
		
		return;
	}
}
