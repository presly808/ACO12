package ua.artcode.taxi.utils;

import java.util.*;

/**
 * Created by serhii on 25.04.16.
 */
public class StringUtils {

    // got from the internet
    // python-like string formatting
    //"There's an incorrect value '%(value)s' in column # %(column)d" % \ { 'value': x, 'column': y }
    public static String dictFormat(String format, Map<String, Object> values) {
        StringBuilder convFormat = new StringBuilder(format);
        Set<String> keys = values.keySet();
        List valueList = new ArrayList();
        int currentPos = 1;

        for (String k : keys) {
            String key = k,
                    formatKey = "%(" + key + ")",
                    formatPos = "%" + Integer.toString(currentPos) + "$";
            int index = -1;
            while ((index = convFormat.indexOf(formatKey, index)) != -1) {
                convFormat.replace(index, index + formatKey.length(), formatPos);
                index += formatPos.length();
            }
            valueList.add(values.get(key));
            ++currentPos;
        }
        return String.format(convFormat.toString(), valueList.toArray());
    }

    public static void main(String[] args) {
        Map<String,Object> keys = new HashMap<>();
        keys.put("name", "Serhii");
        keys.put("age", 23);
        keys.put("salary", 23.3434);
        String formatted = dictFormat("My name is %(name)s, age %(age)d, salary %(salary)f", keys);

        System.out.println(formatted.equals("My name is Serhii, age 23"));
        System.out.println(formatted);
    }

}
