package itfmod.world;

public class ObstacledStructureException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ObstacledStructureException()
	{
		super();
	}
	
	public ObstacledStructureException(String message)
	{
		super(message);
	}
	
	public ObstacledStructureException(Throwable cause)
	{
		super(cause);
	}
	
	public ObstacledStructureException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
