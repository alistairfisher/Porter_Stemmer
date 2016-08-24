package astf2.nlp.stemmer;

public class DoubleConsonantCondition extends Condition {
	
	@Override
	boolean test(Representation r) {
		String s = r.word;
		int n = s.length();
		return ((Utility.isaConsonant(s, n-2))&&
				(Utility.isaConsonant(s, n-1)));
	}
	
}
