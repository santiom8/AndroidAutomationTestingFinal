package org.example.utils.tests;

import org.example.enums.MenuEnums;
import org.example.screens.SigningScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KiwiTests extends BaseTest {

    @Test
    public void tryTermsOfUse() {

        SigningScreen signingScreen = openSigningScreen();
        signingScreen.waitSomeSeconds(20);
        Assert.assertEquals(signingScreen.verifySigningTitle(), true);
        Assert.assertEquals(signingScreen.verifyWebButton(), true);
        signingScreen.clickMenuItem(MenuEnums.WEBVIEW);
        signingScreen.clickMenuItem(MenuEnums.LOGIN);
        signingScreen.clickMenuItem(MenuEnums.FORMS);
        signingScreen.clickMenuItem(MenuEnums.SWIPE);
        signingScreen.clickMenuItem(MenuEnums.DRAG);
    }

}
