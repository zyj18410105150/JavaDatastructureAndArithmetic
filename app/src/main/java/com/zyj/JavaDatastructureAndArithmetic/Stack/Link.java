package com.zyj.JavaDatastructureAndArithmetic.Stack;

/**
 * Created by Administrator on 2017-10-31.
 */

public class Link {
    public long dData;
    public Link next;

    public Link(long dd){
        dData=dd;
    }

    public void displayLink(){
        System.out.print(dData+"");
    }
}
