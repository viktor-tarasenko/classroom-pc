package com.hillel.javael.tarasenko.testproject.readers;

/**
 * Created by hillel on 17.08.17.
 */
public class NotAWordException extends Throwable {
    @Override
    public String getMessage(){
        return "Not a word!";
    }
}
