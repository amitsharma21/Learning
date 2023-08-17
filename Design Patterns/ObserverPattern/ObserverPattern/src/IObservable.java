public interface IObservable {
    public void addObserver(IObserver obj);
    public void removeObserver(IObserver obj);
    public void notifyAllObserver();
}
