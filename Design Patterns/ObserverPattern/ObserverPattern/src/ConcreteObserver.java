public class ConcreteObserver implements IObserver{
    //has a relationship of concreteObservable
    public ConcreteObservable concreteObservable;
    ConcreteObserver(ConcreteObservable concreteObservable){
        this.concreteObservable=concreteObservable;
    }

    @Override
    public void update() {
//        accessing data of concreteObservable througn the compostion concreteObservable obj
        System.out.println(concreteObservable.getData());
    }
}
