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
        char[] currEdges = edgeStatus.toCharArray();
        char[] afterEdges = currEdges.clone();
        afterEdges['B' - 65] = currEdges['J' - 65];
        afterEdges['T' - 65] = currEdges['B' - 65];
        afterEdges['V' - 65] = currEdges['T' - 65];
        afterEdges['J' - 65] = currEdges['V' - 65];
        afterEdges['M' - 65] = currEdges['P' - 65];
        afterEdges['N' - 65] = currEdges['M' - 65];
        afterEdges['O' - 65] = currEdges['N' - 65];
        afterEdges['P' - 65] = currEdges['O' - 65];
        this.edgeStatus = String.valueOf(afterEdges);

        char[] currCorners = cornerStatus.toCharArray();
        char[] afterCorners = currCorners.clone();
        afterCorners['B' - 65] = currCorners['J' - 65];
        afterCorners['T' - 65] = currCorners['B' - 65];
        afterCorners['V' - 65] = currCorners['T' - 65];
        afterCorners['J' - 65] = currCorners['V' - 65];
        afterCorners['C' - 65] = currCorners['K' - 65];
        afterCorners['Q' - 65] = currCorners['C' - 65];
        afterCorners['W' - 65] = currCorners['Q' - 65];
        afterCorners['K' - 65] = currCorners['W' - 65];
        afterCorners['M' - 65] = currCorners['P' - 65];
        afterCorners['N' - 65] = currCorners['M' - 65];
        afterCorners['O' - 65] = currCorners['N' - 65];
        afterCorners['P' - 65] = currCorners['O' - 65];
        this.cornerStatus = String.valueOf(afterCorners);
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
        char[] edgeArray = edgeStatus.toCharArray();
        edgeArray['C' - 65] = 'F';
        edgeArray['P' - 65] = 'C';
        edgeArray['U' - 65] = 'P';
        edgeArray['F' - 65] = 'U';
        edgeArray['I' - 65] = 'L';
        edgeArray['J' - 65] = 'I';
        edgeArray['K' - 65] = 'J';
        edgeArray['L' - 65] = 'K';
        this.edgeStatus = String.valueOf(edgeArray);

        char[] cornerArray = cornerStatus.toCharArray();
        cornerArray['C' - 65] = 'F';
        cornerArray['P' - 65] = 'C';
        cornerArray['U' - 65] = 'P';
        cornerArray['F' - 65] = 'U';
        cornerArray['D' - 65] = 'G';
        cornerArray['M' - 65] = 'D';
        cornerArray['V' - 65] = 'M';
        cornerArray['G' - 65] = 'V';
        cornerArray['I' - 65] = 'L';
        cornerArray['J' - 65] = 'I';
        cornerArray['K' - 65] = 'J';
        cornerArray['L' - 65] = 'K';
        this.cornerStatus = String.valueOf(cornerArray);
    }

    @Override
    protected void applyB() { //virtual
        char[] edgeArray = edgeStatus.toCharArray();
        edgeArray['A' - 65] = 'N';
        edgeArray['H' - 65] = 'A';
        edgeArray['W' - 65] = 'H';
        edgeArray['N' - 65] = 'W';
        edgeArray['Q' - 65] = 'T';
        edgeArray['R' - 65] = 'Q';
        edgeArray['S' - 65] = 'R';
        edgeArray['T' - 65] = 'S';
        this.edgeStatus = String.valueOf(edgeArray);

        char[] cornerArray = cornerStatus.toCharArray();
        cornerArray['A' - 65] = 'N';
        cornerArray['H' - 65] = 'A';
        cornerArray['W' - 65] = 'H';
        cornerArray['N' - 65] = 'W';
        cornerArray['B' - 65] = 'O';
        cornerArray['E' - 65] = 'B';
        cornerArray['X' - 65] = 'E';
        cornerArray['O' - 65] = 'X';
        cornerArray['Q' - 65] = 'T';
        cornerArray['R' - 65] = 'Q';
        cornerArray['S' - 65] = 'R';
        cornerArray['T' - 65] = 'S';
        this.cornerStatus = String.valueOf(cornerArray);
    }

    private void apply_move(String move) {
        int turns = 1;

        if (move.length() == 2) {
            if (move.charAt(1) == '2') {
                turns = 2;
            } else if (move.charAt(1) == '\'') {
                turns = 3;
            } else {
                System.out.printf("%s is not a valid move, was executed as %c\n", move, move.charAt(0));
            }
        } else if (move.length() != 1) {
            System.out.printf("%s is not a valid move, was not executed\n", move);
            return;
        }

        for (int i = 0; i < turns; i++) {
            switch (move.charAt((0))) {
                case 'R' -> applyR();
                case 'L' -> applyL();
                case 'U' -> applyU();
                case 'D' -> applyD();
                case 'F' -> applyF();
                case 'B' -> applyB();
                default -> {
                    System.out.printf("%s is not a valid move, was not executed\n", move);
                    return;
                }
            }
        }
    }

    @Override
    public void applyScramble(String scramble) {
        String[] moves = scramble.split(" ");
        for (String move : moves) {
            apply_move(move);
        }
    }

    @Override
    protected void white_and_yellow_spacing() {
        for (int i = 0; i < 8; i++) {
            System.out.print(" ");
        }
    }

    @Override
    protected void white_and_yellow_borders() {
        System.out.println();
        white_and_yellow_spacing();
    }

    @Override
    protected void OGRB_borders() {
        for (int i = 0; i < 31; i++) {
            if (i % 8 != 0) {
                System.out.print("-");
            } else {
                System.out.print(" ");
            }
        }
    }

    @Override
    protected void showWhite() {
        white_and_yellow_spacing();
        for (int i = 0; i < 7; i++) {
            System.out.print("-");
        }

        white_and_yellow_borders();
        String line = String.format("|%c|%c|%c|\n", isColour(cornerStatus.charAt(0)), isColour(edgeStatus.charAt(0)), isColour(cornerStatus.charAt(1)));
        System.out.print(line);

        white_and_yellow_spacing();
        for (int i = 0; i < 7; i++) {
            System.out.print("-");
        }

        white_and_yellow_borders();
        line = String.format("|%c|%c|%c|\n", isColour(edgeStatus.charAt(3)), 'W', isColour(edgeStatus.charAt(1)));
        System.out.print(line);

        white_and_yellow_spacing();
        for (int i = 0; i < 7; i++) {
            System.out.print("-");
        }

        white_and_yellow_borders();
        line = String.format("|%c|%c|%c|\n", isColour(cornerStatus.charAt(3)), isColour(edgeStatus.charAt(2)), isColour(cornerStatus.charAt(2)));
        System.out.print(line);
    }

    @Override
    protected void showYellow() {
        white_and_yellow_spacing();
        for (int i = 0; i < 7; i++) {
            System.out.print("-");
        }

        white_and_yellow_borders();
        String line = String.format("|%c|%c|%c|\n", isColour(cornerStatus.charAt(20)), isColour(edgeStatus.charAt(20)), isColour(cornerStatus.charAt(21)));
        System.out.print(line);

        white_and_yellow_spacing();
        for (int i = 0; i < 7; i++) {
            System.out.print("-");
        }

        white_and_yellow_borders();
        line = String.format("|%c|%c|%c|\n", isColour(edgeStatus.charAt(23)), 'Y', isColour(edgeStatus.charAt(21)));
        System.out.print(line);

        white_and_yellow_spacing();
        for (int i = 0; i < 7; i++) {
            System.out.print("-");
        }

        white_and_yellow_borders();
        line = String.format("|%c|%c|%c|\n", isColour(cornerStatus.charAt(23)), isColour(edgeStatus.charAt(22)), isColour(cornerStatus.charAt(22)));
        System.out.print(line);
    }

    @Override
    protected void showOGRB() {
        OGRB_borders();

        String line = String.format("\n|%c|%c|%c| |%c|%c|%c| |%c|%c|%c| |%c|%c|%c|\n", isColour(cornerStatus.charAt(4)), isColour(edgeStatus.charAt(4)), isColour(cornerStatus.charAt(5)), isColour(cornerStatus.charAt(8)), isColour(edgeStatus.charAt(8)), isColour(cornerStatus.charAt(9)), isColour(cornerStatus.charAt(12)), isColour(edgeStatus.charAt(12)), isColour(cornerStatus.charAt(13)), isColour(cornerStatus.charAt(16)), isColour(edgeStatus.charAt(16)), isColour(cornerStatus.charAt(17)));
        System.out.print(line);

        OGRB_borders();

        line = String.format("\n|%c|%c|%c| |%c|%c|%c| |%c|%c|%c| |%c|%c|%c|\n", isColour(edgeStatus.charAt(7)), 'O', isColour(edgeStatus.charAt(5)), isColour(edgeStatus.charAt(11)), 'G', isColour(edgeStatus.charAt(9)), isColour(edgeStatus.charAt(15)), 'R', isColour(edgeStatus.charAt(13)), isColour(edgeStatus.charAt(19)), 'B', isColour(edgeStatus.charAt(17)));
        System.out.print(line);

        OGRB_borders();

        line = String.format("\n|%c|%c|%c| |%c|%c|%c| |%c|%c|%c| |%c|%c|%c|\n", isColour(cornerStatus.charAt(7)), isColour(edgeStatus.charAt(6)), isColour(cornerStatus.charAt(6)), isColour(cornerStatus.charAt(11)), isColour(edgeStatus.charAt(10)), isColour(cornerStatus.charAt(10)), isColour(cornerStatus.charAt(15)), isColour(edgeStatus.charAt(14)), isColour(cornerStatus.charAt(14)), isColour(cornerStatus.charAt(19)), isColour(edgeStatus.charAt(18)), isColour(cornerStatus.charAt(18)));
        System.out.print(line);
    }

    @Override
    public void showCube() {
        showWhite();
        showOGRB();
        showYellow();
    }
}
