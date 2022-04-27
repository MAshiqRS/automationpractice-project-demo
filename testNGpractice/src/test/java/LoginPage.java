import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {
    WebDriver driver;
    @FindBy(className = "login")
    WebElement btnLogin;
    @FindBy(id = "email")
    WebElement txtEmail;
    @FindBy(id= "passwd")
    WebElement txtPass;
    @FindBy(id = "SubmitLogin")
    WebElement btnSubmit;
    @FindBy(className = "logout")
    WebElement btnLogout;
    @FindBy(className = "header_user_info")
    List<WebElement> lblUsername;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    public String loggingIn(){
        btnLogin.click();
        txtEmail.sendKeys("ashiq@rahman.com");
        txtPass.sendKeys("12345asdfg");
        btnSubmit.click();
        //btnLogout.isDisplayed();
        return lblUsername.get(0).getText();
    }

}
