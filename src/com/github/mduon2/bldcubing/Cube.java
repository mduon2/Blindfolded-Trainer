package com.github.mduon2.bldcubing;

public abstract class Cube {
    protected String edgeStatus;
    protected String cornerStatus;

    //no constructor because abstract class, trivial

    protected char isColour(char piece) { //virtual
        return ' ';
    }

    protected void applyR() { //virtual
        return;
    }

    protected void applyL() { //virtual
        return;
    }

    protected void applyU() { //virtual
        return;
    }

    protected void applyD() { //virtual
        return;
    }

    protected void applyF() { //virtual
        return;
    }

    protected void applyB() { //virtual
        return;
    }

    public void applyScramble(String scramble) { //virtual
        return;
    }

    public void showWhite() {

    }

    public void showYellow() {

    }

    public void showOrange() {

    }

    public void showGreen() {

    }

    public void showRed() {

    }

    public void showBlue() {

    }

    public void showCube() { //virtual

    }

    public String edgeSolution() {
        return "";
    } //virtual

    public String cornerSolution() {
        return "";
    } //virtual

    public Boolean isSolved() {
        return true;
    }

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
