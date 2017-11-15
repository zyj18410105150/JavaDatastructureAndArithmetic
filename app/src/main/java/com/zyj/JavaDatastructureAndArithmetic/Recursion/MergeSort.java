package com.zyj.JavaDatastructureAndArithmetic.Recursion;

/**
 * Created by Administrator on 2017-11-9.
 * 归并排序:比简单排序中的排序方法有效很多，速度上也比简单排序快
 *
 * 归并排序的思想是把一个数组分成两半，排序每一半，然后用merge()方法把数组的两半归并成一个有序的数组
 * 使用递归把每一半都分成四分之一，对每个四分之一部分排序，然后把他们归并成一个有序的一半
 */

public class MergeSort {
    public static void main(String[] args){
        int maxSize=100;
        DArray arr;
        arr=new DArray(maxSize);

        arr.insert(64);
        arr.insert(21);
        arr.insert(33);
        arr.insert(70);
        arr.insert(12);
        arr.insert(85);
        arr.insert(44);
        arr.insert(3);
        arr.insert(99);
        arr.insert(0);
        arr.insert(108);
        arr.insert(36);

        arr.display();

        arr.mergeSort();

        arr.display();
    }
}
