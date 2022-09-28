package testcases;

import basetest.BaseTest;
import junit.framework.Assert;

import org.testng.annotations.Test;


public class TC_LoginTest_001 extends BaseTest {

    private String expectedTitle = "Guru99 Bank Manager HomePage";

    @Test
    public void loginTest001() throws InterruptedException {

        loginPage.setUserName(txtUserName);
        loginPage.setPassword(txtPasword);
        Thread.sleep(2000);
        loginPage.clickBtnLogin();
        String actualTitle = driver.getTitle();
        System.out.println(expectedTitle);
        System.out.println(actualTitle);
        if (driver.getTitle().equals(expectedTitle)) {
            Assert.assertTrue("Test Passed", true);
            logger.info("Test has Passed");
        } else {
            Assert.assertTrue("Test Failed", false);
            logger.info("Test has failed ");
        }
    }
}
