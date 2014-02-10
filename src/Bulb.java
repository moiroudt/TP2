
/**
 * @author moiroudt
 *
 */
public class Bulb
{
	/**
	 * puissance par défaut de la lampe.
	 */
	private static final int DEFAULT_POWER = 100;
	
	/**
	 * puissance de la lampe.
	 */
	private final int power;
		
	/**
	 * indique si la lampe est allumée ou nonn.
	 */
	private boolean isLit;
	
	/**
	 * crée une lampe avec la puissance par défaut.
	 * la lampe n'est pas allumée.
	 */
	public Bulb()
	
	{
		this.power = DEFAULT_POWER;
		this.isLit = false;
	}
	
	/**
	 * crée une lampe avec une puissance donnée et qui n'est pas allumée
	 * @param power la puissance donnée
	 */
	public Bulb(int power)
	
	{
		this.power = power;
		this.isLit = false;
	}
	
	/**
	 * action qui allume la nouvelle lampe.
	 */
	public void switchon()
	
	{
		
	}
	
	/**
	 * action qui éteint la nouvelle lampe
	 */
	public void switchoff()
	{
		
	}
}
