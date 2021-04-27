package box;

public class B1 extends B {
    public B1() {
        length = 10;
        width = 10;
        height = 10;
    }
    @Override
    public String getName() {
        return "BOX 1";
    }

    @Override
    public int getPrice() {
        return 60;
    }
}
