package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebElementCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");


//        1. Retrieve Attribute:
//        - Retrieve the text "inspect me to view my custom attribute" from the element and print it on the console, ensuring the text is correct.
            WebElement div = driver.findElement(By.xpath("//div[@id='textattr']"));
            String customAtt = div.getAttribute("data-text-attr");
            System.out.println(customAtt);

//        2. Meal Preference:
//        - Choose the checkbox for the meal preference "Musical Festival," ensuring the checkbox is enabled before clicking on it.
//                - Ensure that the option for "Tech Talk" is disabled.
//        - Click on "Show More Options" and ensure the "Art Exhibition" option is displayed, then click on it.
        List<WebElement> mealPref = driver.findElements(By.xpath("//input[@name='MealRadio']"));
        WebElement showMoreOptions = driver.findElement(By.xpath("//button[@onclick='toggleHiddenRadio(event)']"));
        for (WebElement meal:mealPref){
            if(meal.getAttribute("value").equals("music_festival")){
                System.out.println(meal.isEnabled());
                meal.click();
            } else if (meal.getAttribute("value").equals("tech_talk")) {
                System.out.println(meal.isEnabled());
                showMoreOptions.click();
            }else if(meal.getAttribute("value").equals("art_exhibition")){
                System.out.println(meal.isEnabled());
                meal.click();
            }
        }
//
//        3. Mystery Message:
//        - Retrieve the value of the attribute `title` from the element containing the text "Hover me to reveal the secret" and print it on the console.
            WebElement mysteryMess = driver.findElement(By.xpath("//div[@id='hidden_message']"));
            String message = mysteryMess.getAttribute("title");
            System.out.println(message);

//        Option Box:
//        - If "Checkbox 1" is enabled, click on it.
//        - Ensure that "Checkbox 2" is disabled.---
        List<WebElement> optBoxes = driver.findElements(By.xpath("//div[@class='checkbox']//input"));
        for (WebElement option:optBoxes){
            if (option.getAttribute("value").equals("CheckboxFirst")){
                option.click();
            } else if (option.getAttribute("value").equals("disabledCheckbox")){
                System.out.println(option.isEnabled());
            }
        }
//
//                5. Input Field:
//        - clear the text in the input box and send the text "here is the custom text entered" using selenium commands.
        WebElement inputField = driver.findElement(By.xpath("//input[@id='inputField']"));
        inputField.clear();
        Thread.sleep(2000);
        inputField.sendKeys("here is the custom text entered");

    }
}
