package csc131.junit;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GiftCardTest {

	@Test
	public void getIssuingStore()
	{
		double balance;
		GiftCard card;
		int issuingStore;
		double tolerance = 0.001;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		
		assertEquals("getIssuingStore() ", issuingStore, card.getIssuingStore());
		assertEquals("getBalance() ", balance, card.getBalance(), tolerance);
	}
	
	/*
	 * @Test public void getBalance() { double balance; GiftCard card; int
	 * issuingStore; double tolerance = 0.001;
	 * 
	 * issuingStore = 1337; balance = 100.00; card = new GiftCard(issuingStore,
	 * balance);
	 * 
	 * assertEquals("getBalance() ", balance, card.getBalance(), tolerance); }
	 */
	
	@Test
	public void deduct()
	{
		double balance;
		GiftCard card;
		int issuingStore;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		
		assertEquals("deduct(90.00) ", "Remaining Balance:  10.00", card.deduct(90.00));
		
		assertEquals("deduct(90.00) ", "Amount Due:  10.00", card.deduct(20.00));
		
		assertEquals("deduct(90.00) ", "Invalid Transaction", card.deduct(-100.00));
		
		
		/*
		 * int issuingStore2 = 1338; double balance2 = 100.00; GiftCard card2 = new
		 * GiftCard(issuingStore2, balance2);
		 */
		
		
		
		
	}
}
