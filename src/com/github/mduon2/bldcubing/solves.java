package com.github.mduon2.bldcubing;

import java.util.Scanner;

public class solves {
    public static void main(String[] args) {
        System.out.println("======Welcome to Blindfolded Trainer======\n");
        Cube cube = new Cube3x3();

        Scanner reader = new Scanner(System.in);
        System.out.print("Please input a scramble: ");
        String scramble = reader.nextLine();

        System.out.print(scramble);

        cube.applyScramble(scramble);

        System.out.println("\nYour cube after scrambling:");
        cube.showCube();
    }
}
