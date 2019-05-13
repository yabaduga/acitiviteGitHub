package com.yaba.FR_179_12_02;

import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Path p = Paths.get("C:\\Users\\Yabaduga\\mon_projet");

        parcoursRep(p);
    }

    private static void parcoursRep(Path p) throws IOException {
        try (DirectoryStream <Path> ds = Files.newDirectoryStream(p)) {
            for (Path c : ds) {
                if (Files.isDirectory(c)) {
                    parcoursRep(c);
                } else if (Files.isReadable(c)) {

                        System.out.print("r");
                        if (Files.isWritable(c)) {
                            System.out.print("w");
                            if (Files.isExecutable(c)) {
                                System.out.print("x");
                            }
                            System.out.println("-> " + c.getFileName() );
                        }
                        System.out.println(" Dir : " + c );
                    }
                }
            }
        }
    }


