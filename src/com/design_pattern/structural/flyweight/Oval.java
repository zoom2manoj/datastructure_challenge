package com.design_pattern.structural.flyweight;

import java.awt.Color;
import java.awt.Graphics;

public class Oval implements Shape{

	private boolean fill;
	
	
	public Oval(boolean fill) {
		// TODO Auto-generated constructor stub
		
		this.fill = fill;
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Override
	public void draw(Graphics g, int x, int y, int width, int height,
			Color color) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.drawOval(x, y, width, height);
		if (fill) {
			g.fillOval(x, y, width, height);
		}
		
	}

	
}
