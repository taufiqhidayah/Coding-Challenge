package com.company;
class Ovr{
    private Integer L;
    public Integer getL() {
        return L;
    }

    public void setL(Integer l) {
        L = l;
    }

    public Integer getW() {
        return W;
    }

    public void setW(Integer w) {
        W = w;
    }

    private Integer W;

    public Ovr(Integer l, Integer w) {
        L = l;
        W = w;
    }
}

public class Overdng {
    public static void main(String[] args) {
        Ovr ovr = new Ovr(1,3);
        Ovr ap = new Ovr(1,3);

    }
}
