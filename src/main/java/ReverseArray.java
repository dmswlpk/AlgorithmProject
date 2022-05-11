public class ReverseArray {

    public int[] reverseArray(int[] array){
        int count = 0;
        int [] reverseArray = new int[]{};
        if (array.length != 0){
            for (int i = array.length-1; i <= Integer.MAX_VALUE; i ++){
                reverseArray[count] = array[i];
                count++;
            }
            for(int i = 0; i < array.length;i++){
                reverseArray[count] = array[i];
            }
        }


        return new int[]{};
    }



}
