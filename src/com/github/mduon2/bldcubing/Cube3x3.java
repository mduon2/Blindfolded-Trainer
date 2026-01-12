package com.github.mduon2.bldcubing;

public class Cube3x3 extends Cube {
    Cube3x3() {
        edgeStatus = "ABCDEFGHIJKLMNOPQRSTUVWX";
        cornerStatus = "ABCDEFGHIJKLMNOPQRSTUVWX";
    }
    Cube3x3(String edges, String corners) {
        edgeStatus = edges;
        cornerStatus = corners;
    }

    @Override
    protected char isColour(char piece) {
        if (piece - 65 < 4) { //A-D is white
            return 'W';
        } else if (piece - 65 < 8) { //E-H is orange
            return 'O';
        } else if (piece - 65 < 12) { //I-L is green
            return 'G';
        } else if (piece - 65 < 16) { //M-P is red
            return 'R';
        } else if (piece - 65 < 20) { //Q-T is blue
            return 'B';
        } else { //U-X is yellow
            return 'Y';
        }
    }

    @Override
    protected void applyR() { //virtual
        char[] edgeArray = edgeStatus.toCharArray();
        edgeArray['B' - 65] = 'J';
        edgeArray['T' - 65] = 'B';
        edgeArray['V' - 65] = 'T';
        edgeArray['J' - 65] = 'V';
        edgeArray['M' - 65] = 'P';
        edgeArray['N' - 65] = 'M';
        edgeArray['O' - 65] = 'N';
        edgeArray['P' - 65] = 'O';
        this.edgeStatus = String.valueOf(edgeArray);

        char[] cornerArray = cornerStatus.toCharArray();
        cornerArray['B' - 65] = 'J';
        cornerArray['T' - 65] = 'B';
        cornerArray['V' - 65] = 'T';
        cornerArray['J' - 65] = 'V';
        cornerArray['C' - 65] = 'K';
        cornerArray['Q' - 65] = 'C';
        cornerArray['W' - 65] = 'Q';
        cornerArray['K' - 65] = 'W';
        cornerArray['M' - 65] = 'P';
        cornerArray['N' - 65] = 'M';
        cornerArray['O' - 65] = 'N';
        cornerArray['P' - 65] = 'O';
        this.cornerStatus = String.valueOf(cornerArray);
    }

    @Override
    protected void applyL() { //virtual
        char[] edgeArray = edgeStatus.toCharArray();
        edgeArray['D' - 65] = 'R';
        edgeArray['R' - 65] = 'X';
        edgeArray['X' - 65] = 'L';
        edgeArray['L' - 65] = 'D';
        edgeArray['E' - 65] = 'H';
        edgeArray['F' - 65] = 'E';
        edgeArray['G' - 65] = 'F';
        edgeArray['H' - 65] = 'G';
        this.edgeStatus = String.valueOf(edgeArray);

        char[] cornerArray = cornerStatus.toCharArray();
        cornerArray['D' - 65] = 'R';
        cornerArray['R' - 65] = 'X';
        cornerArray['X' - 65] = 'L';
        cornerArray['L' - 65] = 'D';
        cornerArray['A' - 65] = 'S';
        cornerArray['S' - 65] = 'U';
        cornerArray['U' - 65] = 'I';
        cornerArray['I' - 65] = 'A';
        cornerArray['E' - 65] = 'H';
        cornerArray['F' - 65] = 'E';
        cornerArray['G' - 65] = 'F';
        cornerArray['H' - 65] = 'G';
        this.cornerStatus = String.valueOf(cornerArray);
    }

    @Override
    protected void applyU() { //virtual
        char[] edgeArray = edgeStatus.toCharArray();
        edgeArray['I' - 65] = 'M';
        edgeArray['E' - 65] = 'I';
        edgeArray['Q' - 65] = 'E';
        edgeArray['M' - 65] = 'Q';
        edgeArray['A' - 65] = 'D';
        edgeArray['B' - 65] = 'A';
        edgeArray['C' - 65] = 'B';
        edgeArray['D' - 65] = 'C';
        this.edgeStatus = String.valueOf(edgeArray);

        char[] cornerArray = cornerStatus.toCharArray();
        cornerArray['I' - 65] = 'M';
        cornerArray['E' - 65] = 'I';
        cornerArray['Q' - 65] = 'E';
        cornerArray['M' - 65] = 'Q';
        cornerArray['J' - 65] = 'N';
        cornerArray['F' - 65] = 'J';
        cornerArray['R' - 65] = 'F';
        cornerArray['N' - 65] = 'R';
        cornerArray['A' - 65] = 'D';
        cornerArray['B' - 65] = 'A';
        cornerArray['C' - 65] = 'B';
        cornerArray['D' - 65] = 'C';
        this.cornerStatus = String.valueOf(cornerArray);
    }

    @Override
    protected void applyD() { //virtual
        char[] edgeArray = edgeStatus.toCharArray();
        edgeArray['K' - 65] = 'G';
        edgeArray['G' - 65] = 'S';
        edgeArray['S' - 65] = 'O';
        edgeArray['O' - 65] = 'K';
        edgeArray['U' - 65] = 'X';
        edgeArray['V' - 65] = 'U';
        edgeArray['W' - 65] = 'V';
        edgeArray['X' - 65] = 'W';
        this.edgeStatus = String.valueOf(edgeArray);

        char[] cornerArray = cornerStatus.toCharArray();
        cornerArray['K' - 65] = 'G';
        cornerArray['G' - 65] = 'S';
        cornerArray['S' - 65] = 'O';
        cornerArray['O' - 65] = 'K';
        cornerArray['L' - 65] = 'H';
        cornerArray['H' - 65] = 'T';
        cornerArray['T' - 65] = 'P';
        cornerArray['P' - 65] = 'L';
        cornerArray['U' - 65] = 'X';
        cornerArray['V' - 65] = 'U';
        cornerArray['W' - 65] = 'V';
        cornerArray['X' - 65] = 'W';
        this.cornerStatus = String.valueOf(cornerArray);
    }

    @Override
    protected void applyF() { //virtual
        return;
    }

    @Override
    protected void applyB() { //virtual
        return;
    }

    @Override
    public void applyScramble(String scramble) {
        int pointer = 0;
        for (int i = 0; i < scramble.length(); i++) {
            String move;
            if (scramble.charAt(i) == ' ') {
                move = scramble.substring(pointer, i-1);
            }

        }
    }

    @Override
    public void showWhite() {
        for (int i = 0; i < 7; i++) {
            System.out.print("-");
        }

        String line = String.format("\n|%c|%c|%c|\n", isColour(cornerStatus.charAt(0)), isColour(edgeStatus.charAt(0)), isColour(cornerStatus.charAt(0)));
        System.out.print(line);

        for (int i = 0; i < 7; i++) {
            System.out.print("-");
        }

        line = String.format("\n|%c|%c|%c|\n", isColour(edgeStatus.charAt(3)), 'W', isColour(edgeStatus.charAt(1)));
        System.out.print(line);

        for (int i = 0; i < 7; i++) {
            System.out.print("-");
        }

        line = String.format("\n|%c|%c|%c|\n", isColour(cornerStatus.charAt(3)), isColour(edgeStatus.charAt(2)), isColour(cornerStatus.charAt(2)));
        System.out.print(line);
    }

    @Override
    public void showCube() {
        
    }
}
