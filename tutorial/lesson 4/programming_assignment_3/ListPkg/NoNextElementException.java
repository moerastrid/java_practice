package ListPkg;

public class NoNextElementException extends Exception {
	public NoNextElementException() {
		super();
	}

	public NoNextElementException(String errorMessage) {
		super(errorMessage);
	}
}
