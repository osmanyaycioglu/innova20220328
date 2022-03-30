package com.training.java.statics;


public class StringUtil {
    
    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty() || str.isBlank();
    }
    
    public static boolean isNotEmpty(String str) {
        return str != null &&  !str.isEmpty();
    }

    public static String concat(boolean putSpace,String... str) {
        StringBuilder strBuilder = new StringBuilder(100);
        for (int iLoc = 0; iLoc < str.length; iLoc++) {
            strBuilder.append(str[iLoc]);
            if (putSpace) {
                strBuilder.append(" ");
            }
        }
        return strBuilder.toString();
    }
}
