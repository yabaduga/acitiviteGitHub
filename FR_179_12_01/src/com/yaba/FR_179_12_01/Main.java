package com.yaba.FR_179_12_01;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws Exception {

        Path p = Paths.get("c:/formation/java/data.txt");
        BufferedReader n = Files.newBufferedReader(p);
        n.close();

    }
}
