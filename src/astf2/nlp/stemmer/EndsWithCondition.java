package astf2.nlp.stemmer;

public class EndsWithCondition extends Condition {
	
	char letter;
	
	@Override
	boolean test(Representation r) {
		String s = r.word;
		return (s.charAt(s.length()-1) == letter);
	}
	
	EndsWithCondition(char c) {
		this.letter = c;
	}
	
}
