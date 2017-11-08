package com.zyj.JavaDatastructureAndArithmetic.Iterator;

/**
 * Created by Administrator on 2017-11-1.
 */

public class Link {
    public long dData;
    public Link next;

    public Link(long dd){
        dData=dd;
    }

    public void displayLink(){
        System.out.print(dData+" ");
    }
}
