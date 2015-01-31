package com.company;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.exists();
            }
        });

        File[] hiddenFiles1 = new File(".").listFiles(File::exists);


        //Iterate items of array.
        System.out.println("Simple lambda expression.");
        Arrays.asList("a", "b", "c", "d").forEach(e -> System.out.println(e));

        //Item as type parameter.
        System.out.println("Lambda with type:.");
        Arrays.asList("a", "b", "c", "d").forEach((String e) -> System.out.println(e));

        //Lambda with complex body.
        System.out.println("Lambda with complex code.");
        Arrays.asList("a", "b", "c", "d").forEach(e -> {
            System.out.println(e);
            System.out.println(e);
        });

        //Lambda with class member access
        System.out.println("Lambda accessing class variable");
        String separator = ",";
        Arrays.asList("a", "b", "c", "d").forEach(e -> System.out.println(e + separator));

        //Lambda with return statement
        Arrays.asList("a", "x", "b", "e").sort((a, b) -> a.compareTo(b));

        //Sorting with lambda body
        Arrays.asList("a", "x", "b", "e").sort((a, b) -> {
            int result = a.compareTo(b);
            return result;
        });
    }
}
