public class StringToNumbersAlgorithm {

    public String getStringToNumbersAlgorithm(String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() != 0) {
                for (int i = 0; i < str.length(); i++) {
                    if (!Character.isDigit(i)) {
                        str = str.replace("[0-9]", "");
                    } else {
                        str = str.substring(i);
                    }

                }return str;
            }
        }

        return null;
    }

}
