package com.greatlearning.driver;


import java.util.Scanner;
import com.greatlearning.service.DenominationService;
import com.greatlearning.service.SortTransaction;

public class DriverClass {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//Accept denominations from user and save them in array
		System.out.println("Enter the size of currency denomination: ");
		int denomination_count = in.nextInt();
		int[] denominations = new int[denomination_count];
		System.out.println("Enter the currency denominations value ");
		for(int i=0; i<denomination_count; i++) {
			denominations[i] = in.nextInt();
		}
		
		//Accept the amount payable
		System.out.println("Enter the amount you want to pay");
		int amount = in.nextInt();
		
		//Sort the denominations array
		SortTransaction sort = new SortTransaction();
		denominations = sort.mergeSort(denominations);

		//Call method to give minimum number of notes as per denominations
		System.out.println();
		DenominationService ds = new DenominationService();
		ds.countDenominations(amount, denominations);
		
		in.close();

	}

}
