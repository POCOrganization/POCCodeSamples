/**
 * Created by vivek on 2/22/2015.
 */
public class SpecificTypeGeneric<T extends Integer> {
    private T firstNumber;
    private T secondNumber;

    public SpecificTypeGeneric(T firstNumber, T secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int add() {
        return secondNumber.intValue() + firstNumber.intValue();
    }
}
