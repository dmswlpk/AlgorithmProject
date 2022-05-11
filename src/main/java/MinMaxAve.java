public class MinMaxAve {

    public int[] getMinMaxAverageAlgorithm(int[] array, int index1, int index2) {
        if (array == null || array.length < 1 || index1 < 0 || index1 > index2 || index2 > array.length) {

            return new int[]{};
        }
        if (index1 > index2) {
            int tmp = index1;
            index1 = index2;
            index2 = tmp;
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if (array.length != 0) {
            for (int i = index1; i <= index2; i++) {
                sum += array[i];
                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i] < min) {
                    min = array[i];
                }
            }

            return new int[]{min, max, sum / (index2 - index1) + 1};
        }

        return new int[]{};

    }


}
