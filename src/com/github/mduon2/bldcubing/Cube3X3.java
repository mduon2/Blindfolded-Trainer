package com.github.mduon2.bldcubing;

public class Cube3X3 extends Cube {
    Cube3X3() {
        edgeStatus = "ABCDEFGHIJKLMNOPQRSTUVWX";
        cornerStatus = "ABCDEFGHIJKLMNOPQRSTUVWX";
    }
    Cube3X3(String edges, String corners) {
        edgeStatus = edges;
        cornerStatus = corners;
    }

    @Override
    public void applyScramble(String scramble) {
        for (int i = 0; i < scramble.length(); i++) {
            switch (scramble.charAt(i)) {
                case 'R':
                    //logic to be implemented
                case 'L':
                    //logic to be implemented
                case 'U':
                    //logic to be implemented
                case 'D':
                    //logic to be implemented
                case 'F':
                    //logic to be implemented
                case 'B':
                    //logic to be implemented
                case 'M':
                    //logic to be implemented
/*              case 'r':
                    //logic to be implemented
                case 'l':
                    //logic to be implemented
                case 'u':
                    //logic to be implemented
                case 'd':
                    //logic to be implemented
                case 'f':
                    //logic to be implemented
                case 'b':
                    //logic to be implemented*/ //idk if I want to cover these case yet bc typical scramble won't have them
                default:
                    String output = String.format("%c is invalid move, was not applied.", scramble.charAt(i));
                    System.out.println(output);
            }
        }
    }
}
