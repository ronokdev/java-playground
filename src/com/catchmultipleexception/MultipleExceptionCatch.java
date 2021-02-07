package com.catchmultipleexception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MultipleExceptionCatch
{
    public static void main(String[] args){
        try {
            FileReader reader = new FileReader("file.txt");
            int value = reader.read();
            new SimpleDateFormat().parse("");
        } catch (IOException | ParseException e) {  //handling multiple exceptions
            e.printStackTrace();
        }
    }
}
