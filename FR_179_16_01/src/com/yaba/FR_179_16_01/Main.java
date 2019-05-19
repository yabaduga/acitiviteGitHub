package com.yaba.FR_179_16_01;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale loc1 = new Locale.Builder().setLanguage("fr").setRegion("FR").build();
        Locale loc2 = new Locale("fr", "CA");
     //   Locale loc3 = new Locale.forLanguageTag("fr-FR");
      //  Locale loc4 = new Locale.FRANCE;

      //  System.out.println(DateFormat.getDateInstance().format(new Date()));
        System.out.println(DateFormat.getDateInstance(0,Locale.ENGLISH).format(new Date()));


    }
}
