package com.yaba.FR_179_16_03;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Integer q = new Integer(4552352);
        Double d = new Double(345656.545);

        Locale loc = Locale.FRENCH;
        NumberFormat num = NumberFormat.getNumberInstance(loc);
        System.out.println("Locale : " + loc.toString());
        System.out.println(" valeur " + num.format(q));
        System.out.println();

        Locale loc2 = Locale.ITALY;
        NumberFormat num2 = NumberFormat.getNumberInstance(loc2);
        System.out.println("Locale : " + loc2.toString());
        System.out.println(" valeur " + num2.format(q));
        System.out.println();

        NumberFormat monnaie = NumberFormat.getCurrencyInstance(loc);
        System.out.println("Monnaie Locale : " + loc.toString());
        System.out.println(" valeur " + monnaie.format(q));
        System.out.println();

        Locale loc3 = Locale.ENGLISH;
        NumberFormat monnaie2 = NumberFormat.getCurrencyInstance(loc3);
        System.out.println("Monnaie Locale : " + loc3.toString());
        System.out.println(" valeur " + monnaie2.format(q));

        Date aujourdhui = new Date();
        DateFormat df=DateFormat.getDateInstance(DateFormat.DEFAULT, loc3);
        System.out.println(df.format(aujourdhui));

        MessageFormat format = new MessageFormat("");
        format.setLocale(loc);
        format.applyPattern("nous sommes le  {0, date, short}");
        String sortie = format.format(new Object[] {new Date()});
        System.out.println(sortie);
    }
}
