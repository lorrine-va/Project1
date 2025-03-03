package com.example;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        int low = 1;
        int high = 100;
        Random random = new Random();
        int randNum = random.nextInt((high - low) + 1) + low;
        System.out.println("Random number: " + randNum);
    }
}