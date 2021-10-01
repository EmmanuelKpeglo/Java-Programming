package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random ran= new Random();

        int randomNumber = ran.nextInt(100);

        if (randomNumber % 2 == 0) {

            System.out.println(randomNumber+ " is an even number");

        }
        else {

            System.out.println(randomNumber+ " is an odd number");

        }

    }
}