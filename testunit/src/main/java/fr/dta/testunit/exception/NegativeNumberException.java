package fr.dta.testunit.exception;

public class NegativeNumberException extends RuntimeException{
	
	private static final long serialVersionUID = -6624170822234004343L;

	public NegativeNumberException() {
		super("Argument input is negative.");
	}
	
}
