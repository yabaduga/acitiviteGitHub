package com.yaba.FR_179_12_03;

import java.nio.file.*;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

Path p = Paths.get("c:/formation/java/data.txt");
List <String> lignes=Files.readAllLines(p);
for (String s : lignes) {
    System.out.println(" > "+ s);
}
    }
}
