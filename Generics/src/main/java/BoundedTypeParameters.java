import java.util.Enumeration;

/**
 * Created by vivek on 2/22/2015.
 */
public class BoundedTypeParameters<T> {
    private T number;

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    //Here this mehtod will take only those parameters which extends Number class
    public <U extends Number> void inspect(U typeToInspect) {
        System.out.println("This class :" + getClass());
        System.out.println("Type to inspect class :" + typeToInspect.getClass());
    }
}
