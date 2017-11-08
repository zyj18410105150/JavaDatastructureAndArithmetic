package com.zyj.JavaDatastructureAndArithmetic.Stack;

/**
 * Created by Administrator on 2017-10-31.
 * 匹配分隔符
 */

public class BracketChecker {
    private String input;

    public BracketChecker(String in){
        input=in;
    }

    public void check(){
        int stackSize=input.length();
        Stackz theStack=new Stackz(stackSize);

        for (int j=0;j<input.length();j++){
            char ch=input.charAt(j);
            switch (ch){
                case '{':
                case '[':
                case '(':
                    theStack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!theStack.isEmpty()){
                        char chx=theStack.top();
                        if ((ch=='}'&&chx!='{')||
                            (ch==']'&&chx!='[')||
                            (ch==')'&&chx!='(')){
                            System.out.print("Error:"+ch+"at"+j);
                        }else{
                            System.out.print("Error:"+ch+"at"+j);
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        if (!theStack.isEmpty()){
            System.out.print("Error:missing right delimiter");
        }
    }
}
