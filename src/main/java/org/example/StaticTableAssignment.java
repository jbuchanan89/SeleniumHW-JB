package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticTableAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/table-search-filter-demo-homework.php");

//        1. **Print All Entries with the Country "USA"**:
//   - Dynamically search the table for entries where the country is **"USA"**.
//   - Print all the rows matching criteria
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));


        List<WebElement> allData = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[3]"));
        int count = 1;
        for (WebElement data: allData){
            String country = data.getText();
            if(country.equals("USA")){
                WebElement rowInfo = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr[" +count+"]"));
                System.out.println(rowInfo.getText());
            }
            count=count+1;
        }

//2. **Dynamic Logic**:
//   - Ensure the search and filtering logic is **dynamic** and does not rely on hard-coded xpaths.
//   - The code should be flexible enough to accommodate changes in the country name
//   - If the country name changes (e.g., from "USA" to "Canada"), the same logic should still work, and the output should reflect the correct entries based on the updated country.
    }
}
