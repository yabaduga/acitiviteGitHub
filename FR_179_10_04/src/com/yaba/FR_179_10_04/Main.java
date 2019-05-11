package com.yaba.FR_179_10_04;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class AutreClass implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("libération des ressources");
    }
}

public class Main {

    public static void main(String[] args) {

        try (
        AutreClass cc=new AutreClass()) {
            System.out.println("Code nominal");



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
