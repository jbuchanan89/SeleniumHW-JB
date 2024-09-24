package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/advanceXpath-homework.php");

        WebElement hobbies = driver.findElement(By.xpath("//input[@id='yourHobbiesId']"));
        hobbies.sendKeys("Hiking");

        WebElement clickHere = driver.findElement(By.xpath("//button[@id='display_text']"));
        clickHere.click();

        WebElement favoriteMovies = driver.findElement(By.xpath("//input[@id='favoriteMoviesId']"));
        favoriteMovies.sendKeys("Free Willy");

        WebElement paragraph = driver.findElement(By.xpath("//label[contains(text(), 'amet consectetur adipisicing elit')]"));
        String fullText = paragraph.getText();
        System.out.println(fullText);

        WebElement city = driver.findElement(By.xpath("//input[@id='yourCity']"));
        city.sendKeys("Falls Church");

        WebElement personalEmail = driver.findElement(By.xpath("//input[@id='private_email_id']"));
        personalEmail.sendKeys("Jbuchanan@gmail.com");

        WebElement officeEmail = driver.findElement(By.xpath("//input[@id='office_email_id']"));
        officeEmail.sendKeys("Jbuchanan@work.com");

        WebElement professionalEmail = driver.findElement(By.xpath("//input[@id='professional_email_id']"));
        professionalEmail.sendKeys("Jbuchanan@prof.com");

        WebElement clientName = driver.findElement(By.xpath("//input[@id='clientName' and  @type='text']"));
        clientName.sendKeys("Client Name");

        WebElement clientID = driver.findElement(By.xpath("//input[@id='clientId' and  @type='text']"));
        clientID.sendKeys("1213123123");

        WebElement streetNo = driver.findElement(By.xpath("//input[@name='StreetNo' and  @type='text']"));
        streetNo.sendKeys("445");

        WebElement houseNo = driver.findElement(By.xpath("//input[@name='HouseNo' and  @type='text']"));
        houseNo.sendKeys("78903");
    }
}
