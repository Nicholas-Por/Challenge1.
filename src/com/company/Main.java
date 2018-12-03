package com.company;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {

        Array(10000);
        IntMerge(int[] Array; int left; int mid; int right; int[] temp;);
    }
    public static int[] Array(int num)
    {
        int Array[] = new int[num];
        for(int i = 0; i <= num;i++)
        {
            Array[i] = (int)(Math.random()*10);
        }
        return Array;
    }
   int i; //left
   int j; //middle
   int k; //also left to track number placement
    int right;
    public static void IntMerge(int[] Array, int left, int mid,int right, int[] temp){
        int i = left;
        int j = mid + 1;
        int k = left;

        while( i <= mid && j <= right){
            if(Array[i] <=(Array[j]))
            {
                temp[k] = Array[i];
                i++;
            }else{
                temp[k] = Array[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            temp[k] = Array[i];
            i++;
            k++;
        }
        while(j <= right){
            temp[k] = Array[j];
            j++;
            k++;
        }
        for(k = left; k <= right; k++){
            Array[k] = temp[k];
        }
    }

//public void merge(int[] arr, int left, int mid, int right, int[] temp)
////declare three index variables
//// i set to left, j set to middle + 1 and  k set to left again to track where we are placing numbers
////loop while i  is less than or equal to middle, and j is less than or equal to right
//	//if array element i is less than array element j place the element i in position k in temp, increment i
//	//else place array element j in position k in temp, increment j
//	//increment k
////loop while i is less than or equal to middle
//	//place element i in position k in temp, increment i and k
////loop while j is less than or equal to right
//	//place element j in position k in temp, increment j and k
////copy all elements from left to right in temp into arr
}