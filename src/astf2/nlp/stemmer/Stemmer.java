package astf2.nlp.stemmer;

public abstract class Stemmer {

	public static void main(String[] args) {
		int sentence_length = args.length;
		Stem[] stems = new Stem[sentence_length];
		for (int i = 0;i < sentence_length;i++) {
			stems[i] = new Stem(args[i]);
			applyRules(stems[i]);
            if (i % 15 == 0 && i > 0) {
                System.out.printf("%s\n", stems[i].get_string());
            }
			else {
			    System.out.printf("%s ", stems[i].get_string());
            }
		}
		System.out.print('\n');
	}
	
	private static void applyRules(Stem s) {
		applyRules(s,Rules.Rules1a);
		if (applyRules1b(s)) {
			applyRules(s,Rules.Rules1bo);
		}
		s.applyRule(Rules.r1c);
		applyRules(s,Rules.Rules2);
		applyRules(s,Rules.Rules3);

	}
	
	private static void applyRules(Stem s,Rule[] rules) {
		for (Rule r:rules) {
		  if (s.applyRule(r)) {
			  break;
		  }
		}
	}
	
	private static boolean applyRules1b(Stem s) {
		if (s.applyRule(Rules.r1b1)) return false;
		else if (s.applyRule(Rules.r1b2)) return true;
		else return s.applyRule(Rules.r1b3);
	}
	
}