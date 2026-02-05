package org.example;

import java.util.ArrayList;

public class Factorizer {

    public ArrayList<Integer> primeFactors(Integer n) {

        ArrayList<Integer> factors = new ArrayList<>();

        // Handle 2 separately (only even prime)
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }

        // Check odd numbers starting from 3
        for (int i = 3; i <= Math.sqrt(n); i += 2) {

            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        // If n is still > 2, it is prime
        if (n > 2) {
            factors.add(n);
        }

        return factors;
    }
}
