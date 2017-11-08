package com.zyj.JavaDatastructureAndArithmetic.DoubleEnd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zyj.JavaDatastructureAndArithmetic.R;

/**
 * 双端链表
 */
public class DoubleEndActivity extends AppCompatActivity {
    /**
     * 双端链表与传统的链表非常相似，但是他有一个新增的特性：对最后一个链结点的引用，
     * 就像对第一个链结点的引用一样
     */

    /**
     *     对最后一个链结点的引用允许像在表头一样，在表尾直接插入一个链结点，仍然可以在普通的单链表
     * 的表尾插入一个链结点，方法是遍历整个链表直到到达表尾，但是这种方法效率很低
     *     像访问表头一样访问表尾的特性，使双端链表更适合于一些普通链表不方便操作的场合，
     * 队列的实现就是这样的情况
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double_end);

        FirstLastList theList=new FirstLastList();
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);

        theList.insertLast(11);
        theList.insertLast(33);
        theList.insertLast(55);

        theList.displayList();

        theList.deleteFirst();
        theList.deleteFirst();
        theList.displayList();
    }
}
