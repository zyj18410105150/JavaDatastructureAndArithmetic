package com.zyj.JavaDatastructureAndArithmetic.Recursion;

/**
 * Created by Administrator on 2017-11-9.
 */

public class DArray {
    private long[] theArray;
    private int nElems;

    public DArray(int max){
        theArray=new long[max];
        nElems=0;
    }

    public void insert(long value){
        theArray[nElems] = value;
        nElems++;
    }

    public void display(){
        for (int j=0;j<nElems;j++){
            System.out.print(theArray[j]+" ");
        }
        System.out.print("");
    }

    public void mergeSort(){

    }
}
