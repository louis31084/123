package cust;

public class SL extends Cust{
    float discount = 0.1f;

    public SL(String id, int amount) {
        super(id, amount);
    }
    @Override
    public int getTotal() {
        return amount - (int)(amount * discount);
    }

}
