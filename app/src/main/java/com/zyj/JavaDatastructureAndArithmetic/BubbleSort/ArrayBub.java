package com.zyj.JavaDatastructureAndArithmetic.BubbleSort;

/**
 * Created by Administrator on 2017-10-25.
 */

public class ArrayBub {
    private long[] a;
    private int nElems;

    public ArrayBub(int max){
        a=new long[max];
        nElems=0;
    }

    public void insert(long value){
        a[nElems]=value;
        nElems++;
    }

    public long[] display(){
       return a;
    }

    public void bubbleSort(){
        int out,in;
        for (out=nElems-1;out>1;out--){
            for (in=0;in<out;in++){
                if (a[in] > a[in+1]){
                    long temp=a[in];
                    a[in]=a[in+1];
                    a[in+1]=temp;
                }
            }
        }
    }
}
