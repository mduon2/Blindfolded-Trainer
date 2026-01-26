package com.github.mduon2.bldcubing;

public class Cube3x3 extends Cube {
    protected static final String SOLVED_EDGES = "ABCDEFGHIJKLMNOPQRSTUVWX";
    protected static final String SOLVED_CORNERS = "ABCDEFGHIJKLMNOPQRSTUVWX";
    Cube3x3() {
        this.edgeStatus = SOLVED_EDGES;
        this.cornerStatus = SOLVED_CORNERS;
    }
    Cube3x3(String edges, String corners) {
        this.edgeStatus = edges;
        this.cornerStatus = corners;
    }

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

    protected void applyL() { //virtual
        char[] currEdges = edgeStatus.toCharArray();
        char[] afterEdges = currEdges.clone();
        afterEdges['D' - 65] = currEdges['R' - 65];
        afterEdges['R' - 65] = currEdges['X' - 65];
        afterEdges['X' - 65] = currEdges['L' - 65];
        afterEdges['L' - 65] = currEdges['D' - 65];
        afterEdges['E' - 65] = currEdges['H' - 65];
        afterEdges['F' - 65] = currEdges['E' - 65];
        afterEdges['G' - 65] = currEdges['F' - 65];
        afterEdges['H' - 65] = currEdges['G' - 65];
        this.edgeStatus = String.valueOf(afterEdges);

        char[] currCorners = cornerStatus.toCharArray();
        char[] afterCorners = currCorners.clone();
        afterCorners['D' - 65] = currCorners['R' - 65];
        afterCorners['R' - 65] = currCorners['X' - 65];
        afterCorners['X' - 65] = currCorners['L' - 65];
        afterCorners['L' - 65] = currCorners['D' - 65];
        afterCorners['A' - 65] = currCorners['S' - 65];
        afterCorners['S' - 65] = currCorners['U' - 65];
        afterCorners['U' - 65] = currCorners['I' - 65];
        afterCorners['I' - 65] = currCorners['A' - 65];
        afterCorners['E' - 65] = currCorners['H' - 65];
        afterCorners['F' - 65] = currCorners['E' - 65];
        afterCorners['G' - 65] = currCorners['F' - 65];
        afterCorners['H' - 65] = currCorners['G' - 65];
        this.cornerStatus = String.valueOf(afterCorners);
    }

    protected void applyU() { //virtual
        char[] currEdges = edgeStatus.toCharArray();
        char[] afterEdges = currEdges.clone();
        afterEdges['I' - 65] = currEdges['M' - 65];
        afterEdges['E' - 65] = currEdges['I' - 65];
        afterEdges['Q' - 65] = currEdges['E' - 65];
        afterEdges['M' - 65] = currEdges['Q' - 65];
        afterEdges['A' - 65] = currEdges['D' - 65];
        afterEdges['B' - 65] = currEdges['A' - 65];
        afterEdges['C' - 65] = currEdges['B' - 65];
        afterEdges['D' - 65] = currEdges['C' - 65];
        this.edgeStatus = String.valueOf(afterEdges);

        char[] currCorners = cornerStatus.toCharArray();
        char[] afterCorners = currCorners.clone();
        afterCorners['I' - 65] = currCorners['M' - 65];
        afterCorners['E' - 65] = currCorners['I' - 65];
        afterCorners['Q' - 65] = currCorners['E' - 65];
        afterCorners['M' - 65] = currCorners['Q' - 65];
        afterCorners['J' - 65] = currCorners['N' - 65];
        afterCorners['F' - 65] = currCorners['J' - 65];
        afterCorners['R' - 65] = currCorners['F' - 65];
        afterCorners['N' - 65] = currCorners['R' - 65];
        afterCorners['A' - 65] = currCorners['D' - 65];
        afterCorners['B' - 65] = currCorners['A' - 65];
        afterCorners['C' - 65] = currCorners['B' - 65];
        afterCorners['D' - 65] = currCorners['C' - 65];
        this.cornerStatus = String.valueOf(afterCorners);
    }

