package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");

        WebElement B1 = driver.findElement(By.xpath("//a[@class='btn btn-primary followeasy']"));
        WebElement B2 = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        B1.click();
        driver.switchTo().activeElement();
        Thread.sleep(5000);
        WebElement header2 = driver.findElement(By.xpath("//div[2]/div/div[1]/h2"));
        String text = header2.getText();
        System.out.println(text);
    }
}
