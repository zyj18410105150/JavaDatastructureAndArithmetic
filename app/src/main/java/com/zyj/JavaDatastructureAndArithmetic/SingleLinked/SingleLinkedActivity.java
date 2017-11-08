package com.zyj.JavaDatastructureAndArithmetic.SingleLinked;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zyj.JavaDatastructureAndArithmetic.R;

/**
 * 单链表
 */
public class SingleLinkedActivity extends AppCompatActivity {
    /**
     * 单链表
     * 单链表是一种链式存取的数据结构，用一组地址任意的存储单元存放线性表中的数据元素。
     * 链表中的数据是以结点来表示的，每个结点的构成：元素(数据元素的映象) + 指针(指示后继元素存储位置)，
     * 元素就是存储数据的存储单元，指针就是连接每个结点的地址数据。
     */

    /**
     * 单链表
     1、链接存储方法
     链接方式存储的线性表简称为链表（Linked List）。
     链表的具体存储表示为：
     ① 用一组任意的存储单元来存放线性表的结点（这组存储单元既可以是连续的，也可以是不连续的）
     ② 链表中结点的逻辑次序和物理次序不一定相同。为了能正确表示结点间的逻辑关系，在存储每个结点值的同时，还必须存储指示其后继结点的地址（或位置）信息（称为指针（pointer）或链(link)）
     注意：
     链式存储是最常用的存储方式之一，它不仅可用来表示线性表，而且可用来表示各种非线性的数据结构。
     */

    /**
     * 2、链表的结点结构
     ┌───┬───┐
     │data │next │
     └───┴───┘
     data域--存放结点值的数据域
     next域--存放结点的直接后继的地址（位置）的指针域（链域）
     注意：
     ①链表通过每个结点的链域将线性表的n个结点按其逻辑顺序链接在一起的。
     ②每个结点只有一个链域的链表称为单链表（Single Linked List）。
     */

    /**
     * 单链表的建立有头插法、尾插法两种方法。
     1．头插法
     单链表是用户不断申请存储单元和改变链接关系而得到的一种特殊数据结构，将链表的左边称为链头，右边称为链尾。头插法建单链表是将链表右端看成固定的，链表不断向左延伸而得到的。头插法最先得到的是尾结点。
     由于链表的长度是随机的，故用一个while循环来控制链表中结点个数。假设每个结点的值都大于O，则循环条件为输入的值大于o。申请存储空间可使用malloc()函数实现，需设立一申请单元指针，但malloc()函数得到的指针并不是指向结构体的指针，需使用强制类型转换，将其转换成结构体型指针。刚开始时，链表还没建立，是一空链表，head指针为NULL。
     链表建立的过程是申请空间、得到数据、建立链接的循环处理过程。
     2．尾插法
     若将链表的左端固定，链表不断向右延伸，这种建立链表的方法称为尾插法。尾插法建立链表时，头指针固定不动，故必须设立一个搜索指针，向链表右边延伸，则整个算法中应设立三个链表指针，即头指针head、搜索指针p2、申请单元指针pl。尾插法最先得到的是头结点。
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_linked);

        /**
         * 创建一个新链表，用insertFirst()方法插入四个新的链结点，并且显示这个链表，
         * 然后在white循环中，用deleteFirst()方法把链表一个一个地删除，直到链表为空
         */
        LinkList theList=new LinkList();

        theList.insertFirst(22,2.99);
        theList.insertFirst(44,4.99);
        theList.insertFirst(66,6.99);
        theList.insertFirst(88,8.99);

        theList.displayList();

        while (!theList.isEmpty()){
            Link aLink=theList.deleteFirst();
            System.out.print("Deleted ");
            aLink.displayLink();
            System.out.print("");
        }
        theList.displayList();
    }

    /**
     * 创建一个链表，插入四个结点，并显示插入后的链表，然后搜索关键字为44的结点，
     * 删除关键字为66的链结点，再次显示链表
     */
    private void LinkList2APP(){
        LinkList theList=new LinkList();

        theList.insertFirst(22,2.99);
        theList.insertFirst(44,4.99);
        theList.insertFirst(66,6.99);
        theList.insertFirst(88,8.99);

        theList.displayList();

        Link f=theList.find(44);
        if (f!=null){
            System.out.print("Found link with key"+f.iData);
        }else{
            System.out.print("Can t find link");
        }

        Link d=theList.deleta(66);
        if (d!=null){
            System.out.print("Deleted link with key"+d.iData);
        }else{
            System.out.print("Can t delete link");
        }
        theList.displayList();
    }
}
