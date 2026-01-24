package com.github.mduon2.bldcubing;

public abstract class Cube {
    protected String edgeStatus;
    protected String cornerStatus;

    //no constructor because abstract class, trivial

    protected abstract char isColour(char piece);

    protected abstract void applyR();

    protected abstract void applyL();

    protected abstract void applyU();

    protected abstract void applyD();

    protected abstract void applyF();

    protected abstract void applyB();

    public abstract void applyScramble(String scramble);

    protected abstract void white_and_yellow_spacing();

    protected abstract void white_and_yellow_borders();

    protected abstract void OGRB_borders();

    protected abstract void showWhite();

    protected abstract void showYellow();

    protected abstract void showOGRB();

    public abstract void showCube();

    public abstract String edgeSolution();

    public abstract String cornerSolution();

    public abstract Boolean isSolved();

    public String get_edgeStatus() {
        return edgeStatus;
    }
    public String get_cornerStatus() {
        return edgeStatus;
    }
    public void set_edgeStatus(String state) {
        this.edgeStatus = state;
    }
    public void set_cornerStatus(String state) {
        this.edgeStatus = state;
    }
}
