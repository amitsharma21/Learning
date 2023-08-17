public class Duck {
    public IFlyBehaviour flyBehaviour;
    public IQuackBehaviour quackBehaviour;
    public Duck(IFlyBehaviour flyBehaviour, IQuackBehaviour quackBehaviour){
        this.flyBehaviour=flyBehaviour;
        this.quackBehaviour=quackBehaviour;
    }
}
