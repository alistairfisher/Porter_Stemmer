package astf2.nlp.stemmer;

public class MeasureEqualityCondition extends Condition {

	int measure;
	
	@Override
	boolean test(Representation r) {
		return (r.measure == measure);
	}
	
	MeasureEqualityCondition(int m){
	  this.measure = m;
	}

}
