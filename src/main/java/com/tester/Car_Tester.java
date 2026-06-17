package com.tester;

//1. Imports
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Car;

//2. Class
public class Car_Tester {

 public static void main(String[] args) {

     // 3. Load configuration
     Configuration config = new Configuration().configure();
     System.out.println("Config file loaded successfully");

     // 4. Create SessionFactory
     SessionFactory sf = config.buildSessionFactory();
     System.out.println("SessionFactory created");

     // 5. Open Session
     Session session = sf.openSession();

     // 6. Begin Transaction
     Transaction trans = session.beginTransaction();

     // 7. Create Object
     Car cr = new Car(1,"Torno", "suv", "blue",200000,"Top");

     // 8. Save Object
     session.save(cr);

     // 9. Commit Transaction
     trans.commit();

     // 10. Close Session
     session.close();

     System.out.println("Data inserted successfully!");
 }
}