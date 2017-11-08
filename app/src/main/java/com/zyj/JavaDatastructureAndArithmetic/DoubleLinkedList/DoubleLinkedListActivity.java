package com.zyj.JavaDatastructureAndArithmetic.DoubleLinkedList;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zyj.JavaDatastructureAndArithmetic.R;

/**
 * 双向链表
 */
public class DoubleLinkedListActivity extends AppCompatActivity {
    /**
     * 双向链表
     * 双向链表也叫双链表，是链表的一种，它的每个数据结点中都有两个指针，分别指向直接后继和直接前驱。
     * 所以，从双向链表中的任意一个结点开始，都可以很方便地访问它的前驱结点和后继结点。
     * 一般我们都构造双向循环链表。
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double_linked_list);

        DoublyLinkedList theList=new DoublyLinkedList();

        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);

        theList.insertLast(11);
        theList.insertLast(33);
        theList.insertLast(55);

        theList.displayForward();
        theList.displayBackward();

        theList.deleteFirst();
        theList.deleteLast();
        theList.deleteKey(11);

        theList.displayForward();

        theList.insertAfter(22,77);
        theList.insertAfter(33,88);

        theList.displayForward();
    }
}
