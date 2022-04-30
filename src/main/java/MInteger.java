public class MInteger {

    public String getMInteger(int m){
        if (m % 3 == 0 && m % 5 == 0) {

            return "Good Number";
        }
        if (m % 3 == 0){

            return "Bad Number";
        }
        if (m % 5 ==0){

            return "Poor Number";
        }
        if (m % 5 != 0  || m % 3 != 0){

        }
        return "-1";

    }
}
