package pages.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import utils.Properties;


public class LoginPage extends BasePage{
  //  private WebDriver driver;

    private By email = By.xpath(".//*[@id='email']");
    private By password = By.id("passwd");
    private By submit = By.name("submitLogin");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void open(){
        driver.get(Properties.getDefaultUrl());
    }

    public void fillEmailInput(String emailInput){
        elementWait(email);
        driver.findElement(email).sendKeys(emailInput);
    }
    public void fillPasswordInput(String passwordInput){
        elementWait(password);
        driver.findElement(password).sendKeys(passwordInput);
    }
    public void submit(){
        elementWait(submit);
        driver.findElement(submit).click();
    }

}
