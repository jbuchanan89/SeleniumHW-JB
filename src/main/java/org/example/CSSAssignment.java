package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");

        WebElement userID = driver.findElement(By.cssSelector("input#UserID"));
        userID.sendKeys("Jedrfasdfa");

        WebElement userName = driver.findElement(By.cssSelector("input#UserName"));
        userName.sendKeys("Jbuchanan");

        WebElement lectureIntro = driver.findElement(By.cssSelector("input[name^='LectureIntro']"));
        lectureIntro.sendKeys("Intro to Lecture");

        WebElement rayFeedback = driver.findElement(By.cssSelector("input#FeedbackFromRay"));
        rayFeedback.sendKeys("It was great!");

        WebElement duckyFeedback = driver.findElement(By.cssSelector("input#FeedbackfromDucky"));
        duckyFeedback.sendKeys("It was terrible");

        WebElement clientID = driver.findElement(By.cssSelector("input[name^='ClientID']"));
        clientID.sendKeys("423423423432423");

        WebElement email = driver.findElement(By.cssSelector("input[name^='email']"));
        email.sendKeys("hello@gmail.com");

        WebElement courseTopic = driver.findElement(By.cssSelector("input[name^='CourseTopic']"));
        courseTopic.sendKeys("Testing");
    }
}
