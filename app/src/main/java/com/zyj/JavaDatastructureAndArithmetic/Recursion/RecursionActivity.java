package com.zyj.JavaDatastructureAndArithmetic.Recursion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zyj.JavaDatastructureAndArithmetic.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 递归
 */
public class RecursionActivity extends AppCompatActivity {
    /**
     * 递归特征：
     * 调用自身。
     * 当他调用自身的时候，他这样做是为了解决更小的问题
     * 存在某个足够简单的问题的层次，在这一层算法不需要调用自己就可以直接解答，
     * 且返回结果
     *
     * 消除递归
     * 一些有趣的递归应用
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recursion);
    }


}
