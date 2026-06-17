import java.util.Scanner;

public class Test_Car {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.carDetails();
        
        car1.assignDetails("fin", 1122, "siv", 129000);
        car1.display();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Car details");
        
        System.out.println("enter carname");
        String cn = sc.next();
        
        System.out.println("enter RegNo");
        int rn = sc.nextInt();
        
        System.out.println("enter Car Type");
        String ct = sc.next();
        
        System.out.println("enter car price ");
        int pr = sc.nextInt();
        
        car1.assignDetails(cn, rn, ct, pr);
        car1.display();
        
        System.out.println("---end---");
        sc.close();
    }
}
