package com.example.app;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        User u = new User("Salo");
        u.addLike();
        u.addLike();
        u.addLike();
        u.addLike();
        assertEquals("Salo", u.getName());
        assertEquals(4, u.getLike());
        assertEquals(5, u.getLike());
    }
}