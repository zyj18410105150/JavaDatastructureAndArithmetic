package com.zyj.JavaDatastructureAndArithmetic.PriorityQueue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zyj.JavaDatastructureAndArithmetic.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 优先级队列
 */
public class PriorityQueueActivity extends AppCompatActivity {
    /**
     * 优先队列(priority queue)定义
     * 优先级队列 是不同于先进先出队列的另一种队列
     普通的队列是一种先进先出的数据结构，元素在队列尾追加，而从队列头删除。
     在优先队列中，元素被赋予优先级。当访问元素时，具有最高优先级的元素最先删除。
     优先队列具有最高级先出 （first in, largest out）的行为特征。
     */
    /**
     * 优先队列效率
     * 插入操作需要O(N)的时间，而删除操作需要O(1)的时间
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_priority_queue);

        PriorityQueue thePQ=new PriorityQueue(5);
        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);

        while (!thePQ.isEmpty()){
            long item=thePQ.remove();
            System.out.print(item+" ");
        }
        System.out.print("");
    }


    /**
     * 小例子：解析算数表达式
     * 中缀表达式转换成后缀表达式
     */
    public void Infix() throws IOException {
        String input,output;
        while (true){
            System.out.print("Enter infix:");
            System.out.flush();

            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            String s=br.readLine();
            input=s;
            if (input.equals("")){
                break;
            }
            InToPost theTrans=new InToPost(input);
            output=theTrans.doTrans();
            System.out.print("Postfix is"+output+"\n");
        }
    }

    /**
     * 后缀表达式求值
     */
    public void evaluation() throws IOException {
        String input;
        int output;
        while (true){
            System.out.print("Enter postfix:");
            System.out.flush();

            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            String s=br.readLine();
            input=s;
            if (input.equals("")){
                break;
            }
            ParsePost parsePost=new ParsePost(input);
            output=parsePost.doParse();
            System.out.print("Evaluates to "+output);
        }
    }
}
