public class Bok implements TilUtlaan{
	
	private String tittel;
	String laantTil = null;
	
	public Bok (String t){
		tittel = t;
	}

	public boolean laanUtTil(String laaner){
		if (laantTil == null){
			laantTil = laaner;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean leverTilbake(){
		if (laantTil == null){
			return false;
		}
		else
		{
			laantTil = null;
			return true;
		}
	}

}