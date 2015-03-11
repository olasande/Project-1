/** 
*
* Dette grensesnittet holder orden paa gjenstander som laanes ut samt 
* gir mulighet for aa levere tilbake slik at gjenstanden kan laanes ut igjen.
*
* 
*
*/

public interface TilUtlaan{
	/**
	*
	* @param laaner navnet paa den som laaner objektet.
	*
	* Metoden returner true dersom utlaanet gikk i orden, mens den skal gi false dersom objektet allerede er utlaant
	*
	*/
	public boolean laanUtTil(String laaner);

	/**
	*
	* Metode som returnerer true hvis objektet ble innlevert, ellers false (hvis det ikke var utlaant)
	*
	*/
	public boolean leverTilbake();
	
}