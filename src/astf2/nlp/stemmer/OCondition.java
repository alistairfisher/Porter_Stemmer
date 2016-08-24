package astf2.nlp.stemmer;

public class OCondition extends Condition {

	@Override
	boolean test(Representation r) {
		String word = r.word;
		int length = word.length();
		if (length>2) {
			if (Utility.isaConsonant(word, length-1)
			  && Utility.isaVowel(word,length-2)
			  && Utility.isaConsonant(word,length-3)) {
				char lastLetter = word.charAt(length-1);
				return (lastLetter!='w'&&
						lastLetter!='x'&&
						lastLetter!='y');
			}
			else return false;
		}
		else return false;
	}

}
