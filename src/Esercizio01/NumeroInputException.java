package Esercizio01;

public class NumeroInputException extends Exception {
	String message;

	public NumeroInputException(String _message) {
		super(_message);
		this.message = _message;
	}
}
