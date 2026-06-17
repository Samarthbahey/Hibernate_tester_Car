package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// 2. Utility Class
public class Car_Util {

    // 3. Static SessionFactory (created once)
    private static SessionFactory sessionFactory;

    // 4. Static block (executes once)
    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            System.out.println("SessionFactory created successfully");
        } catch (Throwable ex) {
            System.err.println("SessionFactory creation failed: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    // 5. Public method to access SessionFactory
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}