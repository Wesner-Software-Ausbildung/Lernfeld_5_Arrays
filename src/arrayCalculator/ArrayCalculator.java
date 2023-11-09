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

        if (array1 == null) {
            return null;
        }

        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] * 2;
        }
        //return result;

        if (array2 == null) {
            return null;
        }
        int[] result2 = new int[array2.length];
        for (int i = 0; i < array2.length; i++) {
            result2[i] = array2.length * 3 + 1;
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
