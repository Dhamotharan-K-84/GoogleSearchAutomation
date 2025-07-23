package com.automation;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String str = sc.nextLine();
    	System.setProperty("webdriver.chrome.driver", "S:\\.eclipse\\Selenium\\GoogleSearchAutomation\\Webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(str);

        searchBox.submit();

        try {
            Thread.sleep(300000);
        } catch (InterruptedException ex) {
        }

        System.out.println("Title: " + driver.getTitle());

        driver.quit();
        sc.close();
    }
}
