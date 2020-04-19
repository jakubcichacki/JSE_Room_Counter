package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] planOfHouse = new int[][]{
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 1, 1, 0, 0, 1, 0, 0, 1},
                {1, 0, 1, 0, 0, 0, 1, 1, 0, 1},
                {1, 1, 1, 0, 0, 0, 1, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };
        int result = counterOfRooms(planOfHouse);
        System.out.println(result);
    }

    public static int counterOfRooms(int[][] planOfHouse) {
        int counter = 0;

        for (int i = 1; i < planOfHouse.length; i++) {
            for (int j = 1; j < planOfHouse[i].length; j++) {
                if (planOfHouse[i][j] == 0) {
                    counter++;
                    planOfHouse[i][j] = -1;
                    searchRight(planOfHouse, i, j);
                    searchLeft(planOfHouse, i, j);
                    searchDown(planOfHouse, i, j);
                }
            }
        }
        return counter;
    }

    public static void searchRight(int[][] planOfHouse, int positionI, int positionJ) {
        while (planOfHouse[positionI][positionJ + 1] == 0) {
            planOfHouse[positionI][positionJ + 1] = -1;
            positionJ++;
            searchRight(planOfHouse, positionI, positionJ);
            searchLeft(planOfHouse,positionI, positionJ);
            searchDown(planOfHouse, positionI, positionJ);
        }
    }

    public static void searchLeft(int[][] planOfHouse, int positionI, int positionJ) {
        while (planOfHouse[positionI][positionJ - 1] == 0) {
            planOfHouse[positionI][positionJ - 1] = -1;
            positionJ--;
            searchLeft(planOfHouse, positionI, positionJ);
            searchRight(planOfHouse, positionI, positionJ);
            searchDown(planOfHouse, positionI, positionJ);

        }
    }

    public static void searchDown(int[][] planOfHouse, int positionI, int positionJ) {
        while (planOfHouse[positionI + 1][positionJ] == 0) {
            planOfHouse[positionI + 1][positionJ] = -1;
            positionI++;
            searchRight(planOfHouse, positionI, positionJ);
            searchLeft(planOfHouse,positionI, positionJ);
            searchDown(planOfHouse, positionI, positionJ);
        }
    }


}
