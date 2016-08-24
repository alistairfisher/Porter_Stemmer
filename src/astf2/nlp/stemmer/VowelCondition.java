package astf2.nlp.stemmer;

public class VowelCondition extends Condition {
	
	boolean test(Representation r) {
		String s = r.word;
		return Utility.containsVowel(s);
	}
	
}
