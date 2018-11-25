package ui;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel{
	private final DrawingApp m_drawingApp;
	
	public DrawingPanel(DrawingApp drawingApp)
	{
		super();
		m_drawingApp = drawingApp;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(256, 256));
	}
	
	@Override
	protected final void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		m_drawingApp.getModel().paintSegments(g);
	}
}