    protected void applyD() { //virtual
        char[] currEdges = edgeStatus.toCharArray();
        char[] afterEdges = currEdges.clone();
        afterEdges['K' - 65] = currEdges['G' - 65];
        afterEdges['G' - 65] = currEdges['S' - 65];
        afterEdges['S' - 65] = currEdges['O' - 65];
        afterEdges['O' - 65] = currEdges['K' - 65];
        afterEdges['U' - 65] = currEdges['X' - 65];
        afterEdges['V' - 65] = currEdges['U' - 65];
        afterEdges['W' - 65] = currEdges['V' - 65];
        afterEdges['X' - 65] = currEdges['W' - 65];
        this.edgeStatus = String.valueOf(afterEdges);

        char[] currCorners = cornerStatus.toCharArray();
        char[] afterCorners = currCorners.clone();
        afterCorners['K' - 65] = currCorners['G' - 65];
        afterCorners['G' - 65] = currCorners['S' - 65];
        afterCorners['S' - 65] = currCorners['O' - 65];
        afterCorners['O' - 65] = currCorners['K' - 65];
        afterCorners['L' - 65] = currCorners['H' - 65];
        afterCorners['H' - 65] = currCorners['T' - 65];
        afterCorners['T' - 65] = currCorners['P' - 65];
        afterCorners['P' - 65] = currCorners['L' - 65];
        afterCorners['U' - 65] = currCorners['X' - 65];
        afterCorners['V' - 65] = currCorners['U' - 65];
        afterCorners['W' - 65] = currCorners['V' - 65];
        afterCorners['X' - 65] = currCorners['W' - 65];
        this.cornerStatus = String.valueOf(afterCorners);
    }

    protected void applyF() { //virtual
        char[] currEdges = edgeStatus.toCharArray();
        char[] afterEdges = currEdges.clone();
        afterEdges['C' - 65] = currEdges['F' - 65];
        afterEdges['P' - 65] = currEdges['C' - 65];
        afterEdges['U' - 65] = currEdges['P' - 65];
        afterEdges['F' - 65] = currEdges['U' - 65];
        afterEdges['I' - 65] = currEdges['L' - 65];
        afterEdges['J' - 65] = currEdges['I' - 65];
        afterEdges['K' - 65] = currEdges['J' - 65];
        afterEdges['L' - 65] = currEdges['K' - 65];
        this.edgeStatus = String.valueOf(afterEdges);

        char[] currCorners = cornerStatus.toCharArray();
        char[] afterCorners = currCorners.clone();
        afterCorners['C' - 65] = currCorners['F' - 65];
        afterCorners['P' - 65] = currCorners['C' - 65];
        afterCorners['U' - 65] = currCorners['P' - 65];
        afterCorners['F' - 65] = currCorners['U' - 65];
        afterCorners['D' - 65] = currCorners['G' - 65];
        afterCorners['M' - 65] = currCorners['D' - 65];
        afterCorners['V' - 65] = currCorners['M' - 65];
        afterCorners['G' - 65] = currCorners['V' - 65];
        afterCorners['I' - 65] = currCorners['L' - 65];
        afterCorners['J' - 65] = currCorners['I' - 65];
        afterCorners['K' - 65] = currCorners['J' - 65];
        afterCorners['L' - 65] = currCorners['K' - 65];
        this.cornerStatus = String.valueOf(afterCorners);
    }

