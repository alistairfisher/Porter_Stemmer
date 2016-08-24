package astf2.nlp.stemmer;

public class NegatedCondition extends Condition {

	Condition c;
	
	@Override
	boolean test(Representation r) {
		return !c.test(r);
	}
	
	NegatedCondition(Condition c) {
		this.c = c;
	}
	
}
