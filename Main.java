package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

       String znakovi [] = {"Heart","Cherry","Coin","Melon","Jocker"};

        Random random = new Random();


        for (int i = 1; i<6;i++){
            int index = random.nextInt(5);
            System.out.print(znakovi[index]+" ");

        }


    }
}
