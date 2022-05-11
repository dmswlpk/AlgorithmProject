public class MyStringToNumbersAlgorithm {

    public int[] convertToIntArray(String str) {

        int count = 0;
        String[] myStringArray = new String[]{};
        if (str != null) {
            str = str.trim();
            if (str.length() != 0) {
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                        count++;
                        str = str.replace(", ", "");
                        myStringArray = str.split("");
                    }

                }
                int[] array = new int[count];
                for (int i = 0; i < myStringArray.length; i++) {
                    array[i] = Integer.parseInt(myStringArray[i]);
                }

                return array;
            }
        }

        return new int[]{};
    }
}

