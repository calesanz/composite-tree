package me.schmidhalter.trees.model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;


public class Branch implements ITreePart {
	protected int startx,starty,endx,endy;
	
	protected Vector<ITreePart> treeparts;
	
	
	public Branch(int startx,int starty, int endx,int endy){
		this.startx = startx;
		this.starty = starty;
		this.endx =endx;
		this.endy = endy;
		treeparts = new Vector<ITreePart>();
	}
	
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawLine(startx,starty,endx,endy);
		for(ITreePart part : treeparts){
			part.draw(g);
		}
	}
	
	public void addChild(ITreePart part){
		this.treeparts.add(part);
	}

}
