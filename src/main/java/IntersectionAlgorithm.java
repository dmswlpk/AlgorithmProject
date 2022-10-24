public class IntersectionAlgorithm {

    public int[] findIntersectionAlgorithm(int[] array, int[] array2) {
        if (array.length <= 0 || array2.length <= 0) {
            return new int[]{};
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array[i] == array2[j]) {
                    count++;
                }
            }
        }

        int temp = 0;
        int[] intersectionArray = new int[count];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array[i] == array2[j]) {
                    intersectionArray[temp++] = array[i];
                    break;
                }
            }
        }

        return intersectionArray;
    }
}
