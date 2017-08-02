package itfmod.ref;


public class SideInfo
{
	/**
	 * If the current side is client
	 */
	private static boolean sideClient;

	/**
	 * Returns if the current side is client.
	 * 
	 * @return if the current side is client
	 */
	public static boolean isSideClient()
	{
		return sideClient;
	}

	/**
	 * Sets if the current side is client.
	 * 
	 * @param sideClient if the current side is client
	 */
	public static void setSideClient(boolean sideClient)
	{
		SideInfo.sideClient = sideClient;
	}
}
