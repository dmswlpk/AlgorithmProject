public class RemoveDuplicates {
    public String removeDuplicates(String input) {
        String output = "";
        if (input != null) {
            input = input.trim();
            if (input.length() != 0) {
                input = input.toLowerCase();
                for (int i = 0; i < input.length(); i++) {
                    if (!output.contains(input.substring(i, i + 1))) {
                        output = output + input.substring(i, i + 1);
                    }
                }

                return output;
            }
        }

        return "Error";
    }
}
