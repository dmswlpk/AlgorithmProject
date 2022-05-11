public class StringToLettersAndSpaces {

    public String getStringToLetterAndSpacesAlgorithm(String str) {
        /**Написать 4 алгоритма StringToLetters, StringToLettersAndSpaces, StringToNumbers,
         * StringToNumbersAndSpaces следуя примеру на сайте: https://allcalc.ru/node/2030
         Каждый алгоритм принимает строку,  и удаляет ненужные символы:*/
        if (str != null) {
            if (str.length() != 0) {
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) > 64 && str.charAt(i) < 91 || str.charAt(i) > 96 && str.charAt(i) < 123
                            || str.charAt(i) == 32) {
                    } else {
                        str = str.substring(0, i) + str.substring(i + 1);
                    }
                }

                return str;
            }
        }

        return null;
    }
}




