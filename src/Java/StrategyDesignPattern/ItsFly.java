package Java.StrategyDesignPattern;

public class ItsFly implements Flys {

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
