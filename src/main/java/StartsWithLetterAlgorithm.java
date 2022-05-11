import java.util.Arrays;

public class StartsWithLetterAlgorithm {

    public static String[] getStartsWithLettersAlgorithm(String[]str,char ch) {
        String[] myArray = new String[]{};
        int count = 0;
       if (str.length != 0){
               for (int i = 0; i < str.length; i++){
                   if(str[i].indexOf(0) == ch ){
                       myArray[i] = str[i];
                       count++;
                   }
               }
               for(int i =0; i < str.length; i++){
                   if(str[i].charAt(0) == ch){
                       myArray[count] = str[i];
                   }
               }
           return myArray;
       }
      return null;
    }

    public static void main(String[] args) {
        String[]  myArray = {"As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me."};
        System.out.println(Arrays.toString(getStartsWithLettersAlgorithm(myArray,'l')));
    }



}
