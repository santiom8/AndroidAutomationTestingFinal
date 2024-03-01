package org.example.utils.tests;

import org.example.screens.SigningScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KiwiTests extends BaseTest {

    @Test
    public void tryTermsOfUse() {

        SigningScreen signingScreen = openSigningScreen();
        signingScreen.waitSomeSeconds(30);
        Assert.assertEquals(signingScreen.verifySigninTitle(), true);

    }

}
