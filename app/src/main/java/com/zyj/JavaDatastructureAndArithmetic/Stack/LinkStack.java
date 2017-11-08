package com.zyj.JavaDatastructureAndArithmetic.Stack;

/**
 * Created by Administrator on 2017-10-31.
 */

public class LinkStack {
    private LinkList theList;

    public LinkStack(){
        theList=new LinkList();
    }

    public void push(long j){
        theList.insertFirst(j);
    }

    public long pop(){
        return theList.deleteFirst();
    }

    public boolean isEmpty(){
        return (theList.isEmpty());
    }

    public void displayStack(){
        System.out.print("Stack(top-->bottom)");
        theList.displayList();
    }
}
