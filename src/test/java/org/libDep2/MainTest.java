package org.libDep2;

import org.junit.jupiter.api.Test;
import org.libDep2.Library;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void testCount() {
        Library library = new Library();
        String[] result = library.count(20);
        assertEquals(20, result.length);
        for (int i = 0; i < 20; i++) {
            assertEquals("j = " + i, result[i]);
        }
    }
    @Test
    void testGreet() {
        Library library = new Library();
        String result = library.greet("lib-dep-2");
        assertEquals("Greetings, lib-dep-2!", result);
    }
}
