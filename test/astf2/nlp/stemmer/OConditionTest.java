package astf2.nlp.stemmer;

import com.sun.org.apache.regexp.internal.RE;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alistair on 29/08/2016.
 */
public class OConditionTest {

    @Test
    public void test() throws Exception {
        OCondition oCondition = new OCondition();
        Representation test1 = new Representation("abcdhab");
        oCondition.test(test1);
    }

}