package cust;

public class Cust {
    String id;
    int amount;
    public Cust(String id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getTotal() {
        return amount;
    }
}
