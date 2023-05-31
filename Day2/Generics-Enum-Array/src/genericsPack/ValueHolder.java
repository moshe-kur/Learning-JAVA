package genericsPack;
public class ValueHolder<T> {
    private T value;
    public T getValue(){
        return this.value;
    }
    public void setValue(T val){
        this.value=val;
    }
}