    protected void applyB() { //virtual
        char[] currEdges = edgeStatus.toCharArray();
        char[] afterEdges = currEdges.clone();
        afterEdges['A' - 65] = currEdges['N' - 65];
        afterEdges['H' - 65] = currEdges['A' - 65];
        afterEdges['W' - 65] = currEdges['H' - 65];
        afterEdges['N' - 65] = currEdges['W' - 65];
        afterEdges['Q' - 65] = currEdges['T' - 65];
        afterEdges['R' - 65] = currEdges['Q' - 65];
        afterEdges['S' - 65] = currEdges['R' - 65];
        afterEdges['T' - 65] = currEdges['S' - 65];
        this.edgeStatus = String.valueOf(afterEdges);

        char[] currCorners = cornerStatus.toCharArray();
        char[] afterCorners = currCorners.clone();
        afterCorners['A' - 65] = currCorners['N' - 65];
        afterCorners['H' - 65] = currCorners['A' - 65];
        afterCorners['W' - 65] = currCorners['H' - 65];
        afterCorners['N' - 65] = currCorners['W' - 65];
        afterCorners['B' - 65] = currCorners['O' - 65];
        afterCorners['E' - 65] = currCorners['B' - 65];
        afterCorners['X' - 65] = currCorners['E' - 65];
        afterCorners['O' - 65] = currCorners['X' - 65];
        afterCorners['Q' - 65] = currCorners['T' - 65];
        afterCorners['R' - 65] = currCorners['Q' - 65];
        afterCorners['S' - 65] = currCorners['R' - 65];
        afterCorners['T' - 65] = currCorners['S' - 65];
        this.cornerStatus = String.valueOf(afterCorners);
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

    public void applyScramble(String scramble) {
        String[] moves = scramble.split(" ");
        for (String move : moves) {
            apply_move(move);
        }
    }

    protected void white_and_yellow_spacing() {
        for (int i = 0; i < 8; i++) {
            System.out.print(" ");
        }
    }
    
    protected void white_and_yellow_borders() {
        System.out.println();
        white_and_yellow_spacing();
    }
    
    protected void OGRB_borders() {
        for (int i = 0; i < 31; i++) {
            if (i % 8 != 0) {
                System.out.print("-");
            } else {
                System.out.print(" ");
            }
        }
    }

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
    
    public void showCube() {
        showWhite();
        showOGRB();
        showYellow();
    }

    /**
     * @param piece1 Index of first piece to be swapped (buffer)
     * @param piece2 Index of second piece to be swapped (setup)
     * @param isEdge Indicates if it's an edge piece
     */
    private void swap(int piece1, int piece2, boolean isEdge) {
        if (isEdge) {
            char[] edgeArray = edgeStatus.toCharArray();
            char temp = edgeArray[piece1];
            edgeArray[piece1] = edgeArray[piece2];
            edgeArray[piece2] = temp;
            this.edgeStatus = String.valueOf(edgeArray);
        } else {
            char[] cornerArray = edgeStatus.toCharArray();
            char temp = cornerArray[piece1];
            cornerArray[piece1] = cornerArray[piece2];
            cornerArray[piece2] = temp;
            this.edgeStatus = String.valueOf(cornerArray);
        }
    }

    protected String edgeSolution() {
        StringBuilder solution = new StringBuilder();
        while (!isSolved()) {
            if (edgeStatus.charAt(1) == 'B') {
                for (int i = 0 ; i < 24; i++) {
                    if (edgeStatus.charAt(i) - 65 != i) {
                        solution.append(edgeStatus.charAt(i));
                        swap(1, i, true);
                        break;
                    }
                }
            } else {
                solution.append(edgeStatus.charAt(1));
                swap(1, edgeStatus.charAt(1) - 65, true);
            }

        }
        return solution.toString();
    }

    protected String cornerSolution() {
        StringBuilder solution = new StringBuilder();
        while (!isSolved()) {
            if (cornerStatus.charAt(0) == 'A') {
                for (int i = 0 ; i < 24; i++) {
                    if (cornerStatus.charAt(i) - 65 != i) {
                        solution.append(cornerStatus.charAt(i));
                        swap(1, i, false);
                        break;
                    }
                }
            } else {
                solution.append(cornerStatus.charAt(0));
                swap(0, cornerStatus.charAt(0) - 65, false);
            }

        }
        return solution.toString();
    }

    /**
     * Shows the corner and edge solutions in pairs of 2 (e.g. ME IL TX...) and states if there's parity
     */
    public void showSolution() {
        System.out.println("Solution for the corners:");
        for (int i = 0; i < cornerSolution().length(); i++) {
            System.out.print(cornerSolution().charAt(i));
            if (i % 2 == 1) {
                System.out.print(" ");
            }
        }

        System.out.println("\n");
        if (edgeSolution().length() % 2 == 0) {
            System.out.println("No Parity\n");
        } else {
            System.out.println("Parity\n");
        }

        System.out.println("Solution for the edges:");
        for (int i = 0; i < edgeSolution().length(); i++) {
            System.out.print(edgeSolution().charAt(i));
            if (i % 2 == 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public Boolean isSolved() {
        return edgeStatus.equals(SOLVED_EDGES) && cornerStatus.equals(SOLVED_CORNERS);
    }

}
