package randomNumbers;

import java.util.Random;

public class RandomNumbers{
    public int[] getRandomNumbers(int number) {

        Random randomNumberGenerator = new Random();
        int [] randomNumbers = new int [number];
        for (int i = 0; i < number; i++) {
            randomNumbers [i] = randomNumberGenerator.nextInt();
        }

        return randomNumbers;
    }

    public int evaluateArray(int[] randomNumbers, int digit){
        return 0;
    }

    public String getRandomNumbersToString(int[] randomNumbers){
        return null;
    }
}