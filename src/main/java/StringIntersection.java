public class StringIntersection {

    /**
     * Написать алгоритм StringIntersection,  который принимает на вход 2 строки и возвращает общее вхождение в этих строках
     * Test Data:
     * “Carrot”, “carwash” → “car”
     * “Noob”, “Schmooze” → “oo”
     */

    public String findStringIntersection(String input1, String input2) {
        String output = "";
        if (input1 != null && input2 != null) {
            input1 = input1.trim();
            input2 = input2.trim();
            ;
            if (input1.length() != 0 && input2.length() != 0) {
                input1 = input1.toLowerCase();
                input2 = input2.toLowerCase();
            }
            for (int i = 0, j =0 ; i < input1.length(); i++, j++) {

                    if (input1.contentEquals(input2)) {
                        output = output + input1.charAt(i);
                    }


            }
            return output;
        }

        return null;
    }
}
