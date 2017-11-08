package com.zyj.JavaDatastructureAndArithmetic.PriorityQueue;

/**
 * Created by Administrator on 2017-10-31.
 */

public class PriorityQueue {
    private int maxSize;
    private long[] querArray;
    private int nItems;

    public PriorityQueue(int s){
        maxSize=s;
        querArray=new long[maxSize];
        nItems=0;
    }

    public void insert(long item){
        int j;
        if (nItems==0){
            querArray[nItems++]=item;
        }else{
            for (j=nItems-1;j>=0;j--){
                if (item>querArray[j]){
                    querArray[j+1]=querArray[j];
                }else{
                    break;
                }
                querArray[j+1]=item;
                nItems++;
            }
        }
    }

    public long remove(){
        return querArray[--nItems];
    }

    public long peekMin(){
        return querArray[nItems-1];
    }

    public boolean isEmpty(){
        return (nItems==0);
    }

    public boolean isFull(){
        return (nItems==maxSize);
    }
}
