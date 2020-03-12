package Java.StrategyDesignPattern;

public class Cat extends Animal {
    Cat() {
        super();
        setSound("meow");
        flys=new ItsFly();
    }
}
