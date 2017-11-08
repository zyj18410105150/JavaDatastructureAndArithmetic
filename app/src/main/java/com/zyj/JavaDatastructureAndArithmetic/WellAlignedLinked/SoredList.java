package com.zyj.JavaDatastructureAndArithmetic.WellAlignedLinked;

/**
 * Created by Administrator on 2017-11-1.
 */

public class SoredList {
    private Link first;

    public SoredList(){
        first=null;
    }

    public boolean isEmpty(){
        return (first==null);
    }

    public void insert(long key){
        Link newLink=new Link(key);
        Link previous=null;
        Link current=first;

        while (current!=null&&key>current.dData){
            previous=current;
            current=current.next;
        }
        if (previous==null){
            first=newLink;
        }else{
            previous.next=newLink;
        }
        newLink.next=current;
    }

    public Link remove(){
        Link temp=first;
        first=first.next;
        return temp;
    }

    public void displayList(){
        System.out.print("List(first-->last):");
        Link current=first;
        while (current!=null){
            current.displayLink();
            current=current.next;
        }
        System.out.print("");
    }
}
