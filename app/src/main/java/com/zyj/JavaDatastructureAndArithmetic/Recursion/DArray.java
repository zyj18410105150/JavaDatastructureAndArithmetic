package com.zyj.JavaDatastructureAndArithmetic.Recursion;

/**
 * Created by Administrator on 2017-11-9.
 */

public class DArray {
    private long[] theArray;
    private int nElems;

    public DArray(int max){
        theArray=new long[max];
        nElems=0;
    }

    public void insert(long value){
        theArray[nElems] = value;
        nElems++;
    }

    public void display(){
        for (int j=0;j<nElems;j++){
            System.out.print(theArray[j]+" ");
        }
        System.out.print("");
    }

    public void mergeSort(){
        long[] workSpace=new long[nElems];
        recMergeSort(workSpace,0,nElems);
    }

    private void recMergeSort(long[] workSpace,int lowerBound,int upperBound){
        if (lowerBound==upperBound){
            return;
        }else{
            int mid=(lowerBound+upperBound)/2;
            recMergeSort(workSpace,lowerBound,mid);
            recMergeSort(workSpace,mid,upperBound);

            merge(workSpace,lowerBound,mid+1,upperBound);
        }
    }

    private void merge(long[] workSpace,int lowPtr,int heighPtr,int upperBound){
        int j=0;
        int lowerBound=lowPtr;
        int mid=heighPtr-1;
        int n=upperBound-lowerBound;

        while (lowPtr<=mid&&heighPtr<=upperBound){
            if (theArray[lowPtr]<theArray[heighPtr]){
                workSpace[j++]=theArray[lowPtr++];
            }else{
                workSpace[j++]=theArray[heighPtr++];
            }
        }

        while (lowPtr<=mid){
            workSpace[j++]=theArray[lowPtr++];
        }
        while (heighPtr<=upperBound){
            workSpace[j++]=theArray[heighPtr++];
        }
        for (j=0;j<n;j++){
            theArray[lowerBound+j]=workSpace[j];
        }
    }
}
