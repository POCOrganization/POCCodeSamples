package com.company;

import java.io.File;
import java.io.FileFilter;

public class Main {

    public static void main(String[] args) {
        // write your code here
        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.exists();
            }
        });

        File[] hiddenFiles1=new File(".").listFiles(File::exists);

    }
}
