package com.zyj.JavaDatastructureAndArithmetic;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.zyj.JavaDatastructureAndArithmetic.BubbleSort.BubbleSortActivity;
import com.zyj.JavaDatastructureAndArithmetic.DoubleEnd.DoubleEndActivity;
import com.zyj.JavaDatastructureAndArithmetic.DoubleLinkedList.DoubleLinkedListActivity;
import com.zyj.JavaDatastructureAndArithmetic.InsertionSorting.InsertionSortingActivity;
import com.zyj.JavaDatastructureAndArithmetic.Iterator.IteratorActivity;
import com.zyj.JavaDatastructureAndArithmetic.ObjectSort.ObjectSortActivity;
import com.zyj.JavaDatastructureAndArithmetic.PriorityQueue.PriorityQueueActivity;
import com.zyj.JavaDatastructureAndArithmetic.Queue.QueueActivity;
import com.zyj.JavaDatastructureAndArithmetic.SelectionSort.SelectionSortActivity;
import com.zyj.JavaDatastructureAndArithmetic.SingleLinked.SingleLinkedActivity;
import com.zyj.JavaDatastructureAndArithmetic.Stack.StackxActivity;
import com.zyj.JavaDatastructureAndArithmetic.WellAlignedLinked.WellAlignedActivity;
import com.zyj.JavaDatastructureAndArithmetic.databinding.ActivityMainBinding;

/**
 * java数据结构和算法
 */
public class MainActivity extends AppCompatActivity {

    /**
     * 数据结构的特点
     *
     * 数据结构         优点                                                          缺点
     * 数组             插入快，如果知道下标，可以非常快的存取                       查找慢，删除慢，大小固定
     * 有序数组         比无序的数组查找快                                           删除和插入慢，大小固定
     * 栈               提供后进先出方式存取                                         存取其他项很慢
     * 队列             提供先进先出方式存取                                         存取其他项很慢
     * 链表             插入块，删除快                                               查找慢
     * 二叉树           查找，插入，删除都快（树保持平衡）                           删除算法复杂
     * 红-黑树          查找，插入，删除都快，树总是平衡的                           算法复杂
     * 2-3-4树          查找，插入，删除都快，树总是平衡的，类似的树堆磁盘存储有用   算法复杂
     * 哈希表           如果关键字已知则存取极快，插入快                             删除慢，如果不知道关键字则存取很慢，对存储空间使用不充分
     * 堆               插入，删除快，对最大数据项的存取很快                         对其他数据项存取慢
     * 图               对现实世界建模                                               有些算法慢且复杂
     */

    /**
     * 栈，队列和优先级队列是比数组和其他数据存储结构更为抽象的结构，
     * 主要通过接口堆栈，队列和优先级队列进行定义，这些接口表明通过他们可以完成的操作，
     * 而他们的主要实现机制对用户来说是不可见的
     *
     * 栈的主要机制可以用数组来实现，也可以用链表来实现
     * 优先级队列的内部时间可以用数组或一种特别的树--堆来实现
     */

    /**
     * 栈只允许访问一个数据项，即最后插入的数据项。移除这个数据项后才能访问倒数第二个插入的数据项，以此类推
     * 栈也是那些应用了相当复杂的数据结构算法的便利工具，用栈来辅助便利树的节点，用栈来辅助查找图的顶点等
     */

    /**
     * 链表的效率
     * 在表头插入和删除速度很快，仅需要改变一两个引用值，所以花费O(1)的时间
     * 平均起来，查找、删除和在指定链结点后面插入都需要搜索链表中的一般链结点。
     * 需要O(N)次比较。在数组中执行这些操作也要O(N)次比较，但是链表仍然要快一些，因为当插入和删除链结点时，
     * 链表不需要移动任何东西。增加的效率是很明显的，特别是当复制时间远远大于比较时间的时候
     *
     * 当然，链表比数组优越的另一个重要方面是链表需要多少内存就可以用多少内存，并且可以扩展到所有可用内存。
     * 数组的大小在创建时就固定了；所以经常有序数组太大导致效率低下，或者数组太小导致空间溢出。
     * 向量是一种可扩展的数组，他可以通过可变长度解决这个问题，但是他经常只允许以固定大小的增量扩展。
     * 这个解决方案在内存使用效率上来说还是比链表低
     */
    String [] data=new String[]{"简单排序算法","冒泡排序","选择排序","插入排序","对象排序",
            "栈和队列","栈","队列","优先级队列",
            "链表","单链表","双端链表","有序链表","双向链表","迭代器链表",
            "递归"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.listView.setAdapter(new MainAdapter(data,MainActivity.this));

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Toast.makeText(MainActivity.this, "简单排序算法", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, BubbleSortActivity.class));//冒泡排序
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, SelectionSortActivity.class));//选择排序
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this, InsertionSortingActivity.class));//插入排序
                        break;
                    case 4:
                        startActivity(new Intent(MainActivity.this, ObjectSortActivity.class));//对象排序
                        break;

                    case 5:
                        Toast.makeText(MainActivity.this, "栈和队列", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        startActivity(new Intent(MainActivity.this, StackxActivity.class));//栈
                        break;
                    case 7:
                        startActivity(new Intent(MainActivity.this, QueueActivity.class));//队列
                        break;
                    case 8:
                        startActivity(new Intent(MainActivity.this, PriorityQueueActivity.class));//优先级队列
                        break;

                    case 9:
                        Toast.makeText(MainActivity.this, "链表", Toast.LENGTH_SHORT).show();
                        break;
                    case 10://单链表
                        startActivity(new Intent(MainActivity.this,SingleLinkedActivity.class));
                        break;
                    case 11://双端链表
                        startActivity(new Intent(MainActivity.this, DoubleEndActivity.class));
                        break;
                    case 12://有序链表
                        startActivity(new Intent(MainActivity.this, WellAlignedActivity.class));
                        break;
                    case 13://双向链表
                        startActivity(new Intent(MainActivity.this, DoubleLinkedListActivity.class));
                        break;
                    case 14://迭代器链表
                        startActivity(new Intent(MainActivity.this, IteratorActivity.class));
                        break;

                    case 15://递归
                        Toast.makeText(MainActivity.this, "递归", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
