package com.zyj.JavaDatastructureAndArithmetic.ShellSort;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zyj.JavaDatastructureAndArithmetic.R;

/**
 * 希尔排序
 */
public class ShellSortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shell_sort);

        int maxSize=10;
        ArraySh arr;
        arr=new ArraySh(maxSize);
        for (int j=0;j<maxSize;j++){
            long n=(int) (Math.random()*99);
            arr.insert(n);
        }
        arr.display();
        arr.shellSort();
        arr.display();
    }
}
