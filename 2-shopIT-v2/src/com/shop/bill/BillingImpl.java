package com.shop.bill;

import com.shop.pm.PriceMatrix;

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

	private PriceMatrix priceMatrix;

	public BillingImpl(PriceMatrix priceMatrix) {
		this.priceMatrix = priceMatrix;
	}

	public double getTotalPrice(String[] items) {
		double total = 0.0;
		for (String itemCode : items) {
			total += priceMatrix.getPrice(itemCode);
		}
		return total;
	}

}
