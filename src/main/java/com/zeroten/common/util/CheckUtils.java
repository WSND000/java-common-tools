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

    public static boolean isEmpty(Object[] arr) {
        boolean flag = false;
            if (arr==null||arr.length==0) {
                flag = true;
            }
        return flag;
    }

    public static boolean equals(String str1, String str2) {
        boolean flag = false;
        if (str1==str2){
            flag = true;
        }else if(str1==null||str2==null){
            flag = false;
        }
        return flag;
    }
    public static boolean equals2(Integer n1, Integer n2) {
        boolean flag = false;
        if (n1.equals(n2)){
            flag = true;
        }else if(n1==null||n2==null){
            flag = false;
        }
        return flag;
    }

}
