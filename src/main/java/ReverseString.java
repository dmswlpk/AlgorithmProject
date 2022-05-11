public class ReverseString {

    public String reverseString(String str){
        char[] letters = new char[str.length()];
        int letterIndex = 0;
        if(str != null){
            str = str.trim();
            if(str.length() != 0){
                for (int i = str.length() - 1; i >= 0; i--){
                    letters[letterIndex] = str.charAt(i);
                    letterIndex++;
                }

                String reverse = "";
                for(int i = 0; i < str.length(); i++){
                    reverse += letters[i];
                }

                return reverse;
            }
        }

        return null;
    }
}
