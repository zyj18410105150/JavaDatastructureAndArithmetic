package com.zyj.JavaDatastructureAndArithmetic.DoubleEnd;

/**
 * Created by Administrator on 2017-10-31.
 */

public class Link {
    public long dData;
    public Link next;

    public Link(long d){
        dData=d;
    }

    public void displayLink(){
        System.out.print(dData+" ");
    }
}
