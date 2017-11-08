package com.zyj.JavaDatastructureAndArithmetic.DoubleLinkedList;

/**
 * Created by Administrator on 2017-11-1.
 */

public class Link {
    public long dData;
    public Link next;
    public Link previous;

    public Link(long d){
        dData=d;
    }

    public void displayLink(){
        System.out.print(dData+" ");
    }
}
