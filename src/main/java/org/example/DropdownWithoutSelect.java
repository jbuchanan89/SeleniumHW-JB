package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropdownWithoutSelect {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");

//     1. Choose Your Dream Fruit:
        WebElement chooseFruit = driver.findElement(By.xpath("//div[@id='dream_fruits']"));
        chooseFruit.click();
//   - Retrieve all options from the "Choose your Dream Fruit" dropdown.
        List<WebElement> dreamFruitList = driver.findElements(By.xpath("//div[@class='dropdown open']/ul/li/a"));
//   - Traverse through the list of options, and select **Mango**.
        for(WebElement dreamFruit:dreamFruitList){
            String fruit = dreamFruit.getText();
            if(fruit.equals("Mango")){
                dreamFruit.click();
            }
        }
//   - Ensure that the selection process is done by iterating through the options and not by directly clicking on the option using Xpath or any direct locator to the item.
//

//2. Choose Your Favorite Hobby:
//   - Retrieve all options from the "Choose your Favorite Hobby" dropdown.
        WebElement hobbieListDD = driver.findElement(By.xpath("//div[@id='favorite_hobbies']"));
        hobbieListDD.click();
        List<WebElement> hobbieList = driver.findElements(By.xpath("//ul[@class='dropdown-menu multi-dropdown-menu']/li/a"));
//   - Traverse through the list and select **Reading**.
        for (WebElement hobbie:hobbieList){
            String text = hobbie.getText();
            if (text.equals("Reading")){
                hobbie.click();
            }
        }

//   - Ensure that the desired option is selected by iterating through the options, not by directly clicking on it using Xpath or any other direct locator to the item.
    }
}
