package astf2.nlp.stemmer;

public class Representation {

	String word; //the underlying word
	int measure;
	
	Representation(String s) {
		word = s;
		this.measure = get_measure(s);
		//TODO complete parser
	}
	
	int get_measure(String s) {//calculate the measure of a string
		return 1;
	}
	
}
