package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.WatchEvent;
import java.util.List;

public class MultiSelectSelectDD {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");

//        1. Select List Demo:
//        - Use the **Select** class to select the option **"Pear"** from the dropdown.
//                - You can use any method from the **Select** class (e.g., `selectByVisibleText`, `selectByValue`, `selectByIndex`).
//        - Use the **getOptions** method to retrieve all options from the dropdown and print them on the console.
        WebElement favFruit = driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));
        Select sel = new Select(favFruit);
        sel.selectByValue("Pear");
        List<WebElement> allOptions = sel.getOptions();

        for(WebElement option: allOptions){
            System.out.println(option.getText());
        }

//
//        2. Select Multiple Options:
//        - First, verify that the **Select** dropdown is multi-select by checking the dropdown’s properties.
            WebElement hobbies = driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));
            Select sel2 = new Select(hobbies);
            boolean multiple = sel2.isMultiple();
            System.out.println(multiple);

//        - Using the **Select** class, make the following selections:
//        - **Traveling**
//        - **Cooking**
//        - **Gardening**
            sel2.selectByValue("Traveling");
            sel2.selectByValue("Cooking");
            sel2.selectByValue("Gardening");
//        - Click the **"Get All Selected"** button and print the result on the console.
            WebElement getAllButton = driver.findElement(By.xpath("//button[@id='get_all']"));
            getAllButton.click();
            List<WebElement> selectedOptions = sel2.getAllSelectedOptions();
            for(WebElement selected:selectedOptions){
                System.out.println(selected.getText());
            }

//        - After a delay of 5 seconds, deselect the **Traveling** option using the **Select** class.
            Thread.sleep(5000);
            sel2.deselectByValue("Traveling");
            getAllButton.click();
            List<WebElement> selectedOptions2 = sel2.getAllSelectedOptions();
            for(WebElement selected:selectedOptions2){
            System.out.println(selected.getText());
        }


//        - Click the **"Get All Selected"** button again and print the result on the console.
    }
}
