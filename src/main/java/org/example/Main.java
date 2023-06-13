package org.example;

public class Main {
    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {
            boolean asal = true;

            if (number > 1) {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        asal = false;
                        break;
                    }
                }

                if (asal) {
                    System.out.println(number);

                }

            }
        }
    }
}