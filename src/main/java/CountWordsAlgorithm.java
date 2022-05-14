/**
 * Напишите алгоритм CountWords, который принимает на вход текст и слово,
 * и считает все вариации этого слова в тексте:
 */
public class CountWordsAlgorithm {

    public int countWordsInText(String text, String str) {

        //    int countWords = 0;
        //    if (str != null) {
        //        str = str.trim().toLowerCase();
        //        if (str.length() != 0) {
        //            if (text.length != 0) {

        //                for (int i = 0; i < text.length; i++) {

        //                    if (text(str)) {
        //                        return countWords++;

        //                    }


        //                }
        //                return countWords;
        //            }
        //            return -1;

        //        }
        //    }
        //    return -1;
        //}
        String[] myArray = new String[]{};
        if (text != null && str != null) {
            text = text.toLowerCase().replace(",", " ");

            if (text.length() != 0) {
                for (int i = 0; i < text.length(); i++) {
                    myArray = text.split(" ");
                }
                int countWords = 0;
                for (int i = 0; i < myArray.length; i++) {
                    if (myArray[i].contentEquals(str)) {
                        countWords++;
                    }

                }

                return countWords;
            }
        }

        return -1;

    }
}