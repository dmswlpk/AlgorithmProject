import java.util.Arrays;

public class PeakElementAlgorithm {
    /**
     * Написать алгоритм PeakElement,
     * который принимает на вход массив целых чисел и возвращает значения пиковых элементов
     * (элементы, которые больше своих соседей).
     * Test Data:  {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
     */

    public static int[] findPeakElement(int[] array) {
        int[] peakArray = new int[]{};
        int count = 0;

        if (array[0] > array[1] || array[array.length - 1] > array[array.length - 2]) {
            count += 1;
        }
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                count++;
            }
        }
        if( count == 0) {

            return peakArray;
        }

        peakArray = new int[count];
        count = 0;

        for (int i = 0; i < array.length;) {
            if (i == 0) {
                if (array[i] > array[i + 1]) {
                    peakArray[count] = array[i];
                    count++;
                    i = i + 1;
                } else {
                    i = i + 1;
                }
            } else if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                peakArray[count] = array[i];
                count++;
                i = i + 1;
            } else if (i == array.length - 1) {
                if (array[array.length - 1] > array[array.length - 2]) {
                    peakArray[count] = array[array.length - 1];
                }
            }
        }

        return peakArray;
    }


    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = new int[]{3, 7, 23};

        System.out.println(Arrays.toString(findPeakElement(array)));
    }
}