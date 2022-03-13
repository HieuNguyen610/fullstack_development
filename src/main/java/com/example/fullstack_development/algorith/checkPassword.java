package com.example.fullstack_development.algorith;

import java.util.Arrays;

public class checkPassword {

    public static void main(String[] args) {
        System.out.println(checkStrongPassword("Aabc1!"));
    }

    public static boolean checkStrongPassword(String password) {
        if(password.length()<6){
            return false;
        }
        String p = "\\.[]{}()<>*+-=!?^$|";
        char[]s = password.toCharArray();
        System.out.println(s);
        boolean kt1 = false;
        boolean kt2 = false;
        boolean kt3 = false;
        boolean kt4 = false;
        for (int i=0; i<password.length(); i++)
        {
            if (s[i] >= 65 && s[i] <= 90)
                kt1 = true;
            if (s[i] >= 97 && s[i] <= 122)
                kt2 = true;
            if (s[i] >= 48 && s[i] <= 57)
                kt4 = true;
            if (p.matches(password))
                kt3 = true;
        }
        System.out.println(kt1);
        System.out.println(kt2);
        System.out.println(kt3);
        System.out.println(kt4);
        return kt1 && kt2 && kt3 && kt4;
    }
}
