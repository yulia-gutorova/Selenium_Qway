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



}
