package itfmod.world;

public class ReachedBadLevelException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ReachedBadLevelException()
	{
		super();
	}
	
	public ReachedBadLevelException(String message)
	{
		super(message);
	}
	
	public ReachedBadLevelException(Throwable cause)
	{
		super(cause);
	}
	
	public ReachedBadLevelException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
