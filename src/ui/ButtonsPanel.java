package ui;

import java.awt.GridLayout;

import javax.swing.*;

public class ButtonsPanel extends JPanel{
	private final ColorIndicator m_colorIndicator;
	private final ColorChooser m_colorChooser;
	private final EraseSegment m_eraseSegment;
	
	public ButtonsPanel(DrawingApp drawingApp)
	{
		super();
		
		setLayout(new GridLayout(1, 3));
		add(m_colorIndicator = new ColorIndicator(drawingApp));
		add(m_colorChooser = new ColorChooser(drawingApp));
		add(m_eraseSegment = new EraseSegment(drawingApp));
	}
}
