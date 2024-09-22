package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println(title);

        driver.get("https://www.syntaxprojects.com");
        String title2 = driver.getTitle();
        System.out.println(title2);

         driver.navigate().back();
         Thread.sleep(2000);
         driver.navigate().refresh();

         driver.quit();
    }
}
