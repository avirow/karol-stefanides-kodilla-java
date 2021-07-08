package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String FACEBOOK_URL = "https://www.facebook.com/";
    public static final String FACEBOOK_COOKIES_ACCEPT = "//*[@data-testid='cookie-policy-dialog-accept-button']";
    public static final String FACEBOOK_REGISTER = "//*[@data-testid='open-registration-form-button']";
    public static final String DAY_OF_BIRTH = "//*[@id=\"day\"]";
    public static final String MONTH_OF_BIRTH = "//*[@id=\"month\"]";
    public static final String YEAR_OF_BIRTH = "//*[@id=\"year\"]";


    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(FACEBOOK_URL);

        WebElement cookies = driver.findElement(By.xpath(FACEBOOK_COOKIES_ACCEPT));
        cookies.click();

        while (!driver.findElement(By.xpath(FACEBOOK_REGISTER)).isDisplayed());

        WebElement register = driver.findElement(By.xpath(FACEBOOK_REGISTER));
        register.click();

        while (!driver.findElement(By.xpath(DAY_OF_BIRTH)).isDisplayed());

        WebElement dayOfBirth = driver.findElement(By.xpath(DAY_OF_BIRTH));
        Select selectDay = new Select(dayOfBirth);
        selectDay.selectByValue("3");

        WebElement monthOfBirth = driver.findElement(By.xpath(MONTH_OF_BIRTH));
        Select selectMonth = new Select(monthOfBirth);
        selectMonth.selectByValue("8");

        WebElement yearOfBirth = driver.findElement(By.xpath(YEAR_OF_BIRTH));
        Select selectYear = new Select(yearOfBirth);
        selectYear.selectByValue("1999");
    }
}
