package ui;

import javax.swing.*;

import model.DrawingAppModel;

public class DrawingApp extends JFrame{

	private final DrawingMenuBar m_drawingMenuBar;
	private final WindowPanel m_windowPanel;

	private DrawingAppModel m_drawingAppModel = new DrawingAppModel();

	public DrawingApp()
	{
		super("Drawing application");

		m_drawingMenuBar = new DrawingMenuBar(this);
		setJMenuBar(m_drawingMenuBar);

		m_windowPanel = new WindowPanel(this);
		setContentPane(m_windowPanel);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pack();
		setVisible(true);
	}

	public final DrawingAppModel getModel()
	{
		return m_drawingAppModel;
	}

	public final void setModel(DrawingAppModel drawingAppModel)
	{
		m_drawingAppModel = drawingAppModel;
	}

}
