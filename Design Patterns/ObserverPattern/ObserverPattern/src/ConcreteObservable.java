import java.util.List;

public class ConcreteObservable implements IObservable{
    public List<IObserver> l;
    public int data;
    @Override
    public void addObserver(IObserver obj) {
        l.add(obj);
    }

    @Override
    public void removeObserver(IObserver obj) {
        //delete logic goes here
    }

    @Override
    public void notifyAllObserver() {
        for(int i=0;i<l.size();i++){
            IObserver obj=l.get(i);
            obj.update();
        }
    }

    public int getData(){
         return this.data;
    }
}
