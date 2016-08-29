package astf2.nlp.stemmer;

import org.junit.Test;

import javax.rmi.CORBA.Util;

import static org.junit.Assert.*;

/**
 * Created by Alistair on 25/08/2016.
 */
public class UtilityTest {
    @Test
    public void isaVowel() throws Exception {
        boolean test1 = Utility.isaVowel("TOY",1);
        assertEquals(test1,true);
        boolean test2 = Utility.isaVowel("toy",2);
        assertEquals(test2,false);
        boolean test3 = Utility.isaVowel("",0);
        assertEquals(test3,false);
        boolean test4 = Utility.isaVowel("syzygy",5);
        assertEquals(test4,true);
    }

    @Test
    public void isaConsonant() throws Exception {

    }

    @Test
    public void containsVowel() throws Exception {

    }

    @Test
    public void stem() throws Exception {

    }

}