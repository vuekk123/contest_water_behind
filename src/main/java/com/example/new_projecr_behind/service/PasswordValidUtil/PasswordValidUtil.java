package com.example.new_projecr_behind.service.PasswordValidUtil;

import org.springframework.stereotype.Service;

@Service
public class PasswordValidUtil {
    public static String PasswordVaildUtil(String password) {
        StringBuilder result = new StringBuilder();

        if (!isValidLength(password)) {
            result.append("密码长度必须大于8位.\n");
        }

        if (!containsUppercase(password)) {
            result.append("密码必须含有一个大写字母.\n");
        }

        if (!containsNumber(password)) {
            result.append("密码必须包含一个数字.\n");
        }

        return result.toString().trim();
    }

    private static boolean isValidLength(String password) {
        return password.length() >= 8;
    }

    private static boolean containsUppercase(String password) {
        return !password.equals(password.toLowerCase());
    }

    private static boolean containsNumber(String password) {
        return password.matches(".*\\d.*");
    }
}
