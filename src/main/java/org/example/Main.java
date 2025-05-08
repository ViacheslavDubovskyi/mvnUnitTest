package org.example;

public class Main {
    public static void main(String[] args) {

        String jewels = "aA";
        String stones = "aAAbbbb";
        JewelsAndStones testJewels = new JewelsAndStones();
        System.out.println("Number of jewels: " + testJewels.calc(jewels, stones));

        int[] nums = {1, 2, 3, 1, 1, 3};
        NumberOfPairs testNum = new NumberOfPairs();
        System.out.println("Number of 'good' pairs: " + testNum.calc(nums));

        String text = "loonbalxballpoon";
        MaxBalloons testBalloons = new MaxBalloons();
        System.out.println("Max number of instances 'balloon': " + testBalloons.calc(text));

    }
}
