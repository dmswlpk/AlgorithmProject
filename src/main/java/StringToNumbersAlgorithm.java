public class StringToNumbersAlgorithm {

    public String getStringToNumbersAlgorithm(String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() != 0) {
                int[] myArray = new int[]{};
                //str = str.replace("[^0-9])
                for (int i = 0; i < str.length(); i++) {
                   // str = str.replace("\\D","D");
                    str = str.replace(str.substring(i),"");

                    }

                } return str;
            }

        return null;
    }
}
