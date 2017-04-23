package ru.alttiri.Trash.Youtube.CSC.testing.demo2;

import junit.framework.TestCase;

public class StringTestJUnit3 extends TestCase {

    public void testSubstringCountsCharsFrom0() {
        assertEquals("lo", "Hello".substring(3));
    }


    public void testSubstringThrowsExceptionForInvalidIndex() {
        try {
            "".substring(1);
            fail("Expected exception not thrown");
        } catch (StringIndexOutOfBoundsException e) {
            // pass
        }
    }

}
























