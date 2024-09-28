package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");

//        1. Choose Your Favorite Beverage:
//        - Select the Juice radio button from the list of favorite beverages.
        List<WebElement> beverages = driver.findElements(By.xpath("//input[@name='beverage']"));
        for(WebElement beverage:beverages){
            if(beverage.getAttribute("value").equals("Juice")){
                beverage.click();
            }
        }

//        2. Preferred Working Environment:
//        - Retrieve all radio buttons in the Preferred Working Environment section.
//                - Traverse through the list of radio buttons in code and select the Hybrid option.
        List<WebElement> workEnvironments= driver.findElements(By.xpath("//input[@name='working_enviroment']"));
        for(WebElement workEnvironment:workEnvironments){
            if (workEnvironment.getAttribute("value").equals("hybrid")){
                workEnvironment.click();
            }
        }
//        3. Choose Your Favorite Season:
//        - If the Spring radio button is disabled, click on the "Enable Buttons" button.
//                - Ensure that the Spring option is now enabled, then select it.
//        - By default, the Winter radio button is hidden. Ensure, through code, that it is not displayed initially. Then click on the "Show Buttons" button.
//                - Verify that the Winter option is displayed after clicking and is available for selection.

        List<WebElement> seasons = driver.findElements(By.xpath("//input[@name='season']"));
        WebElement enableButton = driver.findElement(By.xpath("//button[@id='enabledFruitradio']"));
        WebElement showButton = driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
        for(WebElement season:seasons){
            if (season.getAttribute("value").equals("spring")){
                System.out.println(season.isEnabled());
                enableButton.click();
                System.out.println(season.isEnabled());
                season.click();
            } else if(season.getAttribute("value").equals("winter")){
                if(!season.isDisplayed()){
                    showButton.click();
                }
            }
        }
//
//        4. Choose Your Favorite Meal:
//        - Select the Lunch radio button from the list of favorite meals.
        List<WebElement> favoriteMeals = driver.findElements(By.xpath("//input[@name='meal']"));
        for (WebElement favoriteMeal:favoriteMeals){
            if(favoriteMeal.getAttribute("value").equals("lunch")){
                favoriteMeal.click();
            }

        }
    }
}
