package com.nskhoa.designpattern;


import java.io.File;
import java.nio.file.Path;

public class Script {
    static final int DIRECTORY_NUMBER = 20;
    static Path path;

    public static void main(String[] args) {
        path = Path.of("D:\\OTHERS\\DSA-leetcode\\DesignPattern\\java\\src\\main\\java\\com\\nskhoa\\designpattern\\STRUCTURAL\\facade");
        System.out.println("fucking path: " + path.toUri());

        for (int i = 1; i <= DIRECTORY_NUMBER; i++) {
            File dir = new File(path + "\\example" + i);
            if (!dir.exists()) {
                boolean mkdirs = dir.mkdirs();
                System.out.println("Example " + i + " directory created: " + mkdirs);

            } else {
                System.out.println("Example " + i + " does exist.");
            }
        }
    }
}
