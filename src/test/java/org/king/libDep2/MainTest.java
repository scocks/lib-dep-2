package org.king.libdep2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {   
    @Test
    void testGreet() {
        Library library = new Library();
        String result = library.greet("lib-dep-2");
        assertEquals("greet from libdep2, lib-dep-2!", result);
    }
}
