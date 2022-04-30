public class MinMaxAve {

    public  int[] getMinMaxAverageAlgorithm(int[] array, int x, int y){

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
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
            return new int[] {min,max,sum/((y - x) + 1)};
        }

              return new int[]{};

    }




}
