package org.dl.firsttry.default_methods;

import static org.junit.Assert.assertEquals;

/**
 */
public class FormulaTest {

    @org.junit.Test
    public void test() {
        Formula obj = a -> a + 2;

        assertEquals(7, obj.calulate(5), 0.01);
        assertEquals(3, obj.sqrt(9), 0.01);
    }
}
