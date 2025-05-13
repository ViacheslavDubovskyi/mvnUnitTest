package org.example;

import java.util.HashMap;

public class MaxBalloons {

    public int calc(String text) {
        if (text == null || text.length() < 7) {
            return 0;
        }
        HashMap<Character, Integer> textChars = new HashMap<>();

        char[] chars = text.toLowerCase().toCharArray();
        for (char c : chars) {
            textChars.put(c, textChars.getOrDefault(c, 0) + 1);
        }

        int b = textChars.getOrDefault('b', 0);
        int a = textChars.getOrDefault('a', 0);
        int l = textChars.getOrDefault('l', 0) / 2;
        int o = textChars.getOrDefault('o', 0) / 2;
        int n = textChars.getOrDefault('n', 0);

        return Math.min(b, Math.min(a, Math.min(l, Math.min(l, Math.min(o, n)))));
    }
}
