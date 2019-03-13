import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class Guru99HomePage {

    WebDriver driver;

    @FindBy(xpath="//table//tr[@class='heading3']")

    WebElement homePageUserName;

    @FindBy (linkText = "Manager")

    WebElement linkManager;

    @FindBy (linkText = "Log out")

    WebElement logOut;

    public Guru99HomePage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    //Get the User name from Home Page

    public String getHomePageDashboardUserName(){

        return    homePageUserName.getText();

    }

    public String getLinkManager(){

        return linkManager.getText();
    }

    public void switchFrame(int x){

        driver.switchTo().frame(x).findElement(By.id("dk1")).click();

    }

    public void logOut(){

        logOut.click();

        this.mgmAlert();

    }

    public void mgmAlert(){

        Alert alert = driver.switchTo().alert();

        alert.accept();
    }
}