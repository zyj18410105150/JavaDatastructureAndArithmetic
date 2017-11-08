package com.zyj.JavaDatastructureAndArithmetic.Queue;

/**
 * Created by Administrator on 2017-10-31.
 */

public class FirstLastList {
    private Link first;
    private Link last;

    public FirstLastList(){
        first=null;
        last=null;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void insertLast(long dd){
        Link newLink=new Link(dd);
        if (isEmpty()){
            first=newLink;
        }else{
            last.next=newLink;
        }
        last=newLink;
    }

    public long deleteFirst(){
        long temp=first.dData;
        if (first.next==null){
            last=null;
        }
        first=first.next;
        return temp;
    }

    public void dispayList(){
        Link current=first;
        while (current!=null){
            current.displayLink();
            current=current.next;
        }
        System.out.print("");
    }
}
