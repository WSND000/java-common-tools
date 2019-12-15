package com.zeroten.common.util;

public class CheckUtils {

    public static boolean isAnyEmpty(String... strings) {
        boolean flag = false;
        for (String str:strings) {
            if (str == null) {
                break;
            } else {
                flag = true;
            }
        }
        return flag;
    }
}
