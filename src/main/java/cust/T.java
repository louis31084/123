package cust;

public class T {
    public static void main(String[] args) {
        Cust customer = new Cust("0001", 800);
        System.out.println(customer.id + "\t" +
                customer.amount + "\t" + customer.getTotal());
        SL mary = new SL("Mary", 1000);
        System.out.println(mary.id + "\t" +
                mary.amount + "\t" + mary.getTotal());
    }

}
