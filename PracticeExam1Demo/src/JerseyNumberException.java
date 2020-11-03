
@SuppressWarnings("serial")
public class JerseyNumberException extends Exception {
	public JerseyNumberException()
	{
		super("Jersey number is invalid");
	}
	
	public JerseyNumberException(String message)
	{
		super(message);
	}
}
