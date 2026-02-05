package org.example;

public class App {
    public static void main(String[] args) {

        Factorizer f = new Factorizer();

        System.out.println(f.primeFactors(36));
        System.out.println(f.primeFactors(17));
        System.out.println(f.primeFactors(100));
    }
}
