package com.yaba.FR_179_12_00;

import java.io.File;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {

        Path p = Paths.get("c:/formation/java/data.txt");
        System.out.println("toString : " + p);
        System.out.println("getFilename : " + p.getFileName());

        System.out.println("getRoot : " + p.getRoot());

        System.out.println("getParent : " + p.getParent());
        File f = p.toFile();
        System.out.println(f.exists());

        System.out.println("URI : "+p.toUri());
    }
}