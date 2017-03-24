package abst.controller;

import abst.model.*;
public class AbstController 
{
	private BombBay feline;
	
	public void start()
	{
		if(feline instanceof Cat)
		{
			System.out.println("BombBay is a type of cat");
		}
		else
		{
			System.out.println("BombBay isn't a cat");
		}
	}
	public AbstController() 
	{
		feline = new BombBay();
	}
	
}
