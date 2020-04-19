package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int [][] planOfHouse = new int[][] {
                {1,1,1,1,1,1,1,1,1,1},
                {1,0,1,1,0,0,1,0,0,1},
                {1,0,1,0,0,0,1,1,0,1},
                {1,1,1,0,0,0,1,0,0,1},
                {1,1,1,1,1,1,1,1,1,1}
        };
        int result = counterOfRooms(planOfHouse);
        System.out.println(result);
    }

    public static int counterOfRooms(int [][] planOfHouse) {
        int counter = 0;
        for (int i = 1; i < planOfHouse.length; i++) {
            for (int j = 1; j < planOfHouse[i].length; j++) {
                if (planOfHouse[i][j] == 0 && planOfHouse[i-1][j] != 0 && planOfHouse[i][j-1] != 0)
                    counter++;
            }
        }
        return counter;
    }
}
