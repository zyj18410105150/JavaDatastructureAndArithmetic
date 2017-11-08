package com.zyj.JavaDatastructureAndArithmetic.InsertionSorting;

/**
 * Created by Administrator on 2017-10-31.
 */

public class ArrayIns {
    private long[] a;
    private int nElement;

    public ArrayIns(int max){
        a=new long[max];
        nElement=0;
    }

    public void insert(long value){
        a[nElement]=value;
        nElement++;
    }

    public long[] display(){
        return a;
    }

    public void insertionSort(){
        int in,out;
        for (out=1;out<nElement;out++){
            long temp=a[out];
            in=out;
            while (in>0&&a[in-1]>=temp){
                a[in]=a[in-1];
                --in;
            }
            a[in]=temp;
        }
    }
}
