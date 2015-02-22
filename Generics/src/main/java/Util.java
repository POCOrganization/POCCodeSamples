/**
 * Created by vivek on 2/22/2015.
 */
public class Util {

    public static <K, V> boolean compare(KeyValuePair<K, V> pair1, KeyValuePair<K, V> pair2) {
        return pair1.getKey().equals(pair2.getKey()) && pair2.getValue().equals(pair2.getValue());
    }

}
