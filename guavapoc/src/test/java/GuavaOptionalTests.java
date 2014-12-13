import com.google.common.base.Optional;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vivek on 12/13/2014.
 */
public class GuavaOptionalTests {

    @Test
    public void trueIfNumberIsPresent() throws Exception {
        Optional<Integer> testOptionalNumber=Optional.of(5);
        assertTrue(testOptionalNumber.isPresent());
        assertEquals(5,(int) testOptionalNumber.get());
    }

    @Test
    public void isPresentReturnsFalseifGivenNullReference() throws Exception {
        Optional<Integer>testOptionalNumber=Optional.fromNullable(null);
        assertFalse(testOptionalNumber.isPresent());
    }

    @Test
    public void testName() throws Exception {
        Optional<Integer> integerOptional=Optional.absent();
        assertFalse(integerOptional.isPresent());
        assertNull(integerOptional.orNull());

    }
}
