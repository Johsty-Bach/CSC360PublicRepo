package Hello;

public class UnderAgeException extends Exception {
	private static final long serialVersionUID = 7589985669927221947L;

	public UnderAgeException() {
		super("Parent is too young");
		// TODO Auto-generated constructor stub
	}

	public UnderAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
	
}
