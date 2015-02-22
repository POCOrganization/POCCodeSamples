
public class GenericsSample {
    public static void main(String[] args) {
        //Simple class to hold any type of object but loosely typed.
        SimpleBox box = new SimpleBox();
        box.setObject(10);
        System.out.println(box.getObject());

        //Generic class to hold any type of object but strongly typed.
        GenericBox<Integer> genericBox = new GenericBox<>();
        genericBox.setObject(5);
        System.out.println(genericBox.getObject());

        //Class with multiple generic type parameters
        KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<>();
        keyValuePair.setKey("Test");
        keyValuePair.setValue(10);
        System.out.println("Key: " + keyValuePair.getKey() + " Value: " + keyValuePair.getValue());

        KeyValuePair<String, Integer> secondKeyValuePair = new KeyValuePair<>();
        keyValuePair.setKey("Test");
        keyValuePair.setValue(15);

        //Generic method to take two objects whose types are
        System.out.println("Comparison result of same objects :" + Util.compare(keyValuePair, keyValuePair));
        System.out.println("Comparison result of object with different value :" + Util.compare(keyValuePair, secondKeyValuePair));

        KeyValuePair<Integer,String> otherKeyValuePair=new KeyValuePair<>(5,"Test");
        System.out.println("Other comparison :"+Util.compare(otherKeyValuePair,otherKeyValuePair));

        BoundedTypeParameters<String> boundedTypeParameters=new BoundedTypeParameters<>();
        boundedTypeParameters.inspect(5);

        //boundedTypeParameters.inspect("%"); Complie time error as String does not extends Number class

//        SpecificTypeGeneric<String> specificTypeGeneric=new SpecificTypeGeneric<>(9,78);



    }
}
