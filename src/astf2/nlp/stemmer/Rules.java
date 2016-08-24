package astf2.nlp.stemmer;

/*this class contains all concrete rules
used by the porter stemmer*/

public class Rules {
	
	static Condition noCondition = new NoCondition();
	static Condition mGtrThan0 = new MeasureCondition(0);
	static Condition mGtrThan1 = new MeasureCondition(1);
	static Condition doubleConsonant = new DoubleConsonantCondition();
	static Condition vowelCondition = new VowelCondition();
	static Condition mEqualsOne = new MeasureEqualityCondition(1);
	static Condition OConjunction = new ConjunctiveCondition(mEqualsOne,
		new OCondition());
	
	//the more complicated condition used with the double consonant rule
	static Condition endsWithL = new EndsWithCondition('L');
	static Condition endsWithS = new EndsWithCondition('S');
	static Condition endsWithZ = new EndsWithCondition('Z');
	
	static Condition endsDisjunction =
	    new DisjunctiveCondition(new DisjunctiveCondition(
	      endsWithL,endsWithS),endsWithZ);
	
	static Condition endsNegation = new NegatedCondition(endsDisjunction);
	
	static Condition endsConjunction = new ConjunctiveCondition(doubleConsonant,endsNegation);
	    	
	//the condition for rule 412
	
	Condition endsWithT = new EndsWithCondition('T');
	Condition endsDisjunction2 = new DisjunctiveCondition(
	  endsWithS,endsWithT);
	Condition endsConjunction2 = new ConjunctiveCondition(
	  mGtrThan1,endsDisjunction2);
	
	//1A rules
	
	static Rule r1a1 = new Rule("sses","ss",noCondition);
	static Rule r1a2 = new Rule("ies","i",noCondition);
	static Rule r1a3 = new Rule("ss","ss",noCondition);
	static Rule r1a4 = new Rule("s",noCondition);
	
	static Rule[] Rules1a = {r1a1,r1a2,r1a3,r1a4};
	
	//1B rules
	
	static Rule r1b1 = new Rule("eed","ee",mGtrThan0);
	static Rule r1b2 = new Rule("ed",vowelCondition);
	static Rule r1b3 = new Rule("ing",vowelCondition);
	
	static Rule[] Rules1b = {r1b1,r1b2,r1b3};
	
	//1B optional rules
	
	static Rule r1bo1 = new Rule("at","ate",noCondition);
	static Rule r1bo2 = new Rule("bl","ble",noCondition);
	static Rule r1bo3 = new Rule("iz","ize",noCondition);
	static Rule r1bo4 = new Rule(null,null,endsConjunction);
	static Rule r1bo5 = new Rule(null,"e",OConjunction);
	
	static Rule[] Rules1bo = {r1bo1,r1bo2,r1bo3,r1bo4};
	
	//1C rule
	
	static Rule r1c = new Rule("Y","I",vowelCondition);
	
	//2 Rules
	
	static Rule r21 = new Rule("ATIONAL","ATE",mGtrThan0);
	static Rule r22 = new Rule("TIONAL","TION",mGtrThan0);
	static Rule r23 = new Rule("ENCI","ENCE",mGtrThan0);
	static Rule r24 = new Rule("ANCI","ANCE",mGtrThan0);
	static Rule r25 = new Rule("IZER","IZE",mGtrThan0);
	static Rule r26 = new Rule("ABLI","ABLE",mGtrThan0);
	static Rule r27 = new Rule("ALLI","AL",mGtrThan0);
	static Rule r28 = new Rule("ENTLI","ENT",mGtrThan0);
	static Rule r29 = new Rule("ELI","E",mGtrThan0);
	static Rule r210 = new Rule("OUSLI","OUS",mGtrThan0);
	static Rule r211 = new Rule("IZATION","IZE",mGtrThan0);
	static Rule r212 = new Rule("ATION","ATE",mGtrThan0);
	static Rule r213 = new Rule("ATOR","ATE",mGtrThan0);
	static Rule r214 = new Rule("ALISM","AL",mGtrThan0);
	static Rule r215 = new Rule("IVENESS","IVE",mGtrThan0);
	static Rule r216 = new Rule("FULNESS","FUL",mGtrThan0);
	static Rule r217 = new Rule("OUSNESS","OUS",mGtrThan0);
	static Rule r218 = new Rule("ALITI","AL",mGtrThan0);
	static Rule r219 = new Rule("IVITI","IVE",mGtrThan0);
	static Rule r220 = new Rule("BILITI","BLI",mGtrThan0);
	
	static Rule[] Rules2 = 
		{r21,r22,r23,r24,r25,r26,r27,r28,r29,r210,
		r211,r212,r213,r214,r215,r216,r217,r218,r219,r220};
	
	//3 Rules
	
	static Rule r31 = new Rule("ICATE","IC",mGtrThan0);
	static Rule r32 = new Rule("ATIVE",mGtrThan0);
	static Rule r33 = new Rule("ALIZE","AL",mGtrThan0);
	static Rule r34 = new Rule("ICITI","IC",mGtrThan0);
	static Rule r35 = new Rule("ICAL","IC",mGtrThan0);
	static Rule r36 = new Rule("FUL",mGtrThan0);
	static Rule r37 = new Rule("NESS",mGtrThan0);
	
	static Rule[] Rules3 = {r31,r32,r33,r34,r35,r36,r37};
	
	//4 Rules
	
	Rule r41 = new Rule("AL",mGtrThan1);
	Rule r42 = new Rule("ANCE",mGtrThan1);
	Rule r43 = new Rule("ENCE",mGtrThan1);
	Rule r44 = new Rule("ER",mGtrThan1);
	Rule r45 = new Rule("IC",mGtrThan1);
	Rule r46 = new Rule("ABLE",mGtrThan1);
	Rule r47 = new Rule("IBLE",mGtrThan1);
	Rule r48 = new Rule("ANT",mGtrThan1);
	Rule r49 = new Rule("EMENT",mGtrThan1);
	Rule r410 = new Rule("MENT",mGtrThan1);
	Rule r411 = new Rule("ENT",mGtrThan1);
	Rule r412 = new Rule("ION",endsConjunction2);
	Rule r413 = new Rule("OU",mGtrThan1);
	Rule r414 = new Rule("ISM",mGtrThan1);
	Rule r415 = new Rule("ATE",mGtrThan1);
	Rule r416 = new Rule("ITI",mGtrThan1);
	Rule r417 = new Rule("OUS",mGtrThan1);
	Rule r418 = new Rule("IVE",mGtrThan1);
	Rule r419 = new Rule("IZE",mGtrThan1);
	
	//TODO rule array
	
	//5a rules
	
	Rule r5a1 = new Rule("E",mGtrThan1);
	
}
