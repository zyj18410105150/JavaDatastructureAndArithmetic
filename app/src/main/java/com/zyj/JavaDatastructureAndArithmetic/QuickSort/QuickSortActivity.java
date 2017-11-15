package com.zyj.JavaDatastructureAndArithmetic.QuickSort;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zyj.JavaDatastructureAndArithmetic.R;

/**
 * 快速排序
 */
public class QuickSortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_sort);


    }

    private void quickSort(){
        int maxSize=16;
        ArrayIns arr;
        arr=new ArrayIns(maxSize);

        for (int j=0;j<maxSize;j++){
            long n=(int)(Math.random()*99);
            arr.insert(n);
        }
        arr.display();
        arr.quickSort();
        arr.display();
    }

    private void quickSort2(){
        int maxSize=16;
        ArrayIns2 arr;
        arr=new ArrayIns2(maxSize);

        for (int j=0;j<maxSize;j++){
            long n=(int)(Math.random()*99);
            arr.insert(n);
        }
        arr.display();
        arr.quickSort();
        arr.display();
    }

    private void quickSort3(){
        int maxSize=16;
        ArrayIns3 arr;
        arr=new ArrayIns3(maxSize);
        for (int j=0;j<maxSize;j++){
            long n=(int)(Math.random()*99);
            arr.insert(n);
        }
        arr.display();
        arr.quickSort();
        arr.display();
    }
}
