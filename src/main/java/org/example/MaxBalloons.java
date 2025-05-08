package org.example;

import java.util.HashMap;

public class MaxBalloons {

    public int calc(String text) {
        if (text == null || text.length() < 7) {
            return 0;
        }
        HashMap<Character, Integer> textChars = new HashMap<>();

        textChars.put('b', 1);
        textChars.put('a', 1);
        textChars.put('l', 1);
        textChars.put('o', 1);
        textChars.put('n', 1);

        char[] chars = text.toLowerCase().toCharArray();
        for (char c : chars) {
            textChars.put(c, textChars.getOrDefault(c, 0) + 1);
        }

        int b = textChars.get('b');
        int a = textChars.get('a');
        int l = textChars.get('l');
        int o = textChars.get('o');
        int n = textChars.get('n');

        return Math.min(b, Math.min(a, Math.min(n, Math.min(l / 2, o / 2))));
    }
}
