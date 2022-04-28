public class BiggerValueAlgorithm {

    public int BiggerValue(int a, int b){
        int biggerValue = 0;
        if (a < b){
            biggerValue = b;
        }else {
            biggerValue = a;
        }
        return biggerValue;
    }


}
