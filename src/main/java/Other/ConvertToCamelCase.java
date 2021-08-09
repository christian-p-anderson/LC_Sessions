package Other;

import java.util.Locale;

public class ConvertToCamelCase {

    public String toCamelCase(String str) {
        //split the string to an array of individual words
        String[] words = str.split(" ");

        //instantiate StringBuilder
        StringBuilder builder = new StringBuilder();

        //loop through each word in the words array
        //the first word should be all lower case
            //every remaining words are lower case except the first char | the first char is upper case
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if(i == 0) {
                word = word.toLowerCase();
            } else {
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
            }

            builder.append(word);
        }

        return builder.toString();
    }



}
