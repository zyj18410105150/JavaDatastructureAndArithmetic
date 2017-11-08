package com.zyj.JavaDatastructureAndArithmetic.Queue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zyj.JavaDatastructureAndArithmetic.R;

/**
 * 队列
 */
public class QueueActivity extends AppCompatActivity {
    /**
     * 简介
     队列是一种特殊的线性表，特殊之处在于它只允许在表的前端（front）进行删除操作，而在表的后端（rear）进行插入操作，和栈一样，队列是一种操作受限制的线性表。进行插入操作的端称为队尾，进行删除操作的端称为队头。队列中没有元素时，称为空队列。
     队列的数据元素又称为队列元素。在队列中插入一个队列元素称为入队，从队列中删除一个队列元素称为出队。因为队列只允许在一端插入，在另一端删除，所以只有最早进入队列的元素才能最先从队列中删除，故队列又称为先进先出（FIFO—first in first out）线性表。[1]
     */

    /**
     * 队列的效率：和栈一样，队列中插入数据项和移除数据项的时间复杂度都是O(1)
     */
    /**
     * 双端队列就是一个两端都是结尾的队列。队列的每一端都可以插入数据项和移除数据项。
     * 可以叫做insertLeft()和insertRight(),以及removeLeft()和removeRight()
     * 如果严格禁止调用insertLeft()和removeLeft()方法（或禁用右端的操作），双端队列功能就和
     * 栈一样，禁止调用insertLeft()和removeRight()方法（或相反的另一个方法），他的功能就和队列一样
     */

    /**
     * 双端队列和队列的区别：双端队列与栈或队列相比，是一种多用途的数据结构，在容器类库中有时
     * 会用双端队列来提供栈和队列的两种功能，但是，双端队列不像栈和队列那么常用。
     */

    /**
     * 队列是一种数据结构，类似于栈，只是在队列中第一个插入的数据项也会第一个被移除
     * 而在栈中，最后插入的数据项最先移除
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue);

        Queue theQueue=new Queue(5);
        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);

        theQueue.remove();
        theQueue.remove();
        theQueue.remove();

        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);

        while (!theQueue.isEmpty()){
            long n=theQueue.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.print("");
    }

    /**
     * 使用链表实现队列
     * 创建一个队列，插入两个元素，在插入两个元素，然后删掉两个元素
     * 每一步做完后显示队列
     */
    private void LinkQueueApp(){
        LinkQueue theQueue=new LinkQueue();
        theQueue.insert(20);
        theQueue.insert(40);

        theQueue.displayQueue();

        theQueue.insert(60);
        theQueue.insert(80);

        theQueue.displayQueue();

        theQueue.remove();
        theQueue.remove();

        theQueue.displayQueue();
    }
}
