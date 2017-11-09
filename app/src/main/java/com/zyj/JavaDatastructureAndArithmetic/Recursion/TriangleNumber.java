package com.zyj.JavaDatastructureAndArithmetic.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2017-11-9.
 * 三角数字
 */

public class TriangleNumber {
    static int theNumber;
    /**
     * 三角数字
     */
    private static void main(String[] args) throws IOException {
        System.out.print("Enter a number: ");
        theNumber=getInt();
        int theAnswer=triangle(theNumber);
        System.out.print("Triangle="+theAnswer);
    }

    public static int triangle(int n){
        if (n==1){
            return 1;
        }else{
            return (n+triangle(n-1));
        }
    }

    private static int getInt()throws IOException{
        String s=getString();
        return Integer.parseInt(s);
    }

    private static String getString()throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String s=br.readLine();
        return s;
    }
}
