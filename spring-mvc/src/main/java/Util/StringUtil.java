package Util;

import java.util.UUID;

public class StringUtil {

    public static String renameFileName(String fileName){
        int dotIndex = fileName.lastIndexOf(".");
        String suffix = fileName.substring(dotIndex);
        return UUID.randomUUID().toString()+suffix;
    }
}
