package filedemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * How to append data to a file in Java using FileReader.
 *
 * @author java67
 */

public class FileAppendDemo{

    public static void main(String args[]) throws IOException {

        // We have a file names.txt which already contain
        // two names, now we need to append couple of
        // more names onto it.
        // here is how it looks like now
        // names.txt
        // James
        // Hobert

        // In order to append text to a file, you need to open
        // file into append mode, you do it by using
        // FileReader and passing append = true
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter("e:\\names.txt", true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);

            pw.println("Shane");
            pw.println("Root");
            pw.println("Ben");

            System.out.println("Data Successfully appended into file");
            pw.flush();

        } finally {
            try {
                pw.close();
                bw.close();
                fw.close();
            } catch (IOException io) {// can't do anything }
            }

        }

        // in Java 7 you can do it easily using try-with-resource
        // statement as shown below

        try (FileWriter f = new FileWriter("names.txt", true);
             BufferedWriter b = new BufferedWriter(f);
             PrintWriter p = new PrintWriter(b);) {

            p.println("appending text into file");
            p.println("Gaura");
            p.println("Bori");

        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}


