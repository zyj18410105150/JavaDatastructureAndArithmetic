package com.zyj.JavaDatastructureAndArithmetic.SelectionSort;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zyj.JavaDatastructureAndArithmetic.R;
import com.zyj.JavaDatastructureAndArithmetic.databinding.ActivitySelectionSortBinding;

/**
 * 选择排序
 */
public class SelectionSortActivity extends AppCompatActivity {

    /**
     * 选择排序的基本思想是：每一趟在n-i+1（i=1，2，…n-1）个记录中选取关键字最小的记录作为有序序列中第i个记录。基于此思想的算法主要有简单选择排序、树型选择排序和堆排序。[1]
     简单选择排序的基本思想：第1趟，在待排序记录r[1]~r[n]中选出最小的记录，将它与r[1]交换；第2趟，在待排序记录r[2]~r[n]中选出最小的记录，将它与r[2]交换；以此类推，第i趟在待排序记录r[i]~r[n]中选出最小的记录，将它与r[i]交换，使有序序列不断增长直到全部排序完毕。
     以下为简单选择排序的存储状态，其中大括号内为无序区，大括号外为有序序列：
     初始序列：{49 27 65 97 76 12 38}
     　　第1趟：12与49交换：12{27 65 97 76 49 38}
     　　第2趟：27不动　：12 27{65 97 76 49 38}
     　　第3趟：65与38交换：12 27 38{97 76 49 65}
     　　第4趟：97与49交换：12 27 38 49{76 97 65}
     　　第5趟：76与65交换：12 27 38 49 65{97 76}
     　　第6趟：97与76交换：12 27 38 49 65 76 97 完成
     */

    /**
     * 简单选择排序算法分析：在简单选择排序过程中，所需移动记录的次数比较少。
     * 最好情况下，即待排序记录初始状态就已经是正序排列了，则不需要移动记录。
     * 最坏情况下，需要移动记录的次数最多为3（n-1）（此情况中待排序记录并非完全逆序，给完全逆序记录排序的移动次数应为(n/2)*3，其中n/2向下取整）。
     * 简单选择排序过程中需要进行的比较次数与初始状态下待排序的记录序列的排列情况无关。
     * 当i=1时，需进行n-1次比较；当i=2时，需进行n-2次比较；依次类推，共需要进行的比较次数是∑ =(n-1)+(n-2)+…+2+1=n(n-1)/2，即进行比较操作的时间复杂度为O(n2)。
     在讲选择排序法之前我们先来了解一下定位比较交换法。
     为了便于理解，设有10个数分别存在数组元素a[0]～a[9]中。
     定位比较交换法是由大到小依次定位a[0]～a[9]中恰当的值（和武林大会中的比武差不多），a[9]中放的自然是最小的数。
     如定位a[0],先假定a[0]中当前值是最大数，a[0]与后面的元素一一比较，如果a[4]更大，则将a[0]、a[4]交换，a[0]已更新再与后面的a[5]～a[9]比较，如果a[8]还要大，则将a[0]、a[8]交换，a[0]又是新数，再与a[9]比较。
     一轮比完以后，a[0]就是最大的数了，本次比武的武状元诞生了，接下来从a[1]开始，因为状元要休息了，再来一轮a[1]就是次大的数，也就是榜眼，然后从a[2]开始，比出探花，真成比武大会了，当比到a[8]以后，排序就完成了。
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySelectionSortBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_selection_sort);

        int maxSize=100;
        ArraySel arr;
        arr=new ArraySel(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(45);
        arr.insert(12);
        arr.insert(34);
        arr.insert(55);

        StringBuffer sb=new StringBuffer();
        for (int i=0;i<arr.display().length;i++){
            sb.append(arr.display()[i]+" ");
        }
        binding.textView.setText(sb);

        arr.selectionSort();

        StringBuffer sb2=new StringBuffer();
        for (int i=0;i<arr.display().length;i++){
            sb2.append(arr.display()[i]+" ");
        }
        binding.textView2.setText(sb2);
    }
}
