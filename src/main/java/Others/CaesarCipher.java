package Others;

public class CaesarCipher {

    public StringBuffer shiftEncrypt(String text, int shift) {
        StringBuffer result = new StringBuffer();

        /*
            The key is the character value for A-Z is 65-90 and a-z is 97-122
         */

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char character = (char)(((int)text.charAt(i) + shift - 65) % 26 + 65);
                result.append(character);
            } else {
                char character = (char)(((int)text.charAt(i) + shift - 97) % 26 + 97);
                result.append(character);
            }
        }

        return result;
    }
}
