package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxesAssignment {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");

        //1. Subscribe to Newsletter:
//   - Check if the "Subscribe to Newsletter" checkbox is enabled, and then click on it.
        WebElement subNews = driver.findElement(By.xpath("//input[@id='newsletter']"));
        boolean isChecked = subNews.isSelected();
        System.out.println(isChecked);
        if(!isChecked){
            subNews.click();
        }
//
//2.Select Your Hobbies:
//   - Retrieve the list of all checkboxes in the **Select Your Hobbies** section.
//   - Traverse through the list and select the **Reading** and **Cooking** checkboxes.
        List<WebElement> allHobbies = driver.findElements(By.xpath("//input[@class='cb-element']"));
        for(WebElement hobbies:allHobbies){
            String valueOfHobbie = hobbies.getAttribute("id");
            if (valueOfHobbie.equals("reading") || valueOfHobbie.equals("cooking")) {
                hobbies.click();
            }
        }

//3. Select Your Interests:
//   - Verify that the **Support** and **Music** checkboxes are not displayed by default.
//   - Click on the "Show Checkboxes" button, and then select the **Music** checkbox.

        WebElement interestSection = driver.findElement(By.xpath("//div[@class='interest_section']"));
        boolean isNotDisplayed = true;
        WebElement button = driver.findElement(By.xpath("//button[@id='toggleCheckboxButtons']"));
        List<WebElement> allInterest = driver.findElements(By.xpath("//input[@value='Support' or @value='Music']"));
        for (WebElement interest:allInterest) {
            if (!interestSection.isDisplayed()) {
                isNotDisplayed = false;
            } else {
                isNotDisplayed = true;
            }
            if (!isNotDisplayed) {
                button.click();
                Thread.sleep(2000);
                WebElement music = driver.findElement(By.xpath("//input[@value='Music']"));
                music.click();
                }

            }
        }
//
//4. Preferences:
//   - Verify that the **Receive Notifications** checkbox is disabled.
//   - Click on the "Enable Checkboxes" button, and then select the **Receive Notifications** checkbox.

    }

