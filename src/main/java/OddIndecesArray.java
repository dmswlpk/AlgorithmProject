public class OddIndecesArray { /**Написать алгоритм OddIndices, который принимает массив чисел,
 и возвращает массив значений нечетных индексов*/


 public int[] oddIndexes(int[] array){

     if (array.length != 0) {
         int countOddSize = 0;

         int [] array1 = new int[array.length / 2];
         int j = 0;
         for(int i = 1; i < array.length; i+=2) {
                 array1[j] = array[i];
                 j++;
         }

         return  array1;

            }return new int[] {};

        }


}


  // public static void main(String[] args) {
  //     int[] array = {-45, 590, 234, 985, 12, 68};
  //     int [] array1 =  {590, 985, 68};

  //     System.out.println(Arrays.toString(oddIndexes(array)));

  // }

