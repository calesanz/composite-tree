package me.schmidhalter.trees.model;

import java.awt.Color;
import java.awt.Graphics;

public class Leaf implements ITreePart {
	protected int startx, starty, endx, endy;

	public Leaf(int startx, int starty, int endx, int endy) {
		this.startx = startx;
		this.starty = starty;
		this.endx = endx;
		this.endy = endy;
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillOval(startx, starty, endx-startx, endy-starty);
		
		//g.drawArc(startx, starty, endx-startx, endy-starty, 10, 10);
	}

}
