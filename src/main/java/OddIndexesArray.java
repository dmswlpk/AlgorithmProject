public class OddIndexesArray { /**Написать алгоритм OddIndices, который принимает массив чисел,
 и возвращает массив значений нечетных индексов*/


 public int[] oddIndexes(int[] array){
        int countOddSize = 0;
        for(int i = 0; i < array.length; i++){
            if(i % 2 != 0){
                countOddSize++;
            }
        }

    int [] array1 = new int[countOddSize];
        int j = 0;
        for(int i = 0; i < array.length; i++){
            if (i % 2 != 0){
                array1[j] = array[i];
                j++;

            }
        }

        return array1;
}


  // public static void main(String[] args) {
  //     int[] array = {-45, 590, 234, 985, 12, 68};
  //     int [] array1 =  {590, 985, 68};

  //     System.out.println(Arrays.toString(oddIndexes(array)));

  // }
}
