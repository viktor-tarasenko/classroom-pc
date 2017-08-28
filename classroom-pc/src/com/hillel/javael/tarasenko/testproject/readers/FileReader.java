package com.hillel.javael.tarasenko.testproject.readers;

import java.io.*;


/**
 * Created by hillel on 17.08.17.
 */
public class FileReader implements Reader{
    @Override
    public String read() {
        String s = null;
        try {
            BufferedReader br = new BufferedReader(new java.io.FileReader("/home/hillel/IdeaProjects/JavaElementary/src/com/hillel/javael/tarasenko/123"));
            s = br.readLine();
        } catch (Exception e) {
            NotAWordException asd = new NotAWordException();
            asd.getMessage();
        }
        return s;
    }
}
