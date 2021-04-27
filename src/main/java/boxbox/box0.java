package boxbox;

public  class  box0 {
    String name;
    int len;
    int wid;
    int hei;
    int price;

    public boolean validate(int a, int b ,int c){
        if(len>=1 && wid >= b && hei>= c){
            return true;
        }
        else return false;


    }

}
