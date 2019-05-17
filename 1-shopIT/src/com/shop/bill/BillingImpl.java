package com.shop.bill;

import com.shop.pm.PriceMatrix_v1;

/*
 * 
 * --> tight coupling b/w dependent & dependency
 * 		==> can't extend with new features
 * --> too many duplicate dependency instances created & destroyed
 * 		==> slow, memory/resource use high
 * --> unit testing not possible
 * 		==> dev/bug fix slow
 * 
 * 
 * why issues ?
 * 
 * 	==> dependent itself creating its own dependency
 * 
 * 
 * soln : Dont't create , lookup from factory
 * 
 * Limitation on factory lookup:
 * 
 *  ==> factory location tight coupling
 *  
 *  best soln : Don't create/lookup , inject/get by third-party ( IOC )
 *  
 * 				IOC ==> Inversion of Control principle
 * 
 *  	
 *  
 *  	
 * 
 */

public class BillingImpl {

	public double getTotalPrice(String[] items) {
		double total = 0.0;
		PriceMatrix_v1 priceMatrix_v1 = new PriceMatrix_v1();
		for (String itemCode : items) {
			total += priceMatrix_v1.getPrice(itemCode);
		}
		return total;
	}

}
