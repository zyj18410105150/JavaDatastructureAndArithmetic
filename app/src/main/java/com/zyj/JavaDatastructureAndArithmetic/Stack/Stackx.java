package com.zyj.JavaDatastructureAndArithmetic.Stack;

/**
 * Created by Administrator on 2017-10-31.
 */

public class Stackx {
    private int maxSize;
    private long[] stackArray;
    private int top;

    /**
     * 根据参数创建一个新栈，如果使用链表，就不需要先规定栈的容量
     * @param s
     */
    public Stackx(int s){
        maxSize=s;
        stackArray=new long[maxSize];
        top=1;
    }

    /**
     * 将top值增加1，使他指向原顶端数据项上面的一个位置，并在这个位置上存储一个数据项，top实在插入数据项之前递减的
     * @param j
     */
    public void push(long j){
        stackArray[++top]=j;
    }

    /**
     *
     * @return
     */
    public long top(){
        return stackArray[top--];
    }

    /**
     * 返回top所指的数据项的值，部队栈做任何改动
     * @return
     */
    public long peek(){
        return stackArray[top];
    }

    /**
     * 判断栈是不是空，栈空时top变量为-1
     * @return
     */
    public boolean isEmpty(){
        return (top==-1);
    }

    /**
     * 判断栈是不是已经满了，栈满时top变量为maxSize-1
     * @return
     */
    public boolean isFull(){
        return (top == maxSize-1);
    }

}
