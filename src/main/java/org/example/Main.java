package org.example;

public class Main {
    public static void main(String[] args) {

        String jewels = "aA";
        String stones = "aAAbbbb";

        JewelsAndStones testJewels = new JewelsAndStones();
        System.out.println(testJewels.calc(jewels, stones));

        int[] nums = {1, 2, 3, 1, 1, 3};
        NumberOfPairs testNum = new NumberOfPairs();
        System.out.println(testNum.calc(nums));

        final String word = "balloon";
        String text = "loonbalxballpoon";

        MaxBalloons testBalloons = new MaxBalloons();

    }
}
