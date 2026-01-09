package com.github.mduon2.bldcubing;

public abstract class Cube {
    protected String edgeStatus;
    protected String cornerStatus;

    //no constructor because abstract class, trivial

    public void applyScramble(String scramble) { //virtual
        return;
    }

    public String edgeSolution() {
        return "";
    }

    public String cornerSolution() {
        return "";
    }

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
