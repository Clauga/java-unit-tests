package wcs;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
//    @Test
//    public void testVowels() {
//        String input = "Hello World";
//        String result = StringUtils.vowels(input);
//        assertNotEquals(input, result);
//
//        String NullInput = null;
//        try {
//            StringUtils.vowels(NullInput);
//            fail("An exception was expected NullPointerException");
//        } catch (NullPointerException e) {
//            assertEquals("null", e.getMessage());
//        }
//    }
@Test
public void testUniqueVowelsWithDuplicates() {
    String input = "Hello World";
    String result = StringUtils.uniqueVowels(input);
    assertEquals("eo", result);
}

    @Test
    public void testUniqueVowelsWithoutVowels() {
        String input = "Rhythm";
        String result = StringUtils.uniqueVowels(input);
        assertEquals("", result);
    }

    @Test
    public void testUniqueVowelsWithAllVowels() {
        String input = "aeiouAEIOU";
        String result = StringUtils.uniqueVowels(input);
        assertEquals("aeiou", result);
    }
}
