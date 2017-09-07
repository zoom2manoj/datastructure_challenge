package com.design_pattern.structural.flyweight;

import java.awt.Color;
import java.awt.Graphics;

public class Line implements Shape{

	
	public Line() {
		// TODO Auto-generated constructor stub
		System.out.println("create line object");
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
		g.drawLine(x, y, width, height);
		
	}

}
