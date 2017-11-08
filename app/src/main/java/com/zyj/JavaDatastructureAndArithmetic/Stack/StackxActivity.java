package com.zyj.JavaDatastructureAndArithmetic.Stack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zyj.JavaDatastructureAndArithmetic.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 栈
 */
public class StackxActivity extends AppCompatActivity {
    /**
     * 栈的概念
     * 栈（stack）又名堆栈，它是一种运算受限的线性表。其限制是仅允许在表的一端进行插入和删除运算。这一端被称为栈顶，相对地，把另一端称为栈底。向一个栈插入新元素又称作进栈、入栈或压栈，它是把新元素放到栈顶元素的上面，使之成为新的栈顶元素；从一个栈删除元素又称作出栈或退栈，它是把栈顶元素删除掉，使其相邻的元素成为新的栈顶元素。
     */
    /**
     * 栈的定义
     * 栈是限定仅在表头进行插入和删除操作的线性表。要搞清楚这个概念，首先要明白”栈“原来的意思，如此才能把握本质。"栈“者,存储货物或供旅客住宿的地方,可引申为仓库、中转站，所以引入到计算机领域里，就是指数据暂时存储的地方，所以才有进栈、出栈的说法。
     */

    /**
     * 栈显示数据的顺序和输入的顺序相反，因为最后入栈的数据最先弹出
     */

    /**
     * 栈的效率
     * Stackx类中实现的栈，数据项入栈和出栈的时间复杂度都为常数O(1)，这也就是说，栈操作所耗
     * 的时间不依赖于栈中数据项的个数，因此操作时间很短，栈不需要比较和移动操作
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stackx);

        Stackx theStack=new Stackx(10);

        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        while (!theStack.isEmpty()){
            long value=theStack.top();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.print("");
    }


    /**
     * 小例子：字符反转
     * 由用户输入一个字符串，创建Reverser对象，字符串作为一个参数传给构造方法，
     * 然后调用这个对象的doRew()方法，并显示返回值
     *
     * 该类的关键组成部分是doRew()方法，该方法利用栈实现倒置操作
     */
    private void inversion() throws IOException {
        String input,output;
        while (true){
            System.out.print("Enter a string:");
            System.out.flush();

            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            String s=br.readLine();
            input=s;
            if (input.equals("")){
                break;
            }
            Reverser reverser=new Reverser(input);
            output=reverser.doRew();
            System.out.print("reverser:"+output);
        }
    }

    /**
     * 小例子：分隔符匹配
     */
    private void separatorMatch() throws IOException {
        String input;
        while (true){
            System.out.print("Enter string containing delimiters:");
            System.out.flush();

            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            String s=br.readLine();

            input=s;
            if (input.equals("")){
                break;
            }
            BracketChecker theChecker=new BracketChecker(input);
            theChecker.check();
        }
    }

    /**
     * 使用链表实现栈
     * 创建一个栈对象，压入两个元素，显示这个栈，又压入两个元素，再次显示。
     * 最后，弹出两个元素，再次展示
     */
    private void linkStackApp(){
        LinkStack theStack=new LinkStack();
        theStack.push(20);
        theStack.push(40);

        theStack.displayStack();

        theStack.push(60);
        theStack.push(80);

        theStack.displayStack();

        theStack.pop();
        theStack.pop();

        theStack.displayStack();
    }
}
