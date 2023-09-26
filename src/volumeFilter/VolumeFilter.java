package volumeFilter;

public class VolumeFilter {

    public int[] smoothValues(int[] values) {

        int [] smoothedValues = new int[values.length];

        for (int i = 1; i < values.length - 1; i++) {
            int sum = 0;
            for (int j = -1; j < 2; j++) {
                sum += values[i + j];
            }
            smoothedValues[i] = sum / 3;
        }
        int n = values.length - 1;
        smoothedValues[0] = (values[0] + values[1]) / 2;
        smoothedValues[n] = (values[n - 1] + values[n]) / 2;
        return smoothedValues;
    }
}
