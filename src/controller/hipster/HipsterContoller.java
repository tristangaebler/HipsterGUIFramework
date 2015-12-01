package controller.hipster;

import view.hipster.HipsterFrame;
import model.hipster.Hipster;

public class HipsterContoller
{
	private HipsterFrame baseFrame;
	private Hipster firstHipster;
	
	public HipsterContoller()
	{
		firstHipster = new Hipster();
		baseFrame = new HipsterFrame(this);
	}
	
	public void start()
	{
		String myName = baseFrame.getResponse("What is your name?");
		firstHipster.setName(myName);
		baseFrame.setTitle(myName + " 's Hipster Project");
	}
	
	public Hipster getFirstHipster()
	{
		return firstHipster;
	}
	
	public HipsterFrame getBaseFrame()
	{
		return baseFrame;
	}
}
