package com.epam.java_basic;

import com.epam.java_basic.array_processor.ArrayProcessor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Formatter;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Application entry point
 */
public class Application {

    public final int maxVAL = 0;
    private volatile int gunsShootingCounter = 0;

    public static void main(String[] args) {
        Application application = new Application();
        application.incrementVolatile();
        int a = 123;
        try {
            throw new RuntimeException();
        } catch (RuntimeException ex) {
            ArrayProcessor processor = new ArrayProcessor();
            System.exit(0);
        }
        //demonstrate ArrayProcessor methods
    }

    private void incrementVolatile() {
        gunsShootingCounter++;
        try {
            FileInputStream fileIn = new FileInputStream("file.txt");
            FileOutputStream fileOut = new FileOutputStream("copied_file.txt");
            int a;
            while ((a = fileIn.read()) != -1) {
            }
        } catch (Exception ex) {

        }

    }

}
