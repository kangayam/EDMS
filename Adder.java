package com.get.calcengine;

public class Adder {
    private int leftVal;
    private int rightVal;
    private int results;

    public Adder() {
    }
    public Adder(int leftVal, int rightVal){
        this.leftVal=leftVal;
        this.rightVal=rightVal;
        calCfunction();


    }
    public Adder(int leftVal,int rightVal,char OpCode){

    }
    public int calCfunction(){
        results= leftVal+rightVal;

        return results;
    }

    public int getLeftVal() {
        return leftVal;
    }

    public int getRightVal() {
        return rightVal;
    }

    public int getResults() {
        return results;
    }
}
