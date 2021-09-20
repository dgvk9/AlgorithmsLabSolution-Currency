package com.greatlearning.service;

public class SortTransaction {
	
	private int [] merge(int [] L, int [] R) {
		
		int [] A = new int[L.length + R.length];
		
		int nL = L.length;
		int nR = R.length;
		
		int i=0, j=0, k=0;
		
		while(i < nL && j < nR) {
			if(L[i]<= R[j]) {
				A[k] = L[i];
				i++;
			}else {
				A[k] = R[j];
				j++;
			}
			k++;
				
		}
		
		while(i < nL) {
			A[k] = L[i];
			i++;
			k++;
		}
		
		while(j < nR) {
			A[k] = R[j];
			j++;
			k++;
		}
				
		
		return A;
	}
	
	public int[] mergeSort(int[] array) {
		
		if(array.length < 2) {
			return array;
		}
		
		int midpoint = array.length/2;
		
		int[] left = new int[midpoint];
		int[] right;
		
		if(array.length % 2 == 0) {
			right = new int[midpoint];
		}else {
			right = new int[midpoint + 1];
		}
		
		for(int i=0; i<midpoint; i++) {
			left[i] = array[i];
		}
		for(int j=0; j<right.length; j++) {
			right[j] = array[midpoint + j];
		}
		
		int[] result = new int[array.length];
		
		left = mergeSort(left);
		right = mergeSort(right);
		
		result = merge(left, right);
		
		return result;
	}
	

}
