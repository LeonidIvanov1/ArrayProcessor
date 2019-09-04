package com.epam.java_basic;

import com.epam.java_basic.array_processor.ArrayProcessor;

/**
 * Application entry point
 */
public class Application {

    public final int maxVAL = 0;

    public static void main(String[] args) {
	int a = 123;
        try {
            throw new RuntimeException();
        } catch (RuntimeException ex) {
            ArrayProcessor processor = new ArrayProcessor();
            System.exit(0);
        }
        //demonstrate ArrayProcessor methods
    }

}
