package astf2.nlp.stemmer;

public class ConjunctiveCondition extends Condition {
	
	Condition c1;
	Condition c2;
	
	@Override
	boolean test(Representation r) {
		return (c1.test(r) && c2.test(r));
	}
	
	ConjunctiveCondition(Condition c1,Condition c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
}
