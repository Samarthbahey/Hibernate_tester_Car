package com.tester;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.pojo.Car;
import com.util.Car_Util;

public class Test_Util_Car {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Session session = Car_Util.getSessionFactory().openSession();

		// Begin Transaction
		Transaction trans = session.beginTransaction();

		// Take Input
		System.out.println("Enter carno:");
		int carno = sc.nextInt();

		System.out.println("Enter car name:");
		String car_name = sc.next();

		System.out.println("Enter body type:");
		String bodytype = sc.next();

		System.out.println("Enter car color:");
		String color = sc.next();
	        
		System.out.println("Enter car price:");
		double price = sc.nextDouble();
	        
		System.out.println("Enter car model:");
		String model = sc.next();

		// Create Object
		Car cr = new Car(carno, car_name, bodytype, color, price, model);

		// Save
		session.save(cr);

		// Commit
		trans.commit();

		// Close
		session.close();
		sc.close();

		System.out.println("Data inserted successfully!");
	}
}
