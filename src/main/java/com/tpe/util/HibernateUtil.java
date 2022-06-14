package com.tpe.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory=createSessionFactory();


    private static SessionFactory createSessionFactory() {
        System.out.println("create Session Factory");
        try {
            SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
            return sf;
        }catch(Throwable ex) {
            System.err.println("Session Factory could not be created:"+ex);

			/*
			The ExceptionInInitializerError indicates that an unexpected
			exception has occurred in a static initializer. Basically,
			when we see this exception, we should know that
			Java failed to evaluate a static initializer block or to instantiate a static variable.
			*/
            throw new ExceptionInInitializerError(ex.getMessage());
        }
    }


    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
