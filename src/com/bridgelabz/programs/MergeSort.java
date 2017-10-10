package com.bridgelabz.programs;

public class MergeSort {
	public static int[] array={6,5,4,1};
	public static int[] copy1=new int[4];
	public static int[] copy2=new int[4];
	public static void mergeSort(int[] array,int leftBound,int rightBound) {
		int mid=(leftBound+rightBound)/2;
		if(leftBound<rightBound) {
			
			mergeSort(array, leftBound, mid);
			mergeSort(array, mid+1, rightBound);
			merge(array,leftBound,mid,rightBound);
		}
		
	}
	public static void merge(int[] array,int leftBound,int mid,int rightBound) {
		/*//int innerMidFirst=(leftBound+mid)/2;
		//int innerMidSecond=(mid+1+rightBound)/2;
		for (int i = 0; i < innerMidFirst; i++) {
			copy1[i]=array[i];
		}
		for (int i = 0; i < innerMidFirst; i++) {
			copy1[i]=array[i];
		}*/
		/*int p=leftBound,q=mid+1;
		int k=0;
		 
			
		for (int i = leftBound; i <rightBound; i++) {
			if(p>mid) {
				copy1[k++]=array[q++];
			}
			else if(q>mid) {
				copy1[k++]=array[p++];
			}
			else if(array[p]<array[q])
				copy1[k++]=array[p++];
			else
				copy1[k++]=array[q++];
		}
		for(int i=0;i<k;k++) {
			array[leftBound++]=copy1[i];
		}
		*/
		
	}
	
	public static void main(String[] args) {
		mergeSort(array,0,4);
		
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i]);
	}
	
		
	}

}
