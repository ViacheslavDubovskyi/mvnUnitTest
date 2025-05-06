package org.example;

public class JewelsAndStones {

    public int calc(String jewels, String stones) {
        int count = 0;
        if (!jewels.isEmpty() && !stones.isEmpty()) {
            for (char stone : stones.toCharArray()) {
                if (jewels.indexOf(stone) != -1) {
                    count++;
                }
            }
        }
        return count;
    }
}
