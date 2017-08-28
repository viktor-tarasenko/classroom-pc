package com.hillel.javael.tarasenko.testproject.Scanners;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

public class RecursiveScanner implements Serializable{
    FileScanner scanner;

    public RecursiveScanner(File directory, String word) throws IOException {
        if (directory.isDirectory()){
            for (File file : directory.listFiles()) {
                new RecursiveScanner(file, word);
            }
        }
         else {
            scanner.scan(word);
        }
    }
}
