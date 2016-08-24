package astf2.nlp.stemmer;

public class MeasureCondition extends Condition {
	
	private int measure;

	@Override
	boolean test(Representation r) {		
		return (r.measure > measure);
	}
	
	MeasureCondition(int m) {
		measure = m;
	}
	
}
