public class StringToNumbersAlgorithm {

    public String getStringToNumbersAlgorithm(String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() != 0) {
                //int[] myArray = new int[]{};
                //str = str.replace("[^0-9])
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) < 48 || str.charAt(i) > 57 || str.charAt(i) == 32) {
                        str =  str.substring(i).replaceAll("[\\D]", "");
                      //  str = str.substring(0, i) + str.substring(i + 1);
                    } else{
                      str= str.substring(0, i) + str.substring(i + 1);

                    }
                }

                return str;
            }
        }

        return null;
    }
}
