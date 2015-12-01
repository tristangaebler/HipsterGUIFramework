package view.hipster;


import controller.hipster.*;
import java.awt.Color;
import javax.swing.*;

public class HipsterFrame extends JFrame
{

	private HipsterContoller baseController;
	private HipsterPanel basePanel;
	
	public HipsterFrame(HipsterContoller baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		setUpFrame();
	}
	/**
	 * Helper method to prepare the frame
	 */
	public String getResponse(String prompt)
	{
		String response = JOptionPane.showInputDialog(this, prompt);
		return response;
	}
	
	private void setUpFrame()
	{
		this.setContentPane(basePanel); //Must be the first line of the method
		this.setSize(500,500); //Window size
		this.setBackground(Color.RED);
		this.setTitle("Window titles are so mainstream");
		this.setResizable(false);
		this.setVisible(true); //Must be last line of the method
	}
	
	//Getters and setters for baseController
	public HipsterContoller getBaseController()
	{
		return baseController;
	}
	public void setBaseController(HipsterContoller baseController)
	{
		this.baseController = baseController;
	}
	

}
