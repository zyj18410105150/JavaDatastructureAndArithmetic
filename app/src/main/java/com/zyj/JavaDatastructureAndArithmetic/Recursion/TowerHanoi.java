package com.zyj.JavaDatastructureAndArithmetic.Recursion;

/**
 * Created by Administrator on 2017-11-9.
 * 汉诺塔
 */

public class TowerHanoi {
    static int nDisks=3;

    public static void main(String[] args){
        doTowers(nDisks,'A','B','C');
    }

    public static void doTowers(int topN,char form,char inter, char to){
        if (topN==1){
            System.out.print("Disk 1 form"+form+"to"+to);
        }else{
            doTowers(topN-1,form,to,inter);
            System.out.print("Disk"+topN+"form"+form+"to"+to);
            doTowers(topN-1,inter,form,to);
        }
    }
}
