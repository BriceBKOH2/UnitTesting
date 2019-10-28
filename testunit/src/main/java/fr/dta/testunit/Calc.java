package fr.dta.testunit;

import fr.dta.testunit.exception.NegativeNumberException;

public class Calc {
	
	/** Method to do a substraction of two positives Long numbers and return a positive result.
	 * @param nmb1 long type number that is substracted. Expected to be positive.
	 * @param nmb2 long type number that is deduced from nmb1. Expected to be positive.
	 * @result  long type result, expected to be positive.
	 * @throws NegativeNumberException in case parameters or result is negative.
	 */
	
	public Long substract (Long nmb1, Long nmb2) throws NegativeNumberException{
		nmb1 = (nmb1 == null ? 0 : nmb1);
		nmb2 = (nmb2 == null ? 0 : nmb2);
		
		if (nmb1 < 0 || nmb2 < 0 || nmb1 - nmb2 < 0)
			throw new NegativeNumberException();
		
		return nmb1 - nmb2;
	}
}
