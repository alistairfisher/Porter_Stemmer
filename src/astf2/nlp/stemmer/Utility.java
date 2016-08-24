package astf2.nlp.stemmer;

public abstract class Utility {
	
	static boolean isaVowel(String s,int n) {
		char v = s.charAt(n);
		if (v=='a'||v=='e'||v=='i'||v=='o'||v=='u')
			return true;
		else if (v=='y') {
			return isaConsonant(s,(n-1));
		}
		else return false;
	}

	static boolean isaConsonant(String s,int n) {
		if (n<0) return false;
		else return !(isaVowel(s,n));
	}

	static boolean containsVowel(String s) {
		for (int i=0;i<s.length();i++){
			if (isaVowel(s,i)) return true;
		}
		return false;
	}
	
	static String stem(String s,String suffix) {
		return s.substring(0,(s.length() -suffix.length()));
	}
}
