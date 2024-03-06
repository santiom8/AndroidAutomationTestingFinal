package org.example.data;
import org.testng.annotations.DataProvider;

import java.util.Random;

public class DataProviderLogin {

    @DataProvider(name = "login-and-password-random")
    public static Object[][] testDataValidLogIn() {
        return new Object[][] {
                {
                        generateRandomString(6)+"@gmail.com",
                        generateRandomString(8)
                }
        };
    }

    private static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder alphabet =  new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            String character = (char) ('a' + random.nextInt(26)) + "";
            alphabet.append(character);
        }
        return alphabet.toString();
    }
}

