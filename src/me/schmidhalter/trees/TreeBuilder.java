package me.schmidhalter.trees;

import me.schmidhalter.trees.model.Branch;
import me.schmidhalter.trees.model.ITreePart;
import me.schmidhalter.trees.model.Leaf;

public class TreeBuilder {

	public static ITreePart generateTree(int startx, int starty, int endx, int endy, int depth) {
		if(Math.random()<0.2){
			return new Leaf(startx,starty,endx,endy);
		}
		
		
		if (depth > 0) {
			Branch base = new Branch(startx, starty, endx, endy);
			int numberOfParts = (int) (Math.random() * 5) + 5;
			System.out.println(numberOfParts);
			
			for (int i = 1; i < numberOfParts; i++) {
				int direction = (180 / numberOfParts) * i + 90;
				int newendx = ((int) (Math.sin(Math.toRadians(direction)) * ((startx - endx) * 1 / depth))) + endx;
				int newendy = ((int) (Math.cos(Math.toRadians(direction)) * ((starty - endy) * 1 / depth))) + endy;
				base.addChild(generateTree(endx, endy, newendx, newendy, depth - 1));
			}
			return base;
		}
		else{
			return new Leaf(startx,starty,endx,endy);
		}

	}

}
