package Java.StrategyDesignPattern;

public class CantFly implements Flys {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
