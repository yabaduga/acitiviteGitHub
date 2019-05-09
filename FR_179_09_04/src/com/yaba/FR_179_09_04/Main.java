package com.yaba.FR_179_09_04;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        StringBuilder sbt = new StringBuilder();
        Formatter ft = new Formatter(sbt, Locale.FRANCE);

        ft.format("%1$+d %2$x", 45, 44);

        String str = sbt.toString();
        System.out.println("la chaine " + str);

        String str2=String.format("%1$+d %2$x", 45, 44);
        System.out.println("la chaine via string.format " + str2);

        System.out.printf("la chaine via princtf " + str);

        Date dd=new Date();

        DateFormat df = new SimpleDateFormat("yy/MM/dd -- HH:mm:ss -- Z");
                System.out.println("Date "+df.format(dd));

                DateFormat df2=DateFormat.getDateInstance();
                System.out.println("Date "+df2.format(dd));

                DateFormat df3=DateFormat.getTimeInstance();
                System.out.println("Heure "+df3.format(dd));

    }
}