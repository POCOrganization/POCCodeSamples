/**
 * Created by vivek on 2/22/2015.
 */
public class GenericBox<T> {
    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    private T object;

}
