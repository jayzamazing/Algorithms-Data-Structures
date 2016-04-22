package com.adrianjaylopez;

/**
 * Class to test anagram class.
 * @author Adrian J Lopez
 * @since <pre>11/27/15</pre>
 * @version 2.0
 */
import com.adrianjaylopez.Anagram;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnagramTest {
    Anagram anagram;

    /**
     * This runs before each test for the initial setup
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception{
        anagram = new Anagram();// instantiate class
    }

    /**
     * This runs after each test to perform clean up
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
        //set everything to null
        anagram = null;
    }

    /**
     * Test the isvoid method.
     * @throws Exception
     */
    @Test
    public void testIsVoid() throws Exception{
        assertEquals(anagram.isAnagram("hello", "olleh"), true);//checks that true is returned for anagram
        assertEquals(anagram.isAnagram("world", "olrdwf"), false);//check for false if both strings are not the same length
        assertEquals(anagram.isAnagram("world", "olrdq"), false);//check for false when not an anagram
    }
}
