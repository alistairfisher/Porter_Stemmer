package astf2.nlp.stemmer;

import java.util.ArrayList;
import java.util.List;

public class Stem {
	
	private String string;
	
	public String get_string() {
		return string;
	}
	
	public boolean applyRule(Rule r) {
		if (r.Test(string)) {
			this.string = r.Apply(string);
			return true;
		}
		else return false;
	}
	
	private List<String> rules = new ArrayList<String>();
	
	public List<String> get_Rules() {return rules;}
	
	Stem(String stem){
		this.string = stem;
	}
	
}
