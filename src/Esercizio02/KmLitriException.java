package Esercizio02;

public class KmLitriException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

	public KmLitriException(String _message) {
		super(_message);
		this.message = _message;

	}
}
