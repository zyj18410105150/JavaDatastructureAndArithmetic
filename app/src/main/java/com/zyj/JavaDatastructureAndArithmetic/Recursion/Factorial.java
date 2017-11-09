package com.zyj.JavaDatastructureAndArithmetic.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2017-11-9.
 * 阶乘
 * 数字                 计算                       阶乘
 * 0                    自定义                      1
 * 1                    1*1                         1
 * 2                    2*1                         2
 * 3                    3*2                         6
 * 4                    4*6                         24
 * 5                    5*24                        120
 * 6                    6*120                       720
 * 7                    7*720                       5040
 * 8                    8*5040                      40320
 * 9                    9*40320                     362880
 */

public class Factorial {
    static int theNumber;
    /**
     * 三角数字
     */
    private static void main(String[] args) throws IOException {
        System.out.print("Enter a number: ");
        theNumber=getInt();
        int theAnswer=factorial(theNumber);
        System.out.print("Triangle="+theAnswer);
    }

    public static int factorial(int n){
        if (n==0){
            return 1;
        }else{
            return (n*factorial(n-1));
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
