package Java.SingletonDesignPattern;

public class Animal {
    public static void main(String[] args) {
        SingleTon singleTon=SingleTon.getInstance();
        singleTon.show();
    }


}
