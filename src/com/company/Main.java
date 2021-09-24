package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/"); Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com/"); Thread.sleep(3000);
        driver.navigate().refresh();  Thread.sleep(3000);
        driver.navigate().back(); Thread.sleep(3000);
        driver.navigate().forward(); Thread.sleep(3000);

        driver.close();
    }
}
