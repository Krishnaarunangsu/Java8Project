/**
 * 
 */
package com.krishna.java8.advanced.tutorial;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author arunangsu.sahu
 *
 */
public interface MyInterface {
	void printIt(String text);

    /**
     * @param text
     * @param outputStream
     */
    default public void printUtf8To(String text, OutputStream outputStream){
        try {
            outputStream.write(text.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException("Error writing String as UTF-8 to OutputStream", e);
        }
    }

    /**
     * @param text
     */
    static void printItToSystemOut(String text){
        System.out.println(text);
    }
}
