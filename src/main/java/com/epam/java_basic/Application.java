package com.epam.java_basic;

import com.epam.java_basic.array_processor.ArrayProcessor;

import java.util.Scanner;

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
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        System.out.printf("Your number: %d \n", num);

    }

}
