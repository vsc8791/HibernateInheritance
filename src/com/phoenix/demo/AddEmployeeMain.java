package com.phoenix.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
class AddEmployeeMain 
{
	public static void main(String[] args) 
	{
		Session session;
		SessionFactory factory;
		try
		{
			factory = new Configuration().configure().buildSessionFactory();
			session=factory.openSession();
			Transaction tr=session.beginTransaction();
			
			Employee e1=new Employee(101,"saket",25000);
			Employee e2=new SalesPerson(102,"Abhijit",25000,4000);
			session.save(e1);
			session.save(e2);
			
			tr.commit();
			System.out.println("Records Added");

		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		
	}
}
