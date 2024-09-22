package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/locator-homework.php");

        WebElement fullName = driver.findElement(By.id("fullName"));
        fullName.sendKeys("Jennifer Buchanan");

        WebElement email = driver.findElement(By.id("yourEmail"));
        email.sendKeys("jenniferb.1230@gmail.com");

        WebElement clientName = driver.findElement(By.id("clientNameId"));
        clientName.sendKeys("JBuchanan");

        WebElement clientId = driver.findElement(By.id("ClientId"));
        clientId.sendKeys("55454545");

        WebElement clientFeedback = driver.findElement(By.id("ClientfeedbackId"));
        clientFeedback.sendKeys("Positive");

        WebElement projectName = driver.findElement(By.id("ProjectNameId"));
        projectName.sendKeys("Project Test");

        WebElement projectDeadline = driver.findElement(By.id("ProjectTimeId"));
        projectDeadline.sendKeys("9/30/2024");

        WebElement  currentAddress =driver.findElement(By.id("CurrentAddressId"));
        currentAddress.sendKeys("Falls Church, VA");

        WebElement permanentAddress = driver.findElement(By.id("PermanentAddressId"));
        permanentAddress.sendKeys("Vienna, VA");

        WebElement submitButton = driver.findElement(By.id("btn-submit"));
        submitButton.click();
    }
}
