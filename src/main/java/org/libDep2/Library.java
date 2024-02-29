package org.libDep2;
public class Library {
    public String[] count(Integer number) {
        String[] lines = new String[number];
        for (int i = 0; i < number; i++) {
            lines[i] = "j = " + i;
        }
        return lines;
    }
    public String greet(String name) {
        return "Greetings, " + name + "!";
    }
}