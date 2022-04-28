public class SumArrayAlgorithm3 {

    public int SumArrayAlgorithm(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }

        return sum;
    }


}
