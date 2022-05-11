public class StringToLetterAlgorithm {

    public String getStringToLetterAlgorithm(String str){
        if (str != null){
            str = str.trim();
        }
        if (str.length()!= 0){
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) > 64 && str.charAt(i) < 91 || str.charAt(i) > 96 && str.charAt(i) < 123){
                    str.charAt(i);
                } else {
                    str = str.replace(str.substring(i),"");
                }
            }

            return str;

        }
        return null;
    }

}
