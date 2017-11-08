package com.zyj.JavaDatastructureAndArithmetic.WellAlignedLinked;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zyj.JavaDatastructureAndArithmetic.R;

/**
 * 有序链表
 */
public class WellAlignedActivity extends AppCompatActivity {
    /**
     * 有序链表：
     按关键值排序。删除链头时，就删除最小(/最大)的值，插入时，搜索插入的位置。
     插入时需要比较O(N)，平均O(N/2)，删除最小(/最大)的在链头的数据时效率为O(1),
     如果一个应用需要频繁的存取(插入/查找/删除)最小(/最大)的数据项，那么有序链表是一个不错的选择
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_well_aligned);

        SoredList theSortedList=new SoredList();
        theSortedList.insert(20);
        theSortedList.insert(40);

        theSortedList.displayList();

        theSortedList.insert(10);
        theSortedList.insert(30);
        theSortedList.insert(50);

        theSortedList.displayList();

        theSortedList.remove();

        theSortedList.displayList();
    }

    /**
     * 有序链表的插入排序
     * 有序链表可以用于一种高效的排序机制。假如有一个无序数组，如果从这个数组中取出数据，然后一个一个
     * 地插入有序链表，他们自动按顺序排列，把他们从有序链表中删除，重新放入数组，那么数组就排好序了。
     * 这种排序方式总体比在数组中用常用的插入排序效率更高一些
     */
    private void ListInsertionSortApp(){
        int size=10;
        Link[] linkArray=new Link[size];

        for (int j=0;j<size;j++){
            int n=(int)(Math.random()*99);
            Link newLink=new Link(n);
            linkArray[j]=newLink;
        }
        System.out.print("Unsorted array:");
        for (int j=0;j<size;j++){
            System.out.print(linkArray[j].dData+" ");
        }
        System.out.print("");

        SortedList2 theSortedList=new SortedList2(linkArray);
        for (int j=0;j<size;j++){
            linkArray[j]=theSortedList.remove();
        }
        System.out.print("Sorted Array:     ");

        for (int j=0;j<size;j++){
            System.out.print(linkArray[j].dData+" ");
        }
        System.out.print("");
    }
}
