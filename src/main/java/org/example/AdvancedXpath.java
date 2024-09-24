package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/advanceXpath-homework.php");

        WebElement book1 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        book1.sendKeys("The Women");

        WebElement book2 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        book2.sendKeys("Harry Potter");

        WebElement book3 = driver.findElement(By.xpath("//input[@id='least-favorite']"));
        book3.sendKeys("The God of the Woods");

        WebElement favBook = driver.findElement(By.xpath("//input[@id='favouriteBook']"));
        favBook.sendKeys("The God of the Woods");

        WebElement favBook2 = driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
        favBook2.sendKeys("Harry Potter");

        WebElement favBook3 = driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
        favBook3.sendKeys("The Women");

        WebElement grand = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        grand.sendKeys("grandparent");

        WebElement parent = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parent.sendKeys("parent");

        WebElement child = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        child.sendKeys("child");
    }
}
