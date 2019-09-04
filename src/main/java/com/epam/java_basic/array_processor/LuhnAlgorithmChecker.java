package com.epam.java_basic.array_processor;

/**
 * This class is made for implementation of Luhn algorithm
 *
 * @author Nikita Tsiporkov
 * @version 1.0
 */
public class LuhnAlgorithmChecker {
    /**
     * This method check the input card number using Luhn algorithm
     *
     * @param cardNumber - number of card to check
     * @return boolean value of the check operation
     */
    private final int MAX_NUMERAL = 9;

    public boolean check(int[] cardNumber) {
        int[] cardNumberClone = cardNumber.clone();
        int sum = 0;
        boolean isEven = false;
        for (int i = cardNumberClone.length - 1; i >= 0; i--) {
            if (isEven) {
                cardNumberClone[i] *= 2;
                if (cardNumberClone[i] > MAX_NUMERAL) {
                    cardNumberClone[i] -= MAX_NUMERAL;
                }
            }
            sum += cardNumberClone[i];
            isEven = !isEven;
        }
        return (sum % 10 == 0);
    }

    public boolean checkDuplicate(int[] cardNumber) {
        int[] cardNumberClone = cardNumber.clone();
        int sum = 0;
        boolean isEven = false;
        for (int i = cardNumberClone.length - 1; i >= 0; i--) {
            if (isEven) {
                cardNumberClone[i] *= 2;
                if (cardNumberClone[i] > MAX_NUMERAL) {
                    cardNumberClone[i] -= MAX_NUMERAL;
                }
            }
            sum += cardNumberClone[i];
            isEven = !isEven;
        }
        return (sum % 10 == 0);
    }

    public boolean checkDoubleDuplicate(int[] cardNumber) {
        int[] cardNumberClone = cardNumber.clone();
        int sum = 0;
        boolean isEven = false;
        for (int i = cardNumberClone.length - 1; i >= 0; i--) {
            if (isEven) {
                cardNumberClone[i] *= 2;
                if (cardNumberClone[i] > MAX_NUMERAL) {
                    cardNumberClone[i] -= MAX_NUMERAL;
                }
            }
            sum += cardNumberClone[i];
            isEven = !isEven;
        }
        return (sum % 10 == 0);
    }
}