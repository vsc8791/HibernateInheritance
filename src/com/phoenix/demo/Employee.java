package com.phoenix.demo;
public class Employee
{
	protected int id,sal;
	protected String name;

	public Employee()
	{
	}
	public Employee(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSal(int sal)
	{
		this.sal=sal;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getSal()
	{
		return sal;
	}
	public String toString()
	{
		return id+"\t"+name+"\t"+sal;
	}
}
