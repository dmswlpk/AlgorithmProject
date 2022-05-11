import java.util.Arrays;

public class CountWordsAlgorithm {

    public static int countWordsInText(String[] array, String str) {
        int countWords = 0;
        if (array.length != 0) {
            if (str != null) {
                str = str.trim().toLowerCase();
            }
            if (str.length() != 0) {

                for (int i = 0; i < array.length; i++) {

                    if (array[i].toLowerCase().contains(str));{
                        System.out.println(Arrays.toString(array));
                        countWords++;
                    }
                }

                return countWords;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String [] array = {"As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are " +
                "the current long-term support (LTS) versions. Oracle released the last zero-cost public " +
                "update for the legacy version Java 8 LTS in January 2019 for commercial java use, although it " +
                "will otherwise still support Java 8 with public updates for personal use indefinitely. " +
                "Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still " +
                "receiving security and other upgrades."};
        System.out.println(countWordsInText(array, "java"));
    }

}
