package com.yaba.FR_179_12_04;


import java.nio.file.*;
import static java.nio.file.StandardWatchEventKinds.*;

public class Main {

    public static void main(String[] args) throws Exception {

        WatchService watcher = FileSystems.getDefault().newWatchService();
        Path p = Paths.get("c:/formation/java");
        p.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);

        while (true) {
            WatchKey key = watcher.take();
            System.out.println("l'évènement est observé ! ");
            for (WatchEvent<?> evt : key.pollEvents()){
                WatchEvent.Kind<?> kd = evt.kind();
                Path fichier =(Path) evt.context();
                System.out.println("Le fichier  " + fichier + " a subit "+kd);
            }

        }
    }
}
