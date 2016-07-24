package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 * SessionFactory������
 * @author lintz
 */
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
