package arrayCalculator;


public class ArrayCalculator {
    public int[] duplicateArrayValues(int[] array) {
        if (array == null) {
            return null;
        }

        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * 2;

        }
        return result;
    }

    public int[] sumArrays(int[] array1, int[] array2) throws IllegalArgumentException {

        if (array1 == null || array2 == null) {
            return null;
        }

        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Both arrays must have the same length");
        }
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] + array2[i];
        }
        return result;

    }

    public int[] swapArrays(int[] array) {
        return null;
    }

    public int sumEven(int[] array) {
        return 0;
    }

    public int[] getLargestTwo(int[] array) throws IllegalArgumentException {
        return null;
    }
}
