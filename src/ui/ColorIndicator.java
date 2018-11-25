package ui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ColorIndicator extends JPanel{
	private final DrawingApp m_drawingApp;

	public ColorIndicator(DrawingApp drawingApp)
	{
		super();
		m_drawingApp = drawingApp;
	}

	@Override
	protected final void paintComponent(Graphics g)
	{
		int w = getWidth();
		int h= getHeight();

		g.setColor(m_drawingApp.getModel().getCurrentColor());
		g.fillRect(4, 4, w-8, h-8);

		g.setColor(Color.BLACK);
		g.drawRect(4, 4, w-8, h-8);
	}
}
