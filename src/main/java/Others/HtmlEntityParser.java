package Others;

import java.util.HashMap;

public class HtmlEntityParser {

    public String entityParser(String text) {
        char[] textArr = text.toCharArray();
        int j = 0;
        StringBuilder result = new StringBuilder();
        HashMap<String,String> map = new HashMap();

        //Initialize map
        map.put("quot","\"");
        map.put("apos","\'");
        map.put("amp","&");
        map.put("gt",">");
        map.put("lt","<");
        map.put("frasl","/");


        for(int i = 0 ; i < textArr.length; i++){
            if(textArr[i] == '&'){
                StringBuilder sb = new StringBuilder();
                j = i + 1;
                while( j < textArr.length && textArr[j] != ';'){
                    sb.append(textArr[j]);
                    j++;
                }
                String tempStr = sb.toString();
                if(map.get(tempStr) != null){
                    result.append(map.get(tempStr));
                    i = j;
                } else {
                    result.append('&');
                }
            } else {
                result.append(textArr[i]);
            }
        }
        return result.toString();
    }
}
