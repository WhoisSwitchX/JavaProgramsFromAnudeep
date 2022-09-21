package com.maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.maven.entity.Employee;

public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
    	
    SessionFactory sf = new Configuration().configure().buildSessionFactory();
    Session s = sf.openSession();
    Employee e = new Employee();
    e.setEname("Saurabh S. Mathe");
    e.setEadd("Ghatkopar");
    e.setEphone(296849651);
    e.setEsalary(10000);
    s.save(e);
    Transaction t = s.beginTransaction(); t.commit();
    System.out.println(" All Done ");
    
    	sf.close(); s.close();
    }
}
