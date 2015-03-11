
public class Oblig3_3f {

	public static void main(String[] a) {
		hovedprogram();
	}
	
	public static void hovedprogram() {
		
		// GenHylle<Bok> h = new Hylle<Bok>(100);
		GenHylle<Bok> h = new Hylle<Bok>();
		
		Bok b1 = new Bok("Jungelboken");
		Bok b2 = new Bok("Sabeltann");
		Bok b3 = new Bok("Bibelen");
		
		testBoolean("erLedig(3) naar pos ledig skal gi true", true, h.erLedig(3));
		testBoolean("settInn(b1,3) naar pos ledig skal gi true", true, h.settInn(b1, 3));
		testBoolean("erLedig(3) naar pos opptatt skal gi false", false, h.erLedig(3));
		testBoolean("settInn(b2,3) naar pos opptatt skal gi false", false, h.settInn(b2, 3));
		testBoolean("settInn(b2,5) naar pos ledig skal gi true", true, h.settInn(b2, 5));
		testBoolean("taUt(3) naar pos er i bruk skal gi true", true, h.taUt(3));
		testBoolean("taUt(3) naar pos er tom skal gi false", false, h.taUt(3));
		testBoolean("settInn(b1,3) naar pos ledig skal gi true", true, h.settInn(b1, 3));
		testBoolean("settInn(b3,300) naar pos er utenfor hylleStr skal gi false", false, h.settInn(b3, 300));
		testBoolean("taUt(300) naar pos er utenfor hylleStr skal gi false", false, h.taUt(300));
		
	}
	
	public static void testBoolean(String description, boolean expected, boolean actual) {
	    if (expected == actual) {
		System.out.printf("OK - %s%n", description);
	    } else {
		System.out.printf("FEIL - %s. Skulle vaert: %s. Var: %s%n",
				  description,
				  expected,
				  actual);
	    }
	}
	
	
}
