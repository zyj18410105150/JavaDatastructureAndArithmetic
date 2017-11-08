package com.zyj.JavaDatastructureAndArithmetic.ObjectSort;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zyj.JavaDatastructureAndArithmetic.R;

/**
 * 对象排序
 */
public class ObjectSortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_sort);

        int maxSize=100;
        ArrayInOb arr=new ArrayInOb(maxSize);

        arr.insert("Evans","Patty",23);
        arr.insert("Smith","Doc",14);
        arr.insert("Smith","Lorraine",34);
        arr.insert("Smith","Paul",77);
        arr.insert("Yee","Tom",54);
        arr.insert("Hashimoto","Hanry",43);
        arr.insert("vang","Minh",23);

        arr.display();

        arr.insertionSort();

        arr.display();

    }
}
