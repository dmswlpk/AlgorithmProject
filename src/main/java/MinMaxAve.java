import java.util.Arrays;

public class MinMaxAve {

    public  static double[] minMaxAverageAlgorithm(int[] array, int x, int y){

        double sum = 0;
        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        if (array.length != 0) {
            for (int i = x; i <= y; i++){
                sum += array[i];
                if (array[i] > max){
                    max = array[i];
                }
                if (array[i] < min){
                    min = array[i];
                }

            }
            return new double[] {min,max,sum/((y - x) + 1)};
        }

              return new double[]{};

    }

    public static void main(String[] args) {

        //*{1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}//

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};


        System.out.println(Arrays.toString(minMaxAverageAlgorithm(array, 2,6)));

    }




}
