package com.zyj.JavaDatastructureAndArithmetic.InsertionSorting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zyj.JavaDatastructureAndArithmetic.R;

/**
 * 插入排序
 */
public class InsertionSortingActivity extends AppCompatActivity {
    /**
     * 大多数情况下，插入排序算法是基本的排序算法中最好的一种，虽然插入排序算法仍然需要O（N²）的时间，
     * 但在一般情况下，他比冒泡排序快一倍，比选择排序快一点，尽管比冒泡排序算法和选择排序算法更麻烦一些，
     * 但他并不是很复杂，经常被用在比较复杂的排序算法的最后阶段
     */

    /**
     * 插入排序的基本思想是：每步将一个待排序的纪录，按其关键码值的大小插入前面已经排序的文件中适当位置上，直到全部插入完为止。
     */

    /**
     * 算法复杂度
     * 如果目标是把n个元素的序列升序排列，那么采用插入排序存在最好情况和最坏情况。最好情况就是，序列已经是升序排列了，在这种情况下，需要进行的比较操作需（n-1）次即可。最坏情况就是，序列是降序排列，那么此时需要进行的比较共有n(n-1)/2次。插入排序的赋值操作是比较操作的次数加上 (n-1）次。平均来说插入排序算法的时间复杂度为O(n^2）。
     * 因而，插入排序不适合对于数据量比较大的排序应用。但是，如果需要排序的数据量很小，例如，量级小于千，那么插入排序还是一个不错的选择。[
     */

    /**
     * 稳定性
     * 插入排序是在一个已经有序的小序列的基础上，一次插入一个元素。当然，刚开始这个有序的小序列只有1个元素，就是第一个元素。比较是从有序序列的末尾开始，也就是想要插入的元素和已经有序的最大者开始比起，如果比它大则直接插入在其后面，否则一直往前找直到找到它该插入的位置。如果碰见一个和插入元素相等的，那么插入元素把想插入的元素放在相等元素的后面。
     * 所以，相等元素的前后顺序没有改变，从原无序序列出去的顺序就是排好序后的顺序，所以插入排序是稳定的
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertion_sorting);

        int maxSize=100;
        ArrayIns arr=new ArrayIns(maxSize);

        arr.insert(66);
        arr.insert(32);
        arr.insert(54);
        arr.insert(65);
        arr.insert(45);
        arr.insert(87);
        arr.insert(98);
        arr.insert(43);
        arr.insert(65);
        arr.insert(76);
        arr.insert(87);
        arr.insert(94);

        arr.display();

        arr.insertionSort();

        arr.display();




    }
}
