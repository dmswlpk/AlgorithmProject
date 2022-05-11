import java.util.Arrays;

public class IntersectionAlgorithm {
    /**
     * Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел и возвращает массив общих элементов.
     * <p>
     * Test Data:
     * {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
     * {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
     * {1, 2, 4, 5, 89}, {8, 9, 45} → {}
     *
     * @return
     */

    public static int[] getIntersectionAlgorithm(int[] array, int[] array2) {
        if (array.length <= 0 || array2.length <= 0) {
            return new int[]{};
        }
        int[] intersectionArray = new int[]{};
        int a = array.length;
        int b = array2.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array[i] == array2[j]) {
                    array[i] = intersectionArray[i];
                }
            }

            return intersectionArray;

        }
        return new int[]{};
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};
        System.out.println(Arrays.toString(getIntersectionAlgorithm(array, array2)));
    }
}
