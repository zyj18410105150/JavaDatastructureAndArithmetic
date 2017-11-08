package com.zyj.JavaDatastructureAndArithmetic.Iterator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zyj.JavaDatastructureAndArithmetic.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 迭代器链表
 */
public class IteratorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iterator);

        try {
            InterIterApp();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void InterIterApp() throws IOException{
        LinkList theList=new LinkList();
        ListIterator iter1=theList.getIterator();
        long value;

        iter1.insertAfter(20);
        iter1.insertAfter(40);
        iter1.insertAfter(80);
        iter1.insertBefore(60);

        while (true){
            System.out.print("Enter first letter of show,reset, ");
            System.out.print("next,get,before,after,delete:");
            System.out.flush();
            int choice=getChar();
            switch (choice){
                case 's':
                    if (!theList.isEmpty()){
                        theList.displayList();
                    }else{
                        System.out.print("List is empty");
                    }
                    break;
                case 'r':
                    iter1.reset();
                    break;
                case 'n':
                    if (!theList.isEmpty()&&iter1.atEnd()){
                        iter1.nextLink();
                    }else{
                        System.out.print("Can t go to next link");
                    }
                    break;
                case 'g':
                    if (!theList.isEmpty()){
                        value=iter1.getCurrent().dData;
                        System.out.print("Retruned "+value);
                    }else{
                        System.out.print("List is empty");
                    }
                    break;
                case 'b':
                    System.out.print("Enter value to insert: ");
                    System.out.flush();
                    value=getInt();
                    iter1.insertBefore(value);
                    break;
                case 'a':
                    System.out.print("Enter value to insert: ");
                    System.out.flush();
                    value=getInt();
                    iter1.insertAfter(value);
                    break;
                case 'd':
                    if (!theList.isEmpty()){
                        value=iter1.deleteCurrent();
                        System.out.print("Deleted "+value);
                    }else{
                        System.out.print("Can t delete");
                    }
                    break;
                default:
                    System.out.print("Invalid entry");
                    break;
            }
        }
    }

    public String getString() throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String s=br.readLine();
        return s;
    }

    public char getChar() throws IOException {
        String s=getString();
        return s.charAt(0);
    }

    public int getInt() throws IOException {
        String s=getString();
        return Integer.parseInt(s);
    }
}
