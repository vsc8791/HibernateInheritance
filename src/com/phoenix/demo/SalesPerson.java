package com.phoenix.demo;

public class SalesPerson extends Employee
{
	private int incentives;

	public SalesPerson()
	{
		
	}
	public SalesPerson(int id,String name,int sal,int incentives)
	{
		super(id,name,sal);
		this.incentives=incentives;
	}
	public void setIncentives(int incentives)
	{
		this.incentives=incentives;
	}
	public int getIncentives()
	{
		return incentives;
	}
	public String toString()
	{
		return super.toString()+"\t"+incentives;
	}
}
