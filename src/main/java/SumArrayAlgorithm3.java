public class SumArrayAlgorithm3 {

    public int sumArrayAlgorithm(int[] array){
        int sum = 0;
        if (array.length != 0){
            for (int i = 0; i < array.length; i++){
                sum += array[i];
            }

            return sum;
        }

        return 0;
    }



}
