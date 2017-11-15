package com.zyj.JavaDatastructureAndArithmetic.Divide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zyj.JavaDatastructureAndArithmetic.R;

/**
 * 划分
 */
public class DivideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divide);

        int maxSize=16;
        ArrayPar arr;
        arr=new ArrayPar(maxSize);

        for (int j=0;j<maxSize;j++){
            long n=(int)(Math.random()*199);
            arr.insert(n);
        }
        arr.display();

        long pivot=99;
        System.out.print("Pivot is"+pivot);
        int size=arr.size();

        int partDex=arr.partitionIt(0,size-1,pivot);

        System.out.println(",Partition is at index"+partDex);
        arr.display();
    }
}
