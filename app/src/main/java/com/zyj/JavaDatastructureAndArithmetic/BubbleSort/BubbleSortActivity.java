package com.zyj.JavaDatastructureAndArithmetic.BubbleSort;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zyj.JavaDatastructureAndArithmetic.R;
import com.zyj.JavaDatastructureAndArithmetic.databinding.ActivityBubbleSortBinding;

/**
 * 冒泡排序
 * 冒泡排序算法运行起来非常慢，但在概念上它是排序算法中最简单的
 */
public class BubbleSortActivity extends AppCompatActivity {

    /**
     * 冒泡排序（Bubble Sort），是一种计算机科学领域的较简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来。走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
     */

    /**
     *  算法原理
     *
     *  冒泡排序算法的运作如下：（从后往前）
     *  比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     *  对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
     *  针对所有的元素重复以上的步骤，除了最后一个。
     *  持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较
     */

    /**
     * 算法分析
     *
     *  时间复杂度
     若文件的初始状态是正序的，一趟扫描即可完成排序。所需的关键字比较次数  和记录移动次数  均达到最小值：  ，  。
     所以，冒泡排序最好的时间复杂度为  。
     　　若初始文件是反序的，需要进行  趟排序。每趟排序要进行  次关键字的比较(1≤i≤n-1)，且每次比较都必须移动记录三次来达到交换记录位置。在这种情况下，比较和移动次数均达到最大值：
     图片1位置
     图片2位置
     冒泡排序的最坏时间复杂度为  。
     综上，因此冒泡排序总的平均时间复杂度为 图片2位置 。
     */

    /**
     *
     * 算法稳定性
     冒泡排序就是把小的元素往前调或者把大的元素往后调。比较是相邻的两个元素比较，交换也发生在这两个元素之间。所以，如果两个元素相等，我想你是不会再无聊地把他们俩交换一下的；如果两个相等的元素没有相邻，那么即使通过前面的两两交换把两个相邻起来，这时候也不会交换，所以相同元素的前后顺序并没有改变，所以冒泡排序是一种稳定排序算法。
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBubbleSortBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_bubble_sort);

        int maxSize=100;
        ArrayBub arr=new ArrayBub(maxSize);

        arr.insert(77);
        arr.insert(33);
        arr.insert(55);
        arr.insert(23);
        arr.insert(85);
        arr.insert(98);
        arr.insert(56);

        StringBuffer sb=new StringBuffer();
        for (int i=0;i<arr.display().length;i++){
            sb.append(arr.display()[i]+" ");
        }
        binding.textView.setText(sb);

        arr.bubbleSort();

        StringBuffer sb2=new StringBuffer();
        for (int i=0;i<arr.display().length;i++){
            sb2.append(arr.display()[i]+" ");
        }
        binding.textView2.setText(sb2);
    }

    public static void main(String [] arg){

    }
}
