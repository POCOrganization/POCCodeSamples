import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Preconditions.*;

/**
 * Created by vivek on 12/14/2014.
 */
public class PreconditionSamples {

    public static void main(String[] args) {
        Student student = new Student("Test", 5, "Chess");
        Student student1 = new Student("Test", 9, "Cricket");
        Student student2 = new Student("Test1", 7, null);

        try {
            checkArgument(args.length == 1, "length %s was expected but has %s", 1, args.length);
        } catch (IllegalArgumentException e) {
            System.out.println("Threw exception as length of args was zero here.");
            System.out.println(e.getMessage());
        }

        try {
            checkState(student1.isKid());
        } catch (IllegalStateException e) {
            System.out.println("Threw exception as 9 year is not kid");
        }

        //No exception here as isKid will return true.
        checkState(student.isKid());

        try {
            checkNotNull(student2.getHobby());
        } catch (NullPointerException e) {
            System.out.println("Threw exception as getHobby returns null.");
        }
        List<Integer> numbersList = new ArrayList();
        numbersList.add(5);
        numbersList.add(61);
        try {
            getElement(numbersList, 2);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("As passed index is greater than size,  precondition threw exception");
        }
        System.out.println(getElement(numbersList, 1));
    }

    private static int getElement(List<Integer> numbersList, Integer index) {
        checkElementIndex(index, numbersList.size());
        return numbersList.get(index);
    }

}
