package com.util;
/**
 * SessionFactory工具类
 * @author lintz
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BasicHibernateDao 
{
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

}
