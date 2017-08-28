package com.hillel.javael.tarasenko.testproject.Scanners;

import java.io.*;

/**
 * Created by hillel on 17.08.17.
 */
public class FileScanner {
    File file;

    public int scan(String word) throws IOException {
        int result = 0;
        if (file.isDirectory()){
            for (File f : file.listFiles()) {
                if (f.isDirectory()){
                    continue;
                }
                BufferedReader br = new BufferedReader(new FileReader(f));
                String s;
                    while ((s = br.readLine()) != null) {
                        if (s.contains(word)) {
                            result++;
                        }
                    }
            }
        }
        return result;
    }

    public FileScanner(File file){
        this.file = file;
    }
}
