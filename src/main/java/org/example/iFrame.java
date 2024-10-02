package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class iFrame {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");

//    1. Select Age Checkbox:
//   - Select the **Age** checkbox.
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='dropdownIframe']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='checkboxIframe']")));
        WebElement ageCheck = driver.findElement(By.xpath("//input[@type='checkbox']"));
        ageCheck.click();
        driver.switchTo().defaultContent();
//2. **Select City**:
//   - Select any city from the dropdown.
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='dropdownIframe']")));
        List<WebElement> cities = driver.findElements(By.xpath("//select[@id='cities']/option"));
        for(WebElement city:cities){
            String text = city.getText();
            if(text.equals("Houston")){
                city.click();
            }
        }
        driver.switchTo().defaultContent();

//3. **Enter Username**:
//   -enter your username in the **Username** field.
        driver.switchTo().frame(0);
        WebElement usernameField = driver.findElement(By.xpath("//input[@name='Username']"));
        usernameField.sendKeys("TEST");
        driver.switchTo().defaultContent();
    }
}
