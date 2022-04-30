import java.util.Arrays;

public class IntersectionAlgorithm {

    public static int[] getIntersectionAlgorithm(int[]array,int[]array2) {
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

        }return new int[]{};
    }

    public static void main(String[] args) {

        int[]array = {1, 2, 4, 5, 89};
        int[]array2 = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};
        System.out.println(Arrays.toString(getIntersectionAlgorithm(array,array2)));
    }
}
