package me.schmidhalter.trees;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import me.schmidhalter.trees.model.ITreePart;

public class TreePanel extends JPanel {

	private static final long serialVersionUID = 5383305659656060688L;

	private ITreePart trunk;

	public TreePanel() {
		setDoubleBuffered(true);
		setFocusable(true);
		setBackground(Color.WHITE);
		setVisible(true);
		setSize(new Dimension(600,600));
		trunk = TreeBuilder.generateTree(0, 0, 300, 100,3);

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		trunk.draw(g);
	}

}
