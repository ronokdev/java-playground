package javaexception.catchmultipleexception;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MultipleExceptionCatch
{
    public static void main(String[] args){
        try(
                FileReader reader = new FileReader("file.txt"); // we don't need to close the reader here as the FileReader implements AutoCloseable interface
        ) {
            int value = reader.read();
            new SimpleDateFormat().parse("");
        } catch (IOException | ParseException e) {  //handling multiple exceptions
            e.printStackTrace();
        }
    }
}
