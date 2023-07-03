package Esercizio02;

public class KmLitriException extends Exception {

	String message;

	public KmLitriException(String _message) {
		super(_message);
		this.message = _message;

	}
}
