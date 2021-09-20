package com.greatlearning.service;

public class DenominationService {
	
	public void countDenominations(int amount, int[] denominations) {
		int count=0;
		for(int i=denominations.length-1; i>=0; i--) {
			if(amount==0)break;
			count = amount/denominations[i];
			if(count==0) {
				continue; 
			}else {
				amount = amount % denominations[i];
				System.out.println(denominations[i] + ":" + count);
			}
				
		}
	}

}
