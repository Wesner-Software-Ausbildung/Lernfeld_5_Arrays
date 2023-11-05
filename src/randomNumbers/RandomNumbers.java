package randomNumbers;

import java.util.Random;

public class RandomNumbers{
    public int[] getRandomNumbers(int number) {

        Random randomNumberGenerator = new Random();
        int [] randomNumbers = new int [number];
        for (int i = 0; i < number; i++) {
            randomNumbers [i] = randomNumberGenerator.nextInt(10) + 1;
        }

        return randomNumbers;
    }

    public int evaluateArray(int[] randomNumbers, int digit){

        int count = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] == digit) {
                count++;
            }
        }


        return count;
    }

    public String getRandomNumbersToString(int[] randomNumbers){

        String count = "";
        for (int i = 0; i < randomNumbers.length; i++) {
            count += randomNumbers[i] + " ";
        }
        return count;
    }
}