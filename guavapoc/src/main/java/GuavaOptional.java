import com.google.common.base.Optional;

import static com.google.common.base.MoreObjects.firstNonNull;
import static com.google.common.base.Strings.*;

/**
 * Created by vivek on 12/13/2014.
 */
public class GuavaOptional {

    public static void main(String[] args) {
        Optional<Integer> integerOptional = Optional.of(10);

        //Reads value from the optional instance
        System.out.println(integerOptional.get());

        //Checks if the value is present in the instance or not
        System.out.println(integerOptional.isPresent());

        try {
            Optional.of(null);
        } catch (NullPointerException e) {
            System.out.println("Null can not be passed into of, fail fast example.");
        }

        integerOptional = Optional.absent();
        //Returns false on absent values.
        System.out.println("On absent objects isPresent returns " + integerOptional.isPresent());
        try {
            System.out.println(integerOptional.get());
        } catch (IllegalStateException e) {
            System.out.println("Get can not be called on absent values.");
        }

        integerOptional = Optional.fromNullable(null);
        System.out.println("As null passed isPresent returns " + integerOptional.isPresent());

        try {
            System.out.println("As null passed get returns " + integerOptional.get());
        } catch (IllegalStateException e) {
            System.out.println("Throws illegal state exception if get called on absent type");
            System.out.println(integerOptional.getClass());
        }

        //Here as the value was not present it will use 10 as default value for the object.
        System.out.println("Returns default value in case of value is not present in this case it will return " + integerOptional.or(10));
        //Here it will return null as the value was not present.
        System.out.println("Returns " + integerOptional.orNull());

        integerOptional = Optional.fromNullable(5);
        System.out.println("When from nullable has value isPresent returns " + integerOptional.isPresent());

        //Here as the value is present it will ignore the passed value of or and use the value being passed while creation of the object.
        System.out.println("Here as the value is present it will return " + integerOptional.or(10));

        //Here it will return the value as its present.
        System.out.println(integerOptional.orNull());

        //Returns default value if value is null;
        System.out.println(firstNonNull(null, 50));

        String testStringValue = null;
        //This line will print false  as nullToEmpty method will convert null string to empty string.
        System.out.println(null == nullToEmpty(testStringValue));

        testStringValue = "";
        //This line will print true as emptyToNull method will convert the empty string to null
        System.out.println("isNullOrEmpty output. " + isNullOrEmpty(testStringValue)); //Prints true.
        System.out.println(null == emptyToNull(testStringValue));
    }
}
