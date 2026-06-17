public class Car {
    private String carname;
    private int RegNo;
    private String CarType;
    private int Price;
    
    public void assignDetails(String cn, int rn, String ct, int pr) {
        carname = cn;
        RegNo = rn;
        CarType = ct;
        Price = pr;
    }
    
    public void carDetails(){
        System.out.println("Car Details");
    }
    
    public void display() {
        System.out.println("====car details====");
        System.out.println(carname);
        System.out.println(RegNo);
        System.out.println(CarType);
        System.out.println(Price);
    }
}
