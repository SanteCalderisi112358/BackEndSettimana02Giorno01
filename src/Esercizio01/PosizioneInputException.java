package Esercizio01;

public class PosizioneInputException extends Exception {
	String message;

	public PosizioneInputException(String _message) {
		super(_message);
		this.message = _message;
	}
}
