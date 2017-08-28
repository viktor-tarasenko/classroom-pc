package com.hillel.javael.tarasenko.testproject.readers;

import java.util.Scanner;

/**
 * Created by hillel on 17.08.17.
 */
public class ConsoleReader implements Reader{
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    String s = br.readLine();
    @Override
    public String read(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
}
