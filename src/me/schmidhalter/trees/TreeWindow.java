package me.schmidhalter.trees;

import java.awt.Dimension;

import javax.swing.JFrame;

public class TreeWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7408247492763208214L;


	public TreeWindow(){
		super("Tree");
		setFocusable(true);
		setSize(new Dimension(600,600));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
