
public interface GenHylle<T>{

	public int hylleStr();
	public boolean innenforStr(int plassNr);
	public boolean erLedig(int plassNr);
	public boolean settInn(T ting, int plassNr);
	public boolean taUt(int plassNr);

}