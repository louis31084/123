package boxbox;

public class T {
    public static void main(String[] args) {
        box0[] boxes = {new Box1(),new Box2(),new Box3(),
        new Box3(),new Box4(),new Box5()};
        int len = 20;
        int wid = 5;
        int hei = 5;
        for(box0 box:boxes){
            if (box.validate(len, wid, hei)){
                System.out.println(box.name + " it is!, " + box.price);
                break;

            }
        }

    }
}
