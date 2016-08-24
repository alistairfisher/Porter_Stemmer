package astf2.nlp.stemmer;

public class Rule {
	
	private Condition condition;
	
	public Condition getCondition() {return condition;}
	
	private String S1;
	
	private String S2;
	
	public String getS1() {return S1;}
	
	public String getS2() {return S2;}
	
	Rule(String s1,String s2,Condition condition) {
		S1 = s1;
		S2 = s2;
		this.condition = condition;
	}
	
	Rule(String s1,Condition condition) {
		S1 = s1;
		S2 = "";
		this.condition = condition;
	}
	
	boolean Test(String s) {
		if (s.endsWith(S1)) {
			String s2 = Utility.stem(s, S1); //test behaviour with null string
			Representation r2 = new Representation(s2);
			return condition.test(r2);
		}
		else return false;
	}
	
	String Apply(String s) {
		String newstring;
		if (S1 == null) {//special case, the single letter
			newstring = s.substring(0,s.length()-2);
		}
		else { //typical case, just replace S1 with S2
			String temp = Utility.stem(s, S1);
			newstring = temp.concat(S2);
		}
		return newstring;
	}
	
}
