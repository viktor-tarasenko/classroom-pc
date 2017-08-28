package com.hillel.javael.tarasenko.testproject;

import com.hillel.javael.tarasenko.testproject.Scanners.RecursiveScanner;

import java.io.File;
import java.io.IOException;

public class MainClass {
    public static void main(String[] args) throws IOException{
        File file = new File("/home/hillel/IdeaProjects/JavaElementary/src/com/hillel/javael/tarasenko/");
        RecursiveScanner scan = new RecursiveScanner(file, "Hello");
        System.out.println(scan);
    }
}
