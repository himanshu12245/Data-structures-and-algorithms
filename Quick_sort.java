
import java.util.*;
import java.lang.*;
import java.io.*;
class quick
{
	public static void main (String[] args) 
	{
	int[]arr={6,10,13,5,8,3,2,1};
	quick_sort(arr,0,arr.length-1);
	display(arr);
	}
/* We need to partition the array such that the elements larger than pivot element are on left side of pivot and the elements 
which are smaller than the pivot element are on right side*/
	public static int partition(int[]arr,int p,int q){
	    int pivot=arr[p];
	    int i=p;
	    for(int j=p+1;j<=q;j++){
	        if(arr[j]<=pivot){
	            i=i+1;
	           int temp=arr[i];
	           arr[i]=arr[j];
	           arr[j]=temp;
	        }
	    }
	   int temp=arr[i];
	   arr[i]=pivot;
	   pivot=temp;
	    return i;
	}
		
/* This is a recursive function which recursively partition the subarrays (right subarray and left subarray),we can
think of it as merge sort (divide and conquer) but it is bit different than merge_sort.*/
  	
	public static void quick_sort(int[]arr,int p,int q){
	    if(p<q){
	        int pi=partition(arr,p,q);
	        quick_sort(arr,p,pi-1);
	        quick_sort(arr,pi+1,q);
	    }
	}
// Display the array
	public static void display(int[]arr){ 
	    for(int val:arr){
	        System.out.println(val);
	    }
	}
}
