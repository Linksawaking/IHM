package ui;

import javax.swing.JMenuItem;

public class QuitMenuItem extends JMenuItem {

	private final DrawingApp m_drawingApp;
	
	public QuitMenuItem(DrawingApp drawingApp)
	{
		super("Quit");
		m_drawingApp = drawingApp;
	}
}
