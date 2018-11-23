package ui;

import javax.swing.JButton;

public class EraseSegment extends JButton{
	private final DrawingApp m_drawingApp;
	
	public EraseSegment(DrawingApp drawingApp)
	{
		super("Erase segment");
		m_drawingApp = drawingApp;
	}
}
