package com.zyj.JavaDatastructureAndArithmetic.WellAlignedLinked;

/**
 * Created by Administrator on 2017-11-1.
 */

public class SortedList2 {
    private Link first;

    public SortedList2(){
        first=null;
    }

    public SortedList2(Link[] linkArr){
        first=null;
        for (int j=0;j<linkArr.length;j++){
            insert(linkArr[j]);
        }
    }

    public void insert(Link k){
        Link previous=null;
        Link current=first;
        while (current!=null&&k.dData>current.dData){
            previous=current;
            current=current.next;
        }
        if (previous==null){
            first=k;
        }else{
            previous.next=k;
        }
        k.next=current;
    }

    public Link remove(){
        Link temp=first;
        first=first.next;
        return temp;
    }


}
