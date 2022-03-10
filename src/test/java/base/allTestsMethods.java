package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class allTestsMethods {

    /*---------------------------------------------------------------------
     * Method getURLFromProperties() to read url from properties by key
     *---------------------------------------------------------------------*/
    public static String getURLFromProperties(String file, String key) throws IOException {

        Properties urlProps = new Properties();
        urlProps.load(new FileInputStream(file));
        String url = urlProps.getProperty(key);
        return url;
    }

    /*---------------------------------------------------------------------
     * Method to extract digits from string
     *---------------------------------------------------------------------*/

    public static String extractDigits(String str) {

        StringBuilder sb = new StringBuilder(str.length());

        int strLength= str.length();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c > 47 && c < 58){
                sb.append(c);;
            }
        }
        return sb.toString();
    }



}
