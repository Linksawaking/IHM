package ui;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public final class WindowPanel extends JPanel{
	private final DrawingPanel m_drawingPanel;
	private final ButtonsPanel m_buttonsPanel;
	
	public WindowPanel(DrawingApp drawingApp)
	{
		super();
		setLayout(new BorderLayout());
		add(m_drawingPanel = new DrawingPanel(drawingApp), BorderLayout.CENTER);
		add(m_buttonsPanel = new ButtonsPanel(drawingApp), BorderLayout.SOUTH);
		
	}

}
