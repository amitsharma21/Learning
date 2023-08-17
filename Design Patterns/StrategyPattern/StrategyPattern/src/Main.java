public class Main {
    public static void main(String[] args) {
        //deciding the quack and fly behaviour of each duck at run time.
        Duck CityDuck = new CityDuck(new FlyBehaviour1(),new QuackBehaviour1());
        Duck WildDuck = new WildDuck(new FlyBehaviour2(), new QuackBehaviour2());
        CityDuck.flyBehaviour.fly();
        CityDuck.quackBehaviour.quack();
        WildDuck.flyBehaviour.fly();
        WildDuck.quackBehaviour.quack();
    }
}