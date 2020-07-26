package it.facebook.univpm.Facebook.Post.Exceptions;

public class InvalidToken extends Exception {
		
	private static final long serialVersionUID = 1L;

	public InvalidToken() {
		super();
	}

	public InvalidToken(String msg) {
		super(msg);
	} 
}
