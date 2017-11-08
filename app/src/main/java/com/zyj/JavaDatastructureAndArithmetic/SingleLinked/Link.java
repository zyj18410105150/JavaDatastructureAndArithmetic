package com.zyj.JavaDatastructureAndArithmetic.SingleLinked;

/**
 * Created by Administrator on 2017-10-31.
 */

public class Link {
    public int iData;
    public double dData;
    public Link next;

    public Link(int id,double dd){
        iData=id;
        dData=dd;
    }

    public void displayLink(){
        System.out.print("{"+iData+","+dData+"}");
    }

}
