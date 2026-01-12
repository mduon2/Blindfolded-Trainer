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
        return;
    }

    @Override
    protected void applyD() { //virtual
        return;
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
}
