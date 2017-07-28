package itfmod.world;

public class ReachedBadLevelException extends Exception
{
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
