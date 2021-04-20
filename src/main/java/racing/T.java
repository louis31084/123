package racing;

public class T {
    public static void main(String[] args) {
        H h1=new H();
        H h2=new H();
        HR h3= new HR();
        Thread thread= new Thread(h3);
        thread.start();
        h1.start();
        h2.start();


    }
}
