import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestRunner extends Setup {
    @Test
    public void userLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        driver.get("http://automationpractice.com/");
        String name = loginPage.loggingIn();
        System.out.println(name);
        Assert.assertEquals(name,"Ashiq Rahman");
        Assert.assertTrue(name.contains("Ashiq Rahman"),String.valueOf(true));
        Assert.assertTrue(loginPage.btnLogout.isDisplayed(),String.valueOf(true));

        Thread.sleep(5000);
        loginPage.btnLogout.click();
    }
}
