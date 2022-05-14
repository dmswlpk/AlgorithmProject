public class StartsWithLetterAlgorithm {

    public String[] getStartsWithLettersAlgorithm(String str, char ch) {
        //    String[] myArray = new String[]{};
        //    int count = 0;
        //    if (str != null) {
        //        str = str.trim().toLowerCase().replace(",", " ");
        //        str = str.replace("\n", " ");
        //        for (int i = 0; i < str.length(); i++) {
        //            myArray = str.split(" ");
        //        }

        //        String[] newArray = new String[]{};

        //        for (int i = 0; i < myArray.length; i++) {
        //            if (myArray[i].toString().charAt(0) == ch) {
        //                count++;
        //                newArray[count] = myArray[i];

        //            }
        //        }

        //        return newArray;
        //    }

        //  return null;
        //}
        int count = 0;
        String[] myArray = new String[]{};
        if (str.charAt(0) == ch) {
            count++;
        }

        return myArray;


    }
}
