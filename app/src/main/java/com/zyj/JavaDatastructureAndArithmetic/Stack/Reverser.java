package com.zyj.JavaDatastructureAndArithmetic.Stack;

/**
 * Created by Administrator on 2017-10-31.
 * 字符反转
 */

public class Reverser {
    private String input;
    private String output;

    public Reverser(String in){
        input=in;
    }

    public String doRew(){
        int stackSize=input.length();
        Stacky theStack=new Stacky(stackSize);

        for (int j=0;j<input.length();j++){
            char ch=input.charAt(j);
            theStack.push(ch);
        }
        output="";
        while (!theStack.isEmpty()){
            char ch=theStack.top();
            output=output+ch;
        }
        return output;
    }
}
