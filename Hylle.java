public class Hylle<T> implements GenHylle<T>{
	
	int str = 100;
	private T [] hylleArray = (T[]) new Object [str];
	
	// public Hylle(int s){
		// str = s;
		// T [] hylleArray = (T[]) new Object [s];
	// }
	
	public int hylleStr(){
		return str;
	}
	
	public boolean innenforStr(int plassNr){
		if (plassNr < hylleArray.length && plassNr >= 0){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean erLedig(int plassNr){
		if(innenforStr(plassNr)){
			if(hylleArray[plassNr] == null){
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

	public boolean taUt(int plassNr){
		if(innenforStr(plassNr)){
			if(hylleArray[plassNr] == null){
				return false;
			}
			else {
				hylleArray[plassNr] = null;
				return true;
			}
		}
		else {
			return false;
		}
	}
	
	public boolean settInn(T ting, int plassNr){
		if(erLedig(plassNr) && innenforStr(plassNr)){
			hylleArray[plassNr] = ting;
			return true;
		}
		else {
			return false;
		}
	}

}