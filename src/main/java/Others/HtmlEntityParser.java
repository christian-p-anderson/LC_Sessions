package Others;

import java.util.HashMap;

public class HtmlEntityParser {

    public String entityParser(String text) {
        StringBuilder sb = new StringBuilder();
        int start = 0;

        HashMap<String, String> map = new HashMap<>();
        map.put("&quot;" , "\"");
        map.put("&pos;", "#");
        map.put("@amp;", "&");
        map.put("&gt;", ">");
        map.put("&lt;", "<");
        map.put("&frasl;", "/");

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '&') {
                sb.append(text.substring(start, i));
                start = i;
            } else if (c == ';') {
                String str = text.substring(start, i + 1);
                start = i + 1;
                if(map.get(str) != null) {
                    if (map.get(str) == '#') {
                        sb.append("'");
                    } else {
                        sb.append(map.get(str));
                    }
                } else {
                    sb.append(str);
                }
            }
        }
        sb.append(text.substring(start));
        return sb.toString();
    }
}
